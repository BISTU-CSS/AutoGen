package com.autogen.controller;

import com.alibaba.fastjson.JSONObject;
import com.autogen.dao.entity.Information;
import com.autogen.dao.entity.JsonResult;
import com.autogen.dao.entity.input.Concent;
import com.autogen.dao.entity.input.InputInformation;
import com.autogen.dao.entity.input.QuestionNaire;
import com.autogen.service.InformationService;
import com.autogen.service.Service1;
import com.autogen.util.Convert;
import com.autogen.util.MyJSON;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class atgController {
    @Autowired
    Service1 service1;


//    private static QuestionNaire questionNaire = new QuestionNaire();

    @PostMapping("/json")
    public void json(@RequestBody JSONObject data) throws Exception {
        QuestionNaire questionNaire = new QuestionNaire();
        MyJSON.parsingJSON(data, questionNaire);
        Concent concent = Convert.convertToSence(questionNaire);
////      System.out.println(questionNaire);
//        System.out.println(concent);
//        System.out.println(JSONObject.toJSONString(concent));
        service1.BasicTemplate(questionNaire, concent);
        service1.generate();
    }

    @PostMapping("/test")
    public void test(@RequestBody JSONObject data) throws Exception {
        QuestionNaire questionNaire = new QuestionNaire();
        Concent concent = new Concent();
        MyJSON.parsingJSON(data, concent);
        service1.BasicTemplate(questionNaire, concent);
        service1.generate();
    }

    @RequestMapping("/api/download")
    public ResponseEntity<Object> download(@RequestBody JSONObject data) throws Exception {
        //提供下载的文件的路径
        QuestionNaire questionNaire = new QuestionNaire();
        MyJSON.parsingJSON(data, questionNaire);
        Concent concent = Convert.convertToSence(questionNaire);
//        System.out.println(data);
//        System.out.println(concent.getWlhtxList());
//        System.out.println(concent.getWlhtxList().size());
        service1.BasicTemplate(questionNaire, concent);
        service1.generate();
        FileSystemResource file = new FileSystemResource("/home/ubuntu/Desktop/code_package/complete_example.docx");
//        FileSystemResource file = new FileSystemResource("D:\\IDEA\\AutoGen\\example.docx");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        //这里定制下载文件的名称
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getFilename()));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.contentLength())
                .contentType(MediaType.parseMediaType("application/octet-stream"))//以二进制流的形式返回
                .body(new InputStreamResource(file.getInputStream()));
    }

    @RequestMapping("/api/SBQDdownload")
    public ResponseEntity<Object> SBQDdownload(@RequestBody JSONObject data) throws Exception {
        //提供下载的文件的路径
        QuestionNaire questionNaire = new QuestionNaire();
        MyJSON.parsingJSON(data,questionNaire);
        informationService.exportSBQD(questionNaire.getSbqd(),questionNaire.getSys_name());
        FileSystemResource file = new FileSystemResource("/home/ubuntu/Desktop/code_package/设备清单.xlsx");
//        FileSystemResource file = new FileSystemResource("D:\\IDEA\\AutoGen\\设备清单.xlsx");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        //这里定制下载文件的名称
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getFilename()));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.contentLength())
                .contentType(MediaType.parseMediaType("application/octet-stream"))//以二进制流的形式返回
                .body(new InputStreamResource(file.getInputStream()));
    }

    @Autowired
    InformationService informationService;

    @PostMapping("/api/createQuestionnaire")
    public JsonResult createQuestionnaire(@RequestBody JSONObject data) throws Exception {
        InputInformation information = new InputInformation();
        MyJSON.parsingJSON(data, information);
        int res = informationService.createQuestionnaire(information);
        if (res == 1) {
            return new JsonResult(null, "error");
        } else {
            return new JsonResult(null, "ok");
        }
    }

    @GetMapping("/api/getQuestionnaireList")
    public JsonResult getQuestionnaireList() {
        try {
            List<InputInformation> list = informationService.getQuestionnaireList();
            return new JsonResult(list, "ok");
        }catch (Exception e){
            return new JsonResult(null, "error");
        }
    }

    @PostMapping("/api/getQuestionnaireResult")
    public JsonResult getQuestionnaireResult(@RequestBody JSONObject data) {
        InputInformation information = new InputInformation();
        MyJSON.parsingJSON(data, information);
        String str = informationService.getQuestionnaireResult(information);
        if (str.equals("error")){
            return new JsonResult(null, "error");
        }else {
            JSONObject res =  JSONObject.parseObject(str);
            return new JsonResult(res, "ok");
        }
    }

    @PostMapping("/api/saveQuestionnaireResult")
    public JsonResult saveQuestionnaireResult(@RequestBody JSONObject data) {
        QuestionNaire questionNaire = new QuestionNaire();
        MyJSON.parsingJSON(data, questionNaire);
        int res = informationService.saveQuestionnaireResult(data);
        if (res == 1){
            return new JsonResult(null, "error");
        }else {
            return new JsonResult(null, "ok");
        }
    }

}
