package com.autogen.service;

import com.autogen.dao.entity.BasicTemplate;
import com.autogen.dao.entity.QuestionNaire;
import com.autogen.service.atgInterface.AutoGenerator;
import com.autogen.service.atgInterface.AutoGeneratorImpl;
import com.autogen.service.fileapi.IOManager;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.stereotype.Service;

import java.io.IOException;

public class mainService {

    public static void main(String[] args) throws IOException {
        //获取调研表并处理
        QuestionNaire questionNaire = new QuestionNaire();
        questionNaire.question_1 = "北京市医疗";
        questionNaire.question_2 = "北京市医院公司";
        questionNaire.question_3 = "通州机房";

        BasicTemplate basicTemplate = new BasicTemplate(questionNaire,null);

        AutoGenerator autogen = new AutoGeneratorImpl();
        XWPFDocument doc1 = autogen.chapter_one_generator(basicTemplate.getC1());
        XWPFDocument doc2 = autogen.chapter_two_generator(basicTemplate.getC2());
        XWPFDocument doc5 = autogen.chapter_five_generator(basicTemplate.getC5());

        IOManager.writeFile(doc2,"example2.docx");
    }
}
