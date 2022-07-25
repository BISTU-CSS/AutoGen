package com.autogen.controller;

import com.alibaba.fastjson.JSONObject;
import com.autogen.dao.entity.QuestionNaire;
import com.autogen.service.Service1;
import com.autogen.util.MyJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class atgController {
    @Autowired
    Service1 service1;

    @PostMapping("/json")
    public void json(@RequestBody JSONObject data) throws Exception {

        QuestionNaire questionNaire = new QuestionNaire();
        MyJSON.parsingJSON(data, questionNaire);
        service1.BasicTemplate(questionNaire, null);
        service1.generate();
    }


    @RequestMapping("/api/download")
    public ResponseEntity<Object> download(@RequestBody JSONObject data) throws Exception {
        //提供下载的文件的路径
        QuestionNaire questionNaire = new QuestionNaire();
        MyJSON.parsingJSON(data, questionNaire);
        service1.BasicTemplate(questionNaire, null);
        service1.generate();
        FileSystemResource file = new FileSystemResource("/home/ubuntu/Desktop/code_package/complete_example.docx");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        //这里定制下载文件的名称
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getFilename()));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        System.out.println(file.getFilename());
        System.out.println(headers);

        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.contentLength())
                .contentType(MediaType.parseMediaType("application/octet-stream"))//以二进制流的形式返回
                .body(new InputStreamResource(file.getInputStream()));
    }


}
