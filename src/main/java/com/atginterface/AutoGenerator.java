package com.atginterface;


import com.Entity.cp1.Chaptre1input;
import com.Entity.cp2.Chaptre2input;
import com.Entity.cp3.Chaptre3input;
import com.Entity.cp5.Chaptre5input;
import com.deepoove.poi.xwpf.NiceXWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;

public interface AutoGenerator {

    XWPFDocument chapter_one_generator(Chaptre1input input) throws IOException;

    XWPFDocument chapter_two_generator(Chaptre2input input) throws IOException;

    XWPFDocument chapter_three_generator(Chaptre3input input) throws IOException;


    XWPFDocument chapter_five_generator(Chaptre5input input) throws IOException;
}
