package com.autogen.service.atgInterface;


import com.autogen.dao.entity.cp1.Chaptre1input;
import com.autogen.dao.entity.cp2.Chaptre2input;
import com.autogen.dao.entity.cp3.Chaptre3input;
import com.autogen.dao.entity.cp4.Chaptre4input;
import com.autogen.dao.entity.cp5.Chaptre5input;
import com.autogen.dao.entity.cp6.Chaptre6input;
import com.autogen.dao.entity.cp7.Chaptre7input;
import com.autogen.dao.entity.cp8.Chaptre8input;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;

public interface AutoGenerator {

    XWPFDocument chapter_one_generator(Chaptre1input input) throws IOException;

    XWPFDocument chapter_two_generator(Chaptre2input input) throws IOException;

    XWPFDocument chapter_three_generator(Chaptre3input input) throws IOException;

    XWPFDocument chapter_four_generator(Chaptre4input input) throws IOException;

    XWPFDocument chapter_five_generator(Chaptre5input input) throws IOException;

    XWPFDocument chapter_six_generator(Chaptre6input input) throws IOException;

    XWPFDocument chapter_seven_generator(Chaptre7input input) throws IOException;

    XWPFDocument chapter_eight_generator(Chaptre8input input) throws IOException;
}
