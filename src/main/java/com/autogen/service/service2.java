package com.autogen.service;

import com.autogen.dao.Mapper.ScenceMapper;
import com.autogen.dao.entity.QuestionNaire;
import com.autogen.service.fileapi.IOManager;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class service2 {

    public static void main(String[] args) throws Exception {
        XWPFDocument doc = IOManager.readFile("/etc/autogen/1.docx");
       IOManager.writeFile(doc, "/etc/autogen/aaaa.docx");
    }
}
