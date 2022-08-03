package com.autogen.service.atgInterface;

import com.autogen.dao.entity.cp1.Chaptre1input;
import com.autogen.dao.entity.cp2.Chaptre2input;
import com.autogen.dao.entity.cp3.Chaptre3input;
import com.autogen.dao.entity.cp4.Chaptre4input;
import com.autogen.dao.entity.cp5.Chaptre5input;
import com.autogen.dao.entity.cp6.Chaptre6input;
import com.autogen.dao.entity.cp7.Chaptre7input;
import com.autogen.dao.entity.cp8.Chaptre8input;
import com.autogen.service.fileapi.IOManager;
import com.autogen.service.officeapi.ReplaceSymbol;
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.data.NumberingFormat;
import com.deepoove.poi.data.NumberingRenderData;
import com.deepoove.poi.data.Numberings;
import com.deepoove.poi.data.Pictures;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.util.HashMap;

public class AutoGeneratorImpl implements AutoGenerator {


    @Override
    public XWPFDocument chapter_one_generator(Chaptre1input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("/etc/autogen/1.docx");
        //XWPFDocument doc = IOManager.readFile("D:\\IDEA\\AutoGen\\src\\main\\resources\\WordTemplate\\1.docx");
        //第一章仅需要系统名称
        XWPFTemplate template = XWPFTemplate.compile(doc);
        template.render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_two_generator(Chaptre2input input) throws IOException {
        //TODO:预先需要选择对应的章节里面的内容（从数据库中）
        XWPFDocument doc = IOManager.readFile("/etc/autogen/2.docx");
        //XWPFDocument doc = IOManager.readFile("D:\\IDEA\\AutoGen\\src\\main\\resources\\WordTemplate\\2.docx");
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("table213", policy).bind("table25", policy).build();
        XWPFTemplate template = XWPFTemplate.compile(doc, config).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.table213, input.table213List);
            put(ReplaceSymbol.table25, input.table25List);
            put(ReplaceSymbol.staff, input.staff);
            put(ReplaceSymbol.s222, input.s222);
            put(ReplaceSymbol.business, input.business);
            put(ReplaceSymbol.db, input.db);
            put(ReplaceSymbol.os, input.os);
            put(ReplaceSymbol.s25, input.s25);
            put(ReplaceSymbol.system_name, input.system_name);

        }});
        XWPFTemplate template2 = XWPFTemplate.compile(template.getXWPFDocument()).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
        }});
        return template2.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_three_generator(Chaptre3input input) throws IOException {

        XWPFDocument doc = IOManager.readFile("/etc/autogen/3.docx");
        //XWPFDocument doc = IOManager.readFile("D:\\IDEA\\AutoGen\\src\\main\\resources\\WordTemplate\\3.docx");
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("table311",policy).bind("table312",policy)
                .bind("table313",policy).bind("table314",policy).build();
        XWPFTemplate template = XWPFTemplate.compile(doc,config).render(new HashMap<String, Object>() {
            {
                put(ReplaceSymbol.system_name, input.system_name);
                put(ReplaceSymbol.s315,input.s315);
                put(ReplaceSymbol.wulifengxian,input.list311);
                put(ReplaceSymbol.wuliyingyong,input.list311);
                put(ReplaceSymbol.wangluofengxian,input.list312);
                put(ReplaceSymbol.wangluoyingyong,input.list312);
                put(ReplaceSymbol.jisuanfengxian,input.list313);
                put(ReplaceSymbol.jisuanyingyong,input.list313);
                put(ReplaceSymbol.yingyongfengxian,input.list314);
                put(ReplaceSymbol.yingyongyingyong,input.list314);
                put(ReplaceSymbol.table311,input.table311List);
                put(ReplaceSymbol.table312,input.table312List);
                put(ReplaceSymbol.table313,input.table313List);
                put(ReplaceSymbol.table314,input.table314List);
            }
        });
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_four_generator(Chaptre4input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("/etc/autogen/4.docx");
        //XWPFDocument doc = IOManager.readFile("D:\\IDEA\\AutoGen\\src\\main\\resources\\WordTemplate\\4.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_five_generator(Chaptre5input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("/etc/autogen/5.docx");
        //XWPFDocument doc = IOManager.readFile("src/main/resources/WordTemplate/5.docx");
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("table52", policy).bind("table53",policy).bind("table54",policy)
                .bind("table55",policy).bind("table58",policy).build();
        XWPFTemplate template = XWPFTemplate.compile(doc, config).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
            put(ReplaceSymbol.s51,input.s51);
            put(ReplaceSymbol.img51,Pictures.ofLocal(input.img51).create());
            put(ReplaceSymbol.list51,input.list51);
            put(ReplaceSymbol.wuli,input.list52);
            put(ReplaceSymbol.table52,input.table52List);
            put(ReplaceSymbol.wangluo,input.list53);
            put(ReplaceSymbol.table53,input.table53List);
            put(ReplaceSymbol.jisuan,input.list54);
            put(ReplaceSymbol.table54,input.table54List);
            put(ReplaceSymbol.yingyong,input.list55);
            put(ReplaceSymbol.table55,input.table55List);
            put(ReplaceSymbol.table58,input.table58List);

        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_six_generator(Chaptre6input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("/etc/autogen/6.docx");
        //XWPFDocument doc = IOManager.readFile("D:\\IDEA\\AutoGen\\src\\main\\resources\\WordTemplate\\6.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc);
        template.render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
            put(ReplaceSymbol.s6,input.s6);
        }});
        XWPFTemplate template2 = XWPFTemplate.compile(template.getXWPFDocument()).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
        }});
        return template2.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_seven_generator(Chaptre7input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("/etc/autogen/7.docx");
        //XWPFDocument doc = IOManager.readFile("D:\\IDEA\\AutoGen\\src\\main\\resources\\WordTemplate\\7.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc);
        template.render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_eight_generator(Chaptre8input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("/etc/autogen/8.docx");
        //XWPFDocument doc = IOManager.readFile("D:\\IDEA\\AutoGen\\src\\main\\resources\\WordTemplate\\8.docx");
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("table8", policy).build();
        XWPFTemplate template = XWPFTemplate.compile(doc,config);
        template.render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
            put(ReplaceSymbol.table8,input.table8List);
        }});
        return template.getXWPFDocument();
    }

}
