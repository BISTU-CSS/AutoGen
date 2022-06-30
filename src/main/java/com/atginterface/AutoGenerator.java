package com.atginterface;


import com.Entity.cp1.Chaptre1input;
import com.Entity.cp2.Chaptre2input;
import com.Entity.cp3.Chaptre3input;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public interface AutoGenerator {



    XWPFDocument chapter_one_generator(Chaptre1input input);

    XWPFDocument chapter_two_generator(Chaptre2input input);

    XWPFDocument chapter_three_generator(Chaptre3input input);


}
