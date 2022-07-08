package com.atginterface;

import com.Entity.cp1.Chaptre1input;
import com.Entity.cp2.Chaptre2input;
import com.Entity.cp3.Chaptre3input;
import com.Entity.cp5.Chaptre5input;
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.data.Numberings;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import com.fileapi.IOManager;
import com.officeapi.ReplaceSymbol;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.util.HashMap;

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
        Configure config = Configure.builder().bind("table213", policy).build();
        XWPFTemplate template = XWPFTemplate.compile(doc, config).render(new HashMap<String, Object>() {{
            put("table213", input.systemUserUsageTableList);
            put(ReplaceSymbol.system_name, input.system_name);
        }});

        return template.getXWPFDocument();
    }

    @Override
    public XWPFDocument chapter_three_generator(Chaptre3input input) {

        return null;
    }

    @Override
    public XWPFDocument chapter_five_generator(Chaptre5input input) throws IOException {
        XWPFDocument doc = IOManager.readFile("WordTemplate/5.2.docx");
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("table53", policy).build();
        XWPFTemplate template = XWPFTemplate.compile(doc,config).render(new HashMap<String,Object>(){{
            put(ReplaceSymbol.system_name, input.system_name);
            put("521a","物理和环境安全要求，采用基于密码技术的遵循GM/T 0036要求的电子门禁系统，保护物理访问控制身份鉴别信息。符合该标准的电子门禁系统使用SM4等算法进行密钥分散，实现门禁卡的一卡一密，并基于SM4等算法鉴别人员身份。");
            put("521list", Numberings.ofDecimal("身份鉴别：采用基于密码技术的遵循GM/T 0036要求的电子门禁系统","电子门禁记录数据存储完整性：采用基于密码技术的遵循GM/T 0036要求的电子门禁系统，","视频监控记录数据存储完整性：采用基于密码技术的的视频监控系统，").create());
            put("table53", input.table53List);
            put(ReplaceSymbol.Applicability1,"适用");
            put(ReplaceSymbol.Applicability2,"适用");
            put(ReplaceSymbol.Applicability3,"适用");
            put(ReplaceSymbol.explain1,"无");
            put(ReplaceSymbol.explain2,"无");
            put(ReplaceSymbol.explain3,"无");
        }});
        return template.getXWPFDocument();
    }



}
