package com.autogen.service.atgInterface;

import com.autogen.dao.entity.cp1.Chaptre1input;
import com.autogen.dao.entity.cp2.Chaptre2input;
import com.autogen.dao.entity.cp3.Chaptre3input;
import com.autogen.dao.entity.cp4.Chaptre4input;
import com.autogen.dao.entity.cp5.Chaptre5input;
import com.autogen.dao.entity.cp6.Chaptre6input;
import com.autogen.dao.entity.cp7.Chaptre7input;
import com.autogen.dao.entity.cp8.Chaptre8input;
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.data.NumberingFormat;
import com.deepoove.poi.data.NumberingRenderData;
import com.deepoove.poi.data.Numberings;
import com.deepoove.poi.data.ParagraphRenderData;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import com.autogen.service.fileapi.IOManager;
import com.autogen.service.officeapi.ReplaceSymbol;
import com.deepoove.poi.xwpf.NumFormat;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AutoGeneratorImpl implements AutoGenerator {


    @Override
    public XWPFDocument chapter_one_generator(Chaptre1input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("WordTemplate/1.docx");
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
        XWPFDocument doc = IOManager.readFile("WordTemplate/2.docx");
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

        XWPFDocument doc = IOManager.readFile("WordTemplate/3.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc).render(new HashMap<String, Object>() {
            {
                put(ReplaceSymbol.system_name, input.system_name);
                put(ReplaceSymbol.s315,input.s315);

                Numberings.NumberingBuilder nb1a = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                input.list311a.forEach(s -> nb1a.addItem(s));
                NumberingRenderData nrd1a = nb1a.create();
                put(ReplaceSymbol.list311a, nrd1a);

                Numberings.NumberingBuilder nb1b = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                input.list311b.forEach(s -> nb1b.addItem(s));
                NumberingRenderData nrd1b = nb1b.create();
                put(ReplaceSymbol.list311b, nrd1b);

                Numberings.NumberingBuilder nb2a = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                input.list312a.forEach(s -> nb2a.addItem(s));
                NumberingRenderData nrd2a = nb2a.create();
                put(ReplaceSymbol.list312a, nrd2a);

                Numberings.NumberingBuilder nb2b = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                input.list312b.forEach(s -> nb2b.addItem(s));
                NumberingRenderData nrd2b = nb2b.create();
                put(ReplaceSymbol.list312b, nrd2b);

                Numberings.NumberingBuilder nb3a = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                input.list313a.forEach(s -> nb3a.addItem(s));
                NumberingRenderData nrd3a = nb3a.create();
                put(ReplaceSymbol.list313a, nrd3a);

                Numberings.NumberingBuilder nb3b = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                input.list313b.forEach(s -> nb3b.addItem(s));
                NumberingRenderData nrd3b = nb3b.create();
                put(ReplaceSymbol.list313b, nrd3b);

                Numberings.NumberingBuilder nb4a = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                input.list314a.forEach(s -> nb4a.addItem(s));
                NumberingRenderData nrd4a = nb4a.create();
                put(ReplaceSymbol.list314a, nrd4a);

                Numberings.NumberingBuilder nb4b = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                input.list314b.forEach(s -> nb4b.addItem(s));
                NumberingRenderData nrd4b = nb4b.create();
                put(ReplaceSymbol.list314b, nrd4b);


            }
        });
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_four_generator(Chaptre4input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("WordTemplate/4.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_five_generator(Chaptre5input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("WordTemplate/5.docx");
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("table55", policy).build();
        XWPFTemplate template = XWPFTemplate.compile(doc, config).render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
            put(ReplaceSymbol.s51,input.s51);
            put(ReplaceSymbol.s531,input.s531);

            Numberings.NumberingBuilder nb1 = Numberings.of(NumberingFormat.DECIMAL);
            input.list531.forEach(s -> nb1.addItem(s));
            NumberingRenderData nrd1 = nb1.create();
            put(ReplaceSymbol.list531, nrd1);

            put(ReplaceSymbol.wangluo,input.list532);

            Numberings.NumberingBuilder nb3 = Numberings.of(NumberingFormat.DECIMAL);
            input.list533.forEach(s -> nb3.addItem(s));
            NumberingRenderData nrd3 = nb3.create();
            put(ReplaceSymbol.list533, nrd3);

            Numberings.NumberingBuilder nb4 = Numberings.of(NumberingFormat.DECIMAL);
            input.list534.forEach(s -> nb4.addItem(s));
            NumberingRenderData nrd4 = nb4.create();
            put(ReplaceSymbol.list534, nrd4);

            put(ReplaceSymbol.table55,input.table55List);


        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_six_generator(Chaptre6input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("WordTemplate/6.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc);
        template.render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
            put(ReplaceSymbol.s6,input.s6);

        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_seven_generator(Chaptre7input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("WordTemplate/7.docx");
        XWPFTemplate template = XWPFTemplate.compile(doc);
        template.render(new HashMap<String, Object>() {{
            put(ReplaceSymbol.system_name, input.system_name);
        }});
        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_eight_generator(Chaptre8input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("WordTemplate/8.docx");
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
