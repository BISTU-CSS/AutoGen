package com.atginterface;

import com.Entity.cp1.Chaptre1input;
import com.Entity.cp2.Chaptre2input;
import com.Entity.cp3.Chaptre3input;
import com.fileapi.IOManager;
import com.officeapi.ReplaceSymbol;
import com.officeapi.WordUtil;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.util.HashMap;

public class AutoGeneratorImpl implements AutoGenerator{


    @Override
    public XWPFDocument chapter_one_generator(Chaptre1input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("WordTemplate/" + "1.docx");
        //第一章仅需要系统名称
        XWPFDocument result = WordUtil.replace_wildcards(doc,new HashMap<String, Object>(){{
            put(ReplaceSymbol.system_name,input.system_name);
        }});

        return result;
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
