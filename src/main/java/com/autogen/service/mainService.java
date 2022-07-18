package com.autogen.service;

import com.autogen.dao.entity.QuestionNaire;
import com.autogen.service.atgInterface.AutoGenerator;
import com.autogen.service.atgInterface.AutoGeneratorImpl;
import com.autogen.service.fileapi.IOManager;
import com.deepoove.poi.xwpf.NiceXWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.stereotype.Service;

public class mainService {


    public static void main(QuestionNaire questionNaire) throws Exception {
        //获取调研表并处理

//
//        BasicTemplate basicTemplate = new BasicTemplate(questionNaire,null);
//
//        AutoGenerator autogen = new AutoGeneratorImpl();
//        XWPFDocument doc1 = autogen.chapter_one_generator(basicTemplate.getC1());
//        XWPFDocument doc2 = autogen.chapter_two_generator(basicTemplate.getC2());
//        XWPFDocument doc3 = autogen.chapter_three_generator(basicTemplate.getC3());
//        XWPFDocument doc4 = autogen.chapter_four_generator(basicTemplate.getC4());
//        XWPFDocument doc5 = autogen.chapter_five_generator(basicTemplate.getC5());
//        XWPFDocument doc6 = autogen.chapter_six_generator(basicTemplate.getC6());
//        XWPFDocument doc7 = autogen.chapter_seven_generator(basicTemplate.getC7());
//        XWPFDocument doc8 = autogen.chapter_eight_generator(basicTemplate.getC8());
//
//        NiceXWPFDocument completeDoc = IOManager.mergeFile((NiceXWPFDocument) doc1, (NiceXWPFDocument) doc2, (NiceXWPFDocument) doc3, (NiceXWPFDocument) doc4, (NiceXWPFDocument) doc5, (NiceXWPFDocument) doc6, (NiceXWPFDocument) doc7, (NiceXWPFDocument) doc8);
//        IOManager.writeFile(completeDoc,"complete_example.docx");

    }
}
