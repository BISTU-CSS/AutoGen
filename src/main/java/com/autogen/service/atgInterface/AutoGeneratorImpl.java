package com.autogen.service.atgInterface;

import com.autogen.dao.entity.cp1.Chaptre1input;
import com.autogen.dao.entity.cp2.Chaptre2input;
import com.autogen.dao.entity.cp3.Chaptre3input;
import com.autogen.dao.entity.cp4.Chaptre4input;
import com.autogen.dao.entity.cp5.Chaptre5input;
import com.autogen.dao.entity.cp6.Chaptre6input;
import com.autogen.dao.entity.cp7.Chaptre7input;
import com.autogen.service.fileapi.IOManager;
import com.autogen.service.officeapi.ReplaceSymbol;
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.data.*;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class AutoGeneratorImpl implements AutoGenerator {

//    String path = "/home/ubuntu/fangan/autogen/filetemplate/";
    String path = "D:\\桌面\\auto\\AutoGen\\src\\main\\resources\\WordTemplate\\";

    @Override
    public XWPFDocument chapter_one_generator(Chaptre1input input) throws IOException {
        XWPFDocument doc = IOManager.readFile(path + "1.docx");
        //第一章仅需要系统名称
        XWPFTemplate template = XWPFTemplate.compile(doc);
        template.render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.sys_name, input.sys_name);
            put(ReplaceSymbol.sys_unit, input.sys_unit);
            put(ReplaceSymbol.sys_date, input.sys_date);
            put(ReplaceSymbol.s1, input.s1);
        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_two_generator(Chaptre2input input) throws IOException {
        //TODO:预先需要选择对应的章节里面的内容（从数据库中）
        XWPFDocument doc = IOManager.readFile(path + "2.docx");
        LoopRowTableRenderPolicy policy1 = new LoopRowTableRenderPolicy();
        LoopRowTableRenderPolicy policy2 = new LoopRowTableRenderPolicy(true);
        Configure config = Configure.builder().bind("table22", policy1).bind("table23", policy1)
                .bind("table241", policy2).bind("table242", policy2)
                .bind("table243", policy2).bind("table244", policy2)
                .bind("table25", policy1)
                .bind("table261", policy2).bind("table262", policy2)
                .bind("table263", policy2).bind("table264", policy2).bind("table265", policy2)
                .bind("table27", policy1).bind("table28", policy1)
                .bind("table21", policy1).build();
        XWPFTemplate template = XWPFTemplate.compile(doc, config).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.sys_name, input.sys_name);
            put(ReplaceSymbol.sys_unit, input.sys_unit);
            put(ReplaceSymbol.sys_xtjs, input.sys_xtjs);
            put(ReplaceSymbol.sys_xtjg, input.sys_xtjg);
            put(ReplaceSymbol.sys_dwdz, input.sys_dwdz);
            put(ReplaceSymbol.sys_dbsj, input.sys_dbsj);
            put(ReplaceSymbol.sys_sxsj, input.sys_sxsj);
            put(ReplaceSymbol.sys_cpjg, input.sys_cpjg);
            put(ReplaceSymbol.sys_dbjb, input.sys_dbjb);
            put(ReplaceSymbol.sys_mpsc, input.sys_mpsc);
            put(ReplaceSymbol.sys_mmzd, input.sys_mmzd);
            put(ReplaceSymbol.sys_ysbs, input.sys_ysbs);
            put(ReplaceSymbol.sys_rzys, input.sys_rzys);
            put(ReplaceSymbol.sys_xtfw, input.sys_xtfw);
            put(ReplaceSymbol.sys_fwd, input.sys_fwd);
            put(ReplaceSymbol.sys_ydd, input.sys_ydd);
            put(ReplaceSymbol.sys_djbh, input.sys_djbh);

            put(ReplaceSymbol.table21, input.table21List);

            put(ReplaceSymbol.table22, input.table22List);
            put(ReplaceSymbol.table23, input.table23List);
//            put(ReplaceSymbol.table241, input.table241List);
//            put(ReplaceSymbol.table242, input.table242List);
//            put(ReplaceSymbol.table243, input.table243List);
//            put(ReplaceSymbol.table244, input.table244List);
            put(ReplaceSymbol.table25, input.table25List);
            put(ReplaceSymbol.table261, input.table261List);
            put(ReplaceSymbol.table262, input.table262List);
            put(ReplaceSymbol.table263, input.table263List);
            put(ReplaceSymbol.table264, input.table264List);
            put(ReplaceSymbol.table265, input.table265List);
            put(ReplaceSymbol.table27, input.table27List);
            put(ReplaceSymbol.table28, input.table28List);
            put(ReplaceSymbol.s26, input.s26);
        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_three_generator(Chaptre3input input) throws IOException {

        XWPFDocument doc = IOManager.readFile(path + "3.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc).render(new HashMap<String,Object>(){{
            put(ReplaceSymbol.risk,input.risk);
        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_four_generator(Chaptre4input input) throws IOException {
        XWPFDocument doc = IOManager.readFile(path + "4.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.sys_name, input.sys_name);
        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_five_generator(Chaptre5input input) throws IOException {
        XWPFDocument doc = IOManager.readFile(path + "5.docx");
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("table51", policy).bind("table52", policy).bind("table53", policy).bind("table54", policy)
                .bind("table57", policy).bind("table58", policy).bind("table59", policy).bind("table510", policy).bind("table511", policy)
                .bind("table512",policy).bind("table513",policy).build();
//        XWPFTemplate template =  XWPFTemplate.compile(doc,config).render(input);
        XWPFTemplate template = XWPFTemplate.compile(doc, config).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.sys_name, input.sys_name);
            put(ReplaceSymbol.s51, input.s51);
//            put(ReplaceSymbol.img51, Pictures.ofLocal(input.img51).create());
            put(ReplaceSymbol.solution, input.solution);
            put(ReplaceSymbol.table57, input.table57List);
            put(ReplaceSymbol.table58, input.table58List);
            put(ReplaceSymbol.table59, input.table59List);
            put(ReplaceSymbol.table510, input.table510List);
            put(ReplaceSymbol.table511, input.table511List);
//            System.out.println(input.table512List);
            put(ReplaceSymbol.table512, input.table512List);
            put(ReplaceSymbol.table513, input.table513List);

            put(ReplaceSymbol.s582, input.s582);

        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_six_generator(Chaptre6input input) throws IOException {
        XWPFDocument doc = IOManager.readFile(path + "6.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc);
        template.render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.sys_name, input.system_name);
            put(ReplaceSymbol.s6, input.s6);
        }});
        XWPFTemplate template2 = XWPFTemplate.compile(template.getXWPFDocument()).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.sys_name, input.system_name);
        }});
        return template2.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_seven_generator(Chaptre7input input) throws IOException {
        XWPFDocument doc = IOManager.readFile(path + "7.docx");
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("table8", policy).build();
        XWPFTemplate template = XWPFTemplate.compile(doc, config);
        template.render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.sys_name, input.system_name);
            put(ReplaceSymbol.table8, input.table8List);
        }});
        return template.getXWPFDocument();
    }


}
