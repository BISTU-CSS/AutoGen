package com.atginterface;

import com.Entity.cp1.Chaptre1input;
import com.Entity.cp2.Chaptre2input;
import com.Entity.cp3.Chaptre3input;
import com.fileapi.IOManager;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;

public class AutoGeneratorImpl implements AutoGenerator{


    @Override
    public XWPFDocument chapter_one_generator(Chaptre1input input) throws IOException {
        IOManager.readFile("WordTemplate/1.docx");

        return null;
    }

    @Override
    public XWPFDocument chapter_two_generator(Chaptre2input input) {

        return null;
    }

    @Override
    public XWPFDocument chapter_three_generator(Chaptre3input input) {

        return null;
    }

}
