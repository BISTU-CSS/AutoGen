package com.atginterface;

import com.Entity.cp1.Chaptre1input;
import com.Entity.cp2.Chaptre2input;
import com.Entity.cp2.fragment.SystemUserUsageTable;
import com.Entity.cp3.Chaptre3input;
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import com.fileapi.IOManager;
import com.officeapi.ReplaceSymbol;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AutoGeneratorImpl implements AutoGenerator{


    @Override
    public XWPFDocument chapter_one_generator(Chaptre1input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("WordTemplate/1.docx");
        //第一章仅需要系统名称
        XWPFTemplate template  = XWPFTemplate.compile(doc);
        template.render(new HashMap<String, Object>(){{
            put(ReplaceSymbol.system_name,input.system_name);}});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_two_generator(Chaptre2input input) throws IOException {
        //TODO:预先需要选择对应的章节里面的内容（从数据库中）
        XWPFDocument doc = IOManager.readFile("WordTemplate/2.docx");
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("table213", policy).build();
        XWPFTemplate template = XWPFTemplate.compile(doc, config).render(new HashMap<String, Object>() {{
            put("table213", input.systemUserUsageTableList);
            put(ReplaceSymbol.system_name,input.system_name);
        }});

        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_three_generator(Chaptre3input input) {

        return null;
    }

}
