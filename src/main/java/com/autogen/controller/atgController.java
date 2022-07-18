package com.autogen.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.autogen.dao.Mapper.ScenceMapper;
import com.autogen.dao.entity.QuestionNaire;
import com.autogen.dao.entity.ScencePo;
import com.autogen.service.Service1;
import com.autogen.service.Service1Impl;
import com.autogen.service.atgInterface.AutoGenerator;
import com.autogen.service.atgInterface.AutoGeneratorImpl;
import com.autogen.service.mainService;
import com.autogen.util.MyJSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.reflection.OptionalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class atgController {




    @PostMapping("/api/demo")
    public String demo(@RequestBody() JSONObject data){
        List<String>list = new ArrayList<>();
        list.add("52-01-1");
        list.add("52-01-2");
        list.add("52-01-3");
        list.add("52-01-4");
        list.add("52-01-5");
        list.add("52-02-1");
        list.add("52-02-2");
        list.add("52-02-3");
        list.add("52-02-4");
        list.add("52-02-5");
        System.out.println(list);
        for (String s : list){
            if (s.indexOf("52-01") == 0){
                System.out.println(s);
            }
        }
        return "ok";
    }
//    @Autowired
//    private ScenceMapper scenceMapper;
    @Autowired
    Service1 service1;

    @PostMapping("/json")
    public void json(@RequestBody JSONObject data) throws Exception {
        QuestionNaire questionNaire = MyJSON.parsingJSON(data);
        service1.BasicTemplate(questionNaire,null);
        service1.generate();

    }


    @RequestMapping("/download")
    public ResponseEntity<Object> download(@RequestBody JSONObject data) throws Exception {
        //提供下载的文件的路径
        QuestionNaire questionNaire = MyJSON.parsingJSON(data);
        service1.BasicTemplate(questionNaire,null);
        service1.generate();
        FileSystemResource file = new FileSystemResource("complete_example.docx");
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


}
