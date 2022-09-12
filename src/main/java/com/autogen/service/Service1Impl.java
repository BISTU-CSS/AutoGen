package com.autogen.service;

import com.autogen.dao.Mapper.DeviceMapper;
import com.autogen.dao.Mapper.ScenceMapper;
import com.autogen.dao.entity.Device;
import com.autogen.dao.entity.ScencePo;
import com.autogen.dao.entity.input.*;
import com.autogen.dao.entity.cp1.Chaptre1input;
import com.autogen.dao.entity.cp2.Chaptre2input;
import com.autogen.dao.entity.cp3.Chaptre3input;
import com.autogen.dao.entity.cp4.Chaptre4input;
import com.autogen.dao.entity.cp5.Chaptre5input;
import com.autogen.dao.entity.cp6.Chaptre6input;
import com.autogen.dao.entity.cp7.Chaptre7input;
import com.autogen.dao.entity.cp8.Chaptre8input;
import com.autogen.dao.entity.table.*;
import com.autogen.service.atgInterface.AutoGenerator;
import com.autogen.service.atgInterface.AutoGeneratorImpl;
import com.autogen.service.fileapi.IOManager;
import com.autogen.util.Convert;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.deepoove.poi.xwpf.NiceXWPFDocument;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Slf4j
public class Service1Impl implements Service1 {
    @Autowired
    ScenceMapper scenceMapper;
    @Autowired
    DeviceMapper deviceMapper;


    @Override
    @Transactional
    public void BasicTemplate(QuestionNaire questionNaire, Concent concent) {
        c1 = new Chaptre1input();
        c2 = new Chaptre2input();
        c3 = new Chaptre3input();
        c4 = new Chaptre4input();
        c5 = new Chaptre5input();
        c6 = new Chaptre6input();
        c7 = new Chaptre7input();
        c8 = new Chaptre8input();

        Convert.convertToText(questionNaire);
        Map<String, Object> map = selectDes(questionNaire, concent);

        //第一章
        c1.sys_name = (String) map.get("sysname");
        c1.sys_unit = (String) map.get("sysunit");
        SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日");
        c1.sys_date = date.format(new Date());

        //第二章
        c2.sys_name = (String) map.get("sysname");
        c2.sys_unit = (String) map.get("sysunit");
        c2.sys_xtjs = (String) map.get("xtjs");
        c2.sys_dbjb = (String) map.get("dbjb");
        c2.sys_mpsc = (String) map.get("mpsc");
        c2.sys_mmzd = (String) map.get("mmzd");
        c2.sys_ysbs = (String) map.get("ysbs");
        c2.sys_rzys = (String) map.get("rzys");
        c2.sys_rzys = (String) map.get("rzys");
        c2.sys_xtfw = (String) map.get("xtfw");
        c2.sys_ydd = (String) map.get("ydd");
        c2.sys_fwd = (String) map.get("fwd");
        c2.table22List = (List<InputTable22>) map.get("table22");
        c2.table23List = (List<InputTable23>) map.get("table23");
        c2.table241List = (List<InputTable24>) map.get("table241");
        c2.table242List = (List<InputTable24>) map.get("table242");
        c2.table25List = (List<InputTable25>) map.get("table25");
        c2.table261List = (List<InputTable26>) map.get("table261");
        c2.table262List = (List<InputTable26>) map.get("table262");
        c2.table263List = (List<InputTable26>) map.get("table263");
        c2.table264List = (List<InputTable26>) map.get("table264");
        c2.table265List = (List<InputTable26>) map.get("table265");
        c2.table27List = (List<InputTable27>) map.get("table27");
        c2.table28List = (List<InputTable28>) map.get("table28");
        c2.s26 = (String) map.get("s26");


        //第三章
        c3.table31List = (List<Table31>) map.get("table31");
        c3.table32List = (List<Table3Util>) map.get("table32");
        c3.table33List = (List<Table33>) map.get("table33");
        c3.table34List = (List<Table3Util>) map.get("table34");
        c3.table35List = (List<Table35>) map.get("table35");
        c3.table36List = (List<Table3Util>) map.get("table36");
        c3.table37List = (List<Table37>) map.get("table37");
        c3.table38List = (List<Table3Util>) map.get("table38");


        //第四章
        c4.sys_name = (String) map.get("sysname");
//
//        //第五章
//        c5.sys_name = questionNaire.sys_name;
        c5.img51 = (String) map.get("img51");
        c5.table51List = (List<Table5Util>) map.get("table51");
        c5.table52List = (List<Table5Util>) map.get("table52");
        c5.table53List = (List<Table5Util>) map.get("table53");
        c5.table54List = (List<Table5Util>) map.get("table54");
        c5.table57List = (List<Table57>) map.get("table57");
        c5.table58List = (List<Table59Util>) map.get("table58");
        c5.table59List = (List<Table59Util>) map.get("table59");
        c5.table510List = (List<Table59Util>) map.get("table510");
        c5.table511List = (List<Table59Util>) map.get("table511");
//
//        //第六章
        c6.system_name = (String) map.get("sysname");
        c6.s6 = (String) map.get("6");

//        //第七章
        c7.system_name = (String) map.get("sysname");
//
//        //第八章
        c8.system_name = (String) map.get("sysname");
//        c8.table8List = (List<Table8>) map.get("table8");
    }

    @Override
    @Transactional
    public void generate() throws Exception {
        AutoGenerator autoGenerator = new AutoGeneratorImpl();
        XWPFDocument doc1 = autoGenerator.chapter_one_generator(getC1());
        XWPFDocument doc2 = autoGenerator.chapter_two_generator(getC2());
        XWPFDocument doc3 = autoGenerator.chapter_three_generator(getC3());
        XWPFDocument doc4 = autoGenerator.chapter_four_generator(getC4());
        XWPFDocument doc5 = autoGenerator.chapter_five_generator(getC5());
        XWPFDocument doc6 = autoGenerator.chapter_six_generator(getC6());
        XWPFDocument doc7 = autoGenerator.chapter_seven_generator(getC7());
//        XWPFDocument doc8 = autoGenerator.chapter_eight_generator(getC8());
        NiceXWPFDocument completeDoc = IOManager.mergeFile((NiceXWPFDocument) doc1, (NiceXWPFDocument) doc2, (NiceXWPFDocument) doc3, (NiceXWPFDocument) doc4, (NiceXWPFDocument) doc5, (NiceXWPFDocument) doc6, (NiceXWPFDocument) doc7);
        IOManager.writeFile(completeDoc, "/home/ubuntu/Desktop/code_package/complete_example.docx");
//        IOManager.writeFile(completeDoc, "example.docx");
    }

    @Override
    @Transactional
    public Map<String, Object> selectDes(QuestionNaire questionNaire, Concent concent) {
        Map<String, Object> map = new HashMap<>();
        cp2Des(map, questionNaire);
        cp3Des(map, questionNaire, concent);
        cp5Des(map, concent);
        return map;
    }

    @Override
    @Transactional
    public void cp2Des(Map<String, Object> map, QuestionNaire questionNaire) {
        map.put("sysname", questionNaire.getSys_name());
        map.put("sysunit", questionNaire.getSys_unit());
        map.put("xtjs", questionNaire.getSys_xtjs());
        map.put("dbjb", questionNaire.getSys_dbjb());
        map.put("mpsc", questionNaire.getSys_mpsc());
        map.put("mmzd", questionNaire.getSys_mmzd());
        map.put("ysbs", questionNaire.getSys_ysbs());
        map.put("rzys", questionNaire.getSys_rzys());
        map.put("fwd", questionNaire.getMpjb_fwd());
        map.put("ydd", StringUtils.strip(questionNaire.getMpjb_ydd().toString(), "[]"));
        List<Table22> table22List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable22List().size(); i++) {
            Table22 table22 = new Table22();
            table22.setYwyy(questionNaire.getInputTable22List().get(i).getYwyy());
            table22.setYh(questionNaire.getInputTable22List().get(i).getYh());
            table22.setDlfs(StringUtils.strip(questionNaire.getInputTable22List().get(i).getDlfs().toString(), "[]"));
            table22.setSfrz(StringUtils.strip(questionNaire.getInputTable22List().get(i).getSfrz().toString(), "[]"));
            table22.setSzwl(StringUtils.strip(questionNaire.getInputTable22List().get(i).getSzwl().toString(), "[]"));
            table22.setSl(questionNaire.getInputTable22List().get(i).getSl());
            table22List.add(table22);
        }
        map.put("table22", table22List);
        List<Table23> table23List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable23List().size(); i++) {
            Table23 table23 = new Table23();
            table23.setJfmc(questionNaire.getInputTable23List().get(i).getJfmc());
            table23.setJflx(questionNaire.getInputTable23List().get(i).getJflx());
            table23.setMj(questionNaire.getInputTable23List().get(i).getMj());
            table23.setSfrz(StringUtils.strip(questionNaire.getInputTable23List().get(i).getSfrz().toString(), "[]"));
            table23.setSpjk(questionNaire.getInputTable23List().get(i).getSpjk());
            table23.setZjsb(questionNaire.getInputTable23List().get(i).getZjsb());
            table23List.add(table23);
        }
        map.put("table23", table23List);
        List<Table24> table241List = new ArrayList<>();
        List<Table24> table242List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable24List().size(); i++) {
            Table24 table24 = new Table24();
            table24.setType(questionNaire.getInputTable24List().get(i).getType());
            table24.setTxzt(questionNaire.getInputTable24List().get(i).getTxzt());
            table24.setZysj(questionNaire.getInputTable24List().get(i).getZysj());
            table24.setSfrz(StringUtils.strip(questionNaire.getInputTable24List().get(i).getSfrz().toString(), "[]"));
            table24.setSl(questionNaire.getInputTable24List().get(i).getSl());
            table24.setSm(questionNaire.getInputTable24List().get(i).getSm());
            if ("1".equals(table24.getType())) {
                table241List.add(table24);
            } else if ("2".equals(table24.getType())) {
                table242List.add(table24);
            }
        }
        map.put("table241", table241List);
        map.put("table242", table242List);
        List<Table25> table25List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable25List().size(); i++) {
            Table25 table25 = new Table25();
            table25.setSbmc(questionNaire.getInputTable25List().get(i).getSbmc());
            table25.setPpxh(questionNaire.getInputTable25List().get(i).getPpxh());
            table25.setSl(questionNaire.getInputTable25List().get(i).getSl());
            table25.setCzxt(questionNaire.getInputTable25List().get(i).getCzxt());
            table25.setSjk(questionNaire.getInputTable25List().get(i).getSjk());
            table25.setYcyw(questionNaire.getInputTable25List().get(i).getYcyw());
            table25.setSfrz(StringUtils.strip(questionNaire.getInputTable25List().get(i).getSfrz().toString(), "[]"));
            table25.setBlj(questionNaire.getInputTable25List().get(i).getBlj());
            table25List.add(table25);
        }
        map.put("table25", table25List);
        List<Table26> table261List = new ArrayList<>();
        List<Table26> table262List = new ArrayList<>();
        List<Table26> table263List = new ArrayList<>();
        List<Table26> table264List = new ArrayList<>();
        List<Table26> table265List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable26List().size(); i++) {
            Table26 table26 = new Table26();
            table26.setType(questionNaire.getInputTable26List().get(i).getType());
            table26.setSbmc(questionNaire.getInputTable26List().get(i).getSbmc());
            table26.setPpxh(questionNaire.getInputTable26List().get(i).getPpxh());
            table26.setSl(questionNaire.getInputTable26List().get(i).getSl());
            table26.setGmsf(questionNaire.getInputTable26List().get(i).getGmsf());
            table26.setSmzs(questionNaire.getInputTable26List().get(i).getSmzs());
            table26.setYcyw(questionNaire.getInputTable26List().get(i).getYcyw());
            table26.setSfrz(StringUtils.strip(questionNaire.getInputTable26List().get(i).getSfrz().toString(), "[]"));
            table26.setBlj(questionNaire.getInputTable26List().get(i).getBlj());
            if ("1".equals(table26.getType())) {
                table261List.add(table26);
            } else if ("2".equals(table26.getType())) {
                table262List.add(table26);
            } else if ("3".equals(table26.getType())) {
                table263List.add(table26);
            } else if ("4".equals(table26.getType())) {
                table264List.add(table26);
            } else if ("5".equals(table26.getType())) {
                table265List.add(table26);
            }
        }
        if (table261List.isEmpty()) {
            table261List.add(new Table26("", "无", "", "", "", "", "", "", ""));
        }
        if (table262List.isEmpty()) {
            table262List.add(new Table26("", "无", "", "", "", "", "", "", ""));
        }
        if (table263List.isEmpty()) {
            table263List.add(new Table26("", "无", "", "", "", "", "", "", ""));
        }
        if (table264List.isEmpty()) {
            table264List.add(new Table26("", "无", "", "", "", "", "", "", ""));
        }
        if (table265List.isEmpty()) {
            table265List.add(new Table26("", "无", "", "", "", "", "", "", ""));
        }
        map.put("table261", table261List);
        map.put("table262", table262List);
        map.put("table263", table263List);
        map.put("table264", table264List);
        map.put("table265", table265List);
        map.put("table27", questionNaire.getInputTable27List());
        map.put("table28", questionNaire.getInputTable28List());
        map.put("s26", "系统目前人员管理制度（岗位责任制度、人员考核制度、人员培训制度、关键岗位人员保密制度和关键岗位人员调离制度等）、建设运行、应急处置等制度并不完善。由于现有管理制度并不健全，将按照第6章密码安全管理方案进行改进。");

    }

    @Override
    @Transactional
    public void cp3Des(Map<String, Object> map, QuestionNaire questionNaire, Concent concent) {
        List<Table31> table31List = new ArrayList<>();
        List<Table3Util> table32List = new ArrayList<>();
        List<Table33> table33List = new ArrayList<>();
        List<Table3Util> table34List = new ArrayList<>();
        List<Table35> table35List = new ArrayList<>();
        List<Table3Util> table36List = new ArrayList<>();
        List<Table37> table37List = new ArrayList<>();
        List<Table3Util> table38List = new ArrayList<>();
        Table3Util table3Util;
        List<String> zbList;
        List<String> yqList;
        List<String> fxdjList;
        List<String> syqkList;
        List<String> xtxzList;
        List<String> jlList;
        for (int i = 0; i < questionNaire.getInputTable23List().size(); i++) {
            Table31 table31 = new Table31();
            table31.setJfmc(questionNaire.getInputTable23List().get(i).getJfmc());
            table31List.add(table31);
        }
        map.put("table31", table31List);
        for (int i = 0; i < questionNaire.getInputTable23List().size(); i++) {
            zbList = new ArrayList<>();
            yqList = new ArrayList<>();
            fxdjList = new ArrayList<>();
            syqkList = new ArrayList<>();
            xtxzList = new ArrayList<>();
            jlList = new ArrayList<>();
            table32Init(questionNaire.getInputTable23List().get(i), zbList, yqList, fxdjList, syqkList, xtxzList, jlList);
            for (int j = 0; j < 3; j++) {
                table3Util = new Table3Util();
                table3Util.setCpdx(questionNaire.getInputTable23List().get(i).getJfmc());
                table3Util.setZb(zbList.get(j));
                table3Util.setYq(yqList.get(j));
                table3Util.setFxdj(fxdjList.get(j));
                table3Util.setSyqk(syqkList.get(j));
                table3Util.setXtxz(xtxzList.get(j));
                table3Util.setJl(jlList.get(j));
                table32List.add(table3Util);
            }
        }
        map.put("table32", table32List);
        for (int i = 0; i < questionNaire.getInputTable24List().size(); i++) {
            Table33 table33 = new Table33();
            if ("1".equals(questionNaire.getInputTable24List().get(i).getType())) {
                table33.setWllx("互联网");
            } else if ("2".equals(questionNaire.getInputTable24List().get(i).getType())) {
                table33.setWllx("办公局域网");
            }
            table33.setTxzt(questionNaire.getInputTable24List().get(i).getTxzt());
            table33.setCpdx(concent.getWlhtxList().get(i).getWlhtx_xdmc());
            table33List.add(table33);
        }
        map.put("table33", table33List);
        for (int i = 0; i < questionNaire.getInputTable24List().size(); i++) {
            zbList = new ArrayList<>();
            yqList = new ArrayList<>();
            fxdjList = new ArrayList<>();
            syqkList = new ArrayList<>();
            xtxzList = new ArrayList<>();
            jlList = new ArrayList<>();
            table34Init(questionNaire.getInputTable24List().get(i), zbList, yqList, fxdjList, syqkList, xtxzList, jlList);
            for (int j = 0; j < 5; j++) {
                table3Util = new Table3Util();
                table3Util.setCpdx(concent.getWlhtxList().get(i).getWlhtx_xdmc());
                table3Util.setZb(zbList.get(j));
                table3Util.setYq(yqList.get(j));
                table3Util.setFxdj(fxdjList.get(j));
                table3Util.setSyqk(syqkList.get(j));
                table3Util.setXtxz(xtxzList.get(j));
                table3Util.setJl(jlList.get(j));
                table34List.add(table3Util);
            }
        }
        map.put("table34", table34List);


        for (int i = 0; i < questionNaire.getInputTable25List().size(); i++) {
            Table35 table35 = new Table35();
            table35.setSblx("通用设备");
            table35.setSbmc(questionNaire.getInputTable25List().get(i).getSbmc());
            table35.setCpdx(questionNaire.getInputTable25List().get(i).getSbmc());
            table35List.add(table35);
        }
        for (int i = 0; i < questionNaire.getInputTable26List().size(); i++) {
            Table35 table35 = new Table35();
            if ("1".equals(questionNaire.getInputTable26List().get(i).getType())) {
                table35.setSblx("密码产品/密码设备");
            } else if ("2".equals(questionNaire.getInputTable26List().get(i).getType())) {
                table35.setSblx("具有密码功能的网络及安全设备(含云平台提供的虚拟VPN、堡垒机等)");
            } else if ("3".equals(questionNaire.getInputTable26List().get(i).getType())) {
                table35.setSblx("采用密码技术的其他产品");
            } else if ("4".equals(questionNaire.getInputTable26List().get(i).getType())) {
                table35.setSblx("没有密码功能的网络及安全设备（专用设备一般不作为测评对象）");
            } else if ("5".equals(questionNaire.getInputTable26List().get(i).getType())) {
                table35.setSblx("虚拟设备和系统（专用设备一般不作为测评对象）");
            }
            table35.setSbmc(questionNaire.getInputTable26List().get(i).getSbmc());
            table35.setCpdx(questionNaire.getInputTable26List().get(i).getSbmc());
            table35List.add(table35);
        }
        map.put("table35", table35List);
        for (int i = 0; i < questionNaire.getInputTable25List().size(); i++) {
            zbList = new ArrayList<>();
            yqList = new ArrayList<>();
            fxdjList = new ArrayList<>();
            syqkList = new ArrayList<>();
            xtxzList = new ArrayList<>();
            jlList = new ArrayList<>();
            table36Init(questionNaire.getInputTable25List().get(i), zbList, yqList, fxdjList, syqkList, xtxzList, jlList);
            for (int j = 0; j < 6; j++) {
                table3Util = new Table3Util();
                table3Util.setCpdx(questionNaire.getInputTable25List().get(i).getSbmc());
                table3Util.setZb(zbList.get(j));
                table3Util.setYq(yqList.get(j));
                table3Util.setFxdj(fxdjList.get(j));
                table3Util.setSyqk(syqkList.get(j));
                table3Util.setXtxz(xtxzList.get(j));
                table3Util.setJl(jlList.get(j));
                table36List.add(table3Util);
            }
        }
        for (int i = 0; i < questionNaire.getInputTable26List().size(); i++) {
            if ("1".equals(questionNaire.getInputTable26List().get(i).getType()) || "2".equals(questionNaire.getInputTable26List().get(i).getType()) || "3".equals(questionNaire.getInputTable26List().get(i).getType())) {
                zbList = new ArrayList<>();
                yqList = new ArrayList<>();
                fxdjList = new ArrayList<>();
                syqkList = new ArrayList<>();
                xtxzList = new ArrayList<>();
                jlList = new ArrayList<>();
                table36Init(questionNaire.getInputTable26List().get(i), zbList, yqList, fxdjList, syqkList, xtxzList, jlList);
                for (int j = 0; j < 6; j++) {
                    table3Util = new Table3Util();
                    table3Util.setCpdx(questionNaire.getInputTable26List().get(i).getSbmc());
                    table3Util.setZb(zbList.get(j));
                    table3Util.setYq(yqList.get(j));
                    table3Util.setFxdj(fxdjList.get(j));
                    table3Util.setSyqk(syqkList.get(j));
                    table3Util.setXtxz(xtxzList.get(j));
                    table3Util.setJl(jlList.get(j));
                    table36List.add(table3Util);
                }
            }
        }
        map.put("table36", table36List);
        for (int i = 0; i < questionNaire.getInputTable27List().size(); i++) {
            Table37 table37 = new Table37();
            table37.setYwyy(questionNaire.getInputTable27List().get(i).getYwyy());
            table37.setCpdx(questionNaire.getInputTable27List().get(i).getYwyy());
            table37List.add(table37);
        }
        for (int i = 0; i < questionNaire.getInputTable28List().size(); i++) {
            if (!questionNaire.getInputTable28List().get(i).getSjlx().equals("访问控制信息")) {
                Table37 table37 = new Table37();
                table37.setYwyy(questionNaire.getInputTable28List().get(i).getSjlx());
                table37.setCpdx("重要数据");
                table37List.add(table37);
            }
        }
        map.put("table37", table37List);
        for (int i = 0; i < questionNaire.getInputTable27List().size(); i++) {
            zbList = new ArrayList<>();
            yqList = new ArrayList<>();
            fxdjList = new ArrayList<>();
            syqkList = new ArrayList<>();
            xtxzList = new ArrayList<>();
            jlList = new ArrayList<>();
            table38Init(questionNaire, i, zbList, yqList, fxdjList, syqkList, xtxzList, jlList);
            for (int j = 0; j < 8; j++) {
                table3Util = new Table3Util();
                table3Util.setCpdx(questionNaire.getInputTable27List().get(i).getYwyy());
                table3Util.setZb(zbList.get(j));
                table3Util.setYq(yqList.get(j));
                table3Util.setFxdj(fxdjList.get(j));
                table3Util.setSyqk(syqkList.get(j));
                table3Util.setXtxz(xtxzList.get(j));
                table3Util.setJl(jlList.get(j));
                table38List.add(table3Util);
            }
        }
        map.put("table38", table38List);
    }

    @Override
    @Transactional
    public void cp5Des(Map<String, Object> map, Concent concent) {
        List<Table5Util> table51List = new ArrayList<>();
        List<Table5Util> table52List = new ArrayList<>();
        List<Table5Util> table53List = new ArrayList<>();
        List<Table5Util> table54List = new ArrayList<>();
        List<Table57> table57List = new ArrayList<>();
        List<Table59Util> table58List = new ArrayList<>();
        List<Table59Util> table59List = new ArrayList<>();
        List<Table59Util> table510List = new ArrayList<>();
        List<Table59Util> table511List = new ArrayList<>();
        List<String> zbList = null;
        List<String> cpList = null;
        List<String> msList = null;
        List<String> jlList = null;
        for (int i = 0; i < concent.getWlhhjList().size(); i++) {
            zbList = new ArrayList<>();
            cpList = new ArrayList<>();
            msList = new ArrayList<>();
            jlList = new ArrayList<>();
            table51Init(concent, zbList, cpList, msList, jlList, i);
            for (int j = 0; j < 3; j++) {
                Table5Util table5 = new Table5Util();
                table5.setCpdx(concent.getWlhhjList().get(i).getWlhhj_jfmc());
                table5.setZb(zbList.get(j));
                table5.setMmcp(cpList.get(j));
                table5.setFams(msList.get(j));
                table5.setJl(jlList.get(j));
                table51List.add(table5);
            }
        }
        map.put("table51", table51List);
        for (int i = 0; i < concent.getWlhtxList().size(); i++) {
            zbList = new ArrayList<>();
            cpList = new ArrayList<>();
            msList = new ArrayList<>();
            jlList = new ArrayList<>();
            table52Init(concent, zbList, cpList, msList, jlList, i);
            for (int j = 0; j < 5; j++) {
                Table5Util table5 = new Table5Util();
                table5.setCpdx(concent.getWlhtxList().get(i).getWlhtx_xdmc());
                table5.setZb(zbList.get(j));
                table5.setMmcp(cpList.get(j));
                table5.setFams(msList.get(j));
                table5.setJl(jlList.get(j));
                table52List.add(table5);
            }
        }
        map.put("table52", table52List);
        for (int i = 0; i < concent.getSbhjsList().size(); i++) {
            zbList = new ArrayList<>();
            cpList = new ArrayList<>();
            msList = new ArrayList<>();
            jlList = new ArrayList<>();
            table53Init(concent, zbList, cpList, msList, jlList, i);
            for (int j = 0; j < 6; j++) {
                Table5Util table5 = new Table5Util();
                table5.setCpdx(concent.getSbhjsList().get(i).getSbhjs_sbmc());
                table5.setZb(zbList.get(j));
                table5.setMmcp(cpList.get(j));
                table5.setFams(msList.get(j));
                table5.setJl(jlList.get(j));
                table53List.add(table5);
            }
        }
        map.put("table53", table53List);
        for (int i = 0; i < concent.getYyhsjList().size(); i++) {
            zbList = new ArrayList<>();
            cpList = new ArrayList<>();
            msList = new ArrayList<>();
            jlList = new ArrayList<>();
            table54Init(concent, zbList, cpList, msList, jlList, i);
            for (int j = 0; j < 8; j++) {
                Table5Util table5 = new Table5Util();
                table5.setCpdx(concent.getYyhsjList().get(i).getYyhsj_ywmc());
                table5.setZb(zbList.get(j));
                table5.setMmcp(cpList.get(j));
                table5.setFams(msList.get(j));
                table5.setJl(jlList.get(j));
                table54List.add(table5);
            }
        }
        map.put("table54", table54List);
        for (int i = 0; i < concent.getSbqd().size(); i++) {
            Table57 table57 = new Table57();
            Device device = deviceMapper.selectOne(new QueryWrapper<Device>().eq("name", concent.getSbqd().get(i).getName()));
            if (device != null) {
                table57.setId(i + 1);
                table57.setName(device.getName());
                table57.setLocation(device.getLocation());
                table57.setFunction(device.getYt());
                if ("9999".equals(concent.getSbqd().get(i).getNum())) {
                    table57.setNum("按需");
                } else {
                    table57.setNum(concent.getSbqd().get(i).getNum());
                }
                table57.setRemark(concent.getSbqd().get(i).getRemark());
                table57List.add(table57);
            } else {
                table57.setId(i + 1);
                table57.setName(concent.getSbqd().get(i).getName());
                table57.setLocation("数据查询出错");
                table57.setFunction("数据查询出错");
                table57.setNum(concent.getSbqd().get(i).getNum());
                table57.setRemark("数据查询出错");
                table57List.add(table57);
            }
        }
        map.put("table57", table57List);
        List<String> cpzbList = null;
        List<String> dycpList = null;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < concent.getWlhhjList().size(); j++) {
                zbList = new ArrayList<>();
                cpzbList = new ArrayList<>();
                dycpList = new ArrayList<>();
                table58Init(concent, zbList, cpzbList, dycpList, j);
                Table59Util table59Util = new Table59Util();
                if (j == 0) {
                    table59Util.setZb(zbList.get(i));
                    table59Util.setDycp(dycpList.get(i));
                } else {
                    table59Util.setZb("");
                    table59Util.setDycp("");
                }
                table59Util.setCpdx(concent.getWlhhjList().get(j).getWlhhj_jfmc());
                table59Util.setCpzb(cpzbList.get(i));
                table58List.add(table59Util);
            }
        }
        map.put("table58", table58List);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < concent.getWlhtxList().size(); j++) {
                zbList = new ArrayList<>();
                cpzbList = new ArrayList<>();
                dycpList = new ArrayList<>();
                table59Init(concent, zbList, cpzbList, dycpList, j);
                Table59Util table59Util = new Table59Util();
                if (j == 0) {
                    table59Util.setZb(zbList.get(i));
                    table59Util.setDycp(dycpList.get(i));
                } else {
                    table59Util.setZb("");
                    table59Util.setDycp("");
                }
                table59Util.setCpdx(concent.getWlhtxList().get(j).getWlhtx_xdmc());
                table59Util.setCpzb(cpzbList.get(i));
                table59List.add(table59Util);
            }
        }
        map.put("table59", table59List);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < concent.getSbhjsList().size(); j++) {
                zbList = new ArrayList<>();
                cpzbList = new ArrayList<>();
                dycpList = new ArrayList<>();
                table510Init(concent, zbList, cpzbList, dycpList, j);
                Table59Util table59Util = new Table59Util();
                if (j == 0) {
                    table59Util.setZb(zbList.get(i));
                    table59Util.setDycp(dycpList.get(i));
                } else {
                    table59Util.setZb("");
                    table59Util.setDycp("");
                }
                table59Util.setCpdx(concent.getSbhjsList().get(j).getSbhjs_sbmc());
                table59Util.setCpzb(cpzbList.get(i));
                table510List.add(table59Util);
            }
        }
        map.put("table510", table510List);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < concent.getYyhsjList().size(); j++) {
                zbList = new ArrayList<>();
                cpzbList = new ArrayList<>();
                dycpList = new ArrayList<>();
                table511Init(concent, zbList, cpzbList, dycpList, j);
                Table59Util table59Util = new Table59Util();
                if (j == 0) {
                    table59Util.setZb(zbList.get(i));
                    table59Util.setDycp(dycpList.get(i));
                } else {
                    table59Util.setZb("");
                    table59Util.setDycp("");
                }
                table59Util.setCpdx(concent.getYyhsjList().get(j).getYyhsj_ywmc());
                table59Util.setCpzb(cpzbList.get(i));
                table511List.add(table59Util);
            }
        }
        map.put("table511", table511List);
    }

    @Override
    @Transactional
    public void table32Init(InputTable23 table23, List<String> zbList, List<String> yqList, List<String> fxdjList, List<String> syqkList, List<String> xtxzList, List<String> jlList) {
        zbList.add("身份鉴别");
        zbList.add("电子门禁记录数据存储完整性");
        zbList.add("视频监控记录数据存储完整性");
        yqList.add("宜");
        yqList.add("宜");
        yqList.add("宜");
        fxdjList.add("高");
        fxdjList.add("中");
        fxdjList.add("中");
        syqkList.add("适用");
        syqkList.add("适用");
        syqkList.add("适用");
        if ("国密电子".equals(table23.getMj())) {
            xtxzList.add("目前机房已经是合规的国密电子门禁，符合GM/T 0036要求的基于密码技术的电子门禁系统，采用密码技术保证进出机房人员的身份鉴别");
            xtxzList.add("目前机房已经合规，符合GM/T 0036要求的基于密码技术的电子门禁系统，采用密码技术保证电子门禁系统进出数据记录的存储完整性");
            jlList.add("符合");
            jlList.add("符合");
        } else {
            xtxzList.add("目前机房的电子门禁是不符合GM/T 0036要求的基于密码技术的电子门禁系统，未采用密码技术保证进出机房人员的身份鉴别");
            xtxzList.add("系统目前未采用合规的电子门禁系统，不符合GM/T 0036要求，未采用密码技术保证电子门禁系统进出数据记录的存储完整性");
            jlList.add("不符合");
            jlList.add("不符合");
        }
        if ("国密".equals(table23.getSpjk())) {
            xtxzList.add("目前机房已经是合规的国密视频监控系统，采用密码技术保证视频监控系统视频监控数据的存储完整性");
            jlList.add("符合");
        } else {
            xtxzList.add("目前机房未采用合规的国密视频监控系统，未采用密码技术保证视频监控系统视频监控数据的存储完整性");
            jlList.add("不符合");
        }
    }

    @Override
    @Transactional
    public void table34Init(InputTable24 table24, List<String> zbList, List<String> yqList, List<String> fxdjList, List<String> syqkList, List<String> xtxzList, List<String> jlList) {
        zbList.add("身份鉴别");
        zbList.add("通信数据完整性");
        zbList.add("通信过程中重要数据的机密性");
        zbList.add("网络边界访问控制信息的完整性");
        zbList.add("安全接入认证");
        yqList.add("应");
        yqList.add("宜");
        yqList.add("应");
        yqList.add("宜");
        yqList.add("可");
        fxdjList.add("高");
        fxdjList.add("中");
        fxdjList.add("高");
        fxdjList.add("中");
        fxdjList.add("中");
        syqkList.add("适用");
        xtxzList.add("未采用密码技术对通信实体进行身份鉴别");
        jlList.add("不符合");
        syqkList.add("适用");
        xtxzList.add("未采用密码技术保证通信过程中数据的完整性");
        jlList.add("不符合");
        if ("是".equals(table24.getZysj())) {
            syqkList.add("适用");
            xtxzList.add("未采用密码技术保证通信过程中重要数据的机密性");
            jlList.add("不符合");
        } else {
            syqkList.add("不适用");
            xtxzList.add("此通信信道不涉及重要数据的传输");
            jlList.add("不适用");
        }
        syqkList.add("适用");
        xtxzList.add("未采用密码技术对边界访问控制信息的完整性进行保护");
        jlList.add("不符合");
        syqkList.add("不适用");
        xtxzList.add("三级系统不作此需求");
        jlList.add("不适用");
    }

    @Override
    @Transactional
    public void table36Init(InputTable25 table25, List<String> zbList, List<String> yqList, List<String> fxdjList, List<String> syqkList, List<String> xtxzList, List<String> jlList) {
        zbList.add("身份鉴别");
        zbList.add("远程管理通道安全");
        zbList.add("系统资源访问控制信息完整性");
        zbList.add("重要信息资源安全标记完整性");
        zbList.add("日志记录完整性");
        zbList.add("重要可执行程序完整性、重要可执行程序来源真实性");
        yqList.add("应");
        yqList.add("应");
        yqList.add("宜");
        yqList.add("宜");
        yqList.add("宜");
        yqList.add("宜");
        fxdjList.add("高");
        fxdjList.add("高");
        fxdjList.add("中");
        fxdjList.add("中");
        fxdjList.add("中");
        fxdjList.add("中");
        syqkList.add("适用");
        if ("1".equals(table25.getBlj())) {
            xtxzList.add("以采用密码技术对登录设备的用户进行身份鉴别，保证用户身份的真实性");
            jlList.add("符合");
        } else {
            xtxzList.add("未采用密码技术对登录设备的用户进行身份鉴别，保证用户身份的真实性");
            jlList.add("不符合");
        }
        syqkList.add("适用");
        xtxzList.add("未采用符合国家或密码行业要求的密码算法、密码技术");
        jlList.add("不符合");
        syqkList.add("适用");
        xtxzList.add("未采用密码技术对系统访问控制信息的完整性进行保护");
        jlList.add("不符合");
        syqkList.add("不适用");
        xtxzList.add("系统无重要信息资源安全标记");
        jlList.add("不适用");
        syqkList.add("适用");
        xtxzList.add("未采用密码技术保证日志记录的完整性");
        jlList.add("不符合");
        syqkList.add("适用");
        xtxzList.add("未使用密码技术实现可执行程序的完整性和来源的真实性");
        jlList.add("不符合");
    }

    @Override
    @Transactional
    public void table36Init(InputTable26 table26, List<String> zbList, List<String> yqList, List<String> fxdjList, List<String> syqkList, List<String> xtxzList, List<String> jlList) {
        zbList.add("身份鉴别");
        zbList.add("远程管理通道安全");
        zbList.add("系统资源访问控制信息完整性");
        zbList.add("重要信息资源安全标记完整性");
        zbList.add("日志记录完整性");
        zbList.add("重要可执行程序完整性、重要可执行程序来源真实性");
        yqList.add("应");
        yqList.add("应");
        yqList.add("宜");
        yqList.add("宜");
        yqList.add("宜");
        yqList.add("宜");
        fxdjList.add("高");
        fxdjList.add("高");
        fxdjList.add("中");
        fxdjList.add("中");
        fxdjList.add("中");
        fxdjList.add("中");
        syqkList.add("适用");
        if ("1".equals(table26.getBlj())) {
            xtxzList.add("以采用密码技术对登录设备的用户进行身份鉴别，保证用户身份的真实性");
            jlList.add("符合");
        } else {
            xtxzList.add("未采用密码技术对登录设备的用户进行身份鉴别，保证用户身份的真实性");
            jlList.add("不符合");
        }
        syqkList.add("适用");
        xtxzList.add("未采用符合国家或密码行业要求的密码算法、密码技术");
        jlList.add("不符合");
        syqkList.add("适用");
        xtxzList.add("未采用密码技术对系统访问控制信息的完整性进行保护");
        jlList.add("不符合");
        syqkList.add("不适用");
        xtxzList.add("系统无重要信息资源安全标记");
        jlList.add("不适用");
        syqkList.add("适用");
        xtxzList.add("未采用密码技术保证日志记录的完整性");
        jlList.add("不符合");
        syqkList.add("适用");
        xtxzList.add("未使用密码技术实现可执行程序的完整性和来源的真实性");
        jlList.add("不符合");
    }

    @Override
    @Transactional
    public void table38Init(QuestionNaire questionNaire, int i, List<String> zbList, List<String> yqList, List<String> fxdjList, List<String> syqkList, List<String> xtxzList, List<String> jlList) {
        zbList.add("身份鉴别");
        zbList.add("访问控制信息完整性");
        zbList.add("重要信息资源安全标记完整性");
        zbList.add("重要数据传输机密性");
        zbList.add("重要数据存储机密性");
        zbList.add("重要数据传输完整性");
        zbList.add("重要数据存储完整性");
        zbList.add("不可否认性");
        yqList.add("应");
        yqList.add("宜");
        yqList.add("宜");
        yqList.add("应");
        yqList.add("应");
        yqList.add("宜");
        yqList.add("宜");
        yqList.add("宜");
        fxdjList.add("高");
        fxdjList.add("中");
        fxdjList.add("中");
        fxdjList.add("高");
        fxdjList.add("高");
        fxdjList.add("中");
        fxdjList.add("高");
        fxdjList.add("高");
        InputTable28 table28 = questionNaire.getInputTable28List().get(i);
        InputTable27 table27 = questionNaire.getInputTable27List().get(i);
        InputTable22 table22 = questionNaire.getInputTable22List().get(i);
        syqkList.add("适用");
        if (table22.getSfrz().contains("U盘证书")) {
            xtxzList.add("系统采用合规的密码技术对登录用户进行身份鉴别");
            jlList.add("符合");
        } else {
            xtxzList.add("系统未采用合规的密码技术对登录用户进行身份鉴别");
            jlList.add("不符合");
        }

        if ("国密".equals(table28.getCcjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中访问控制信息采用了国密技术进行完整性保护");
            jlList.add("符合");
        } else if ("非国密".equals(table28.getCcjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中访问控制信息已加密但未采用国密技术进行完整性保护");
            jlList.add("不符合");
        } else if ("未加密".equals(table28.getCcjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中访问控制信息未采用密码技术进行完整性保护");
            jlList.add("不符合");
        }
        syqkList.add("不适用");
        xtxzList.add("本系统不涉及重要信息资源安全标记");
        jlList.add("不适用");
        if ("不涉及".equals(table28.getCsjm())) {
            syqkList.add("不适用");
            xtxzList.add("本系统不涉及重要数据传输机密性");
            jlList.add("不适用");
        } else if ("国密".equals(table28.getCsjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中重要数据采用了国密技术进行保护");
            jlList.add("符合");
        } else if ("非国密".equals(table28.getCsjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中重要数据未采用国密技术进行保护");
            jlList.add("不符合");
        } else if ("未加密".equals(table28.getCsjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中重要数据未采用密码技术进行保护");
            jlList.add("不符合");
        }
        if ("国密".equals(table28.getCcjm())) {
            syqkList.add("不适用");
            xtxzList.add("系统已经采用了合规的密码技术进行了存储机密性的保护");
            jlList.add("不适用");
        } else if ("非国密".equals(table28.getCcjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中未采用了合规的密码技术进行了存储机密性的保护");
            jlList.add("符合");
        } else if ("未加密".equals(table28.getCcjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中未采用了合规的密码技术进行了存储机密性的保护");
            jlList.add("不符合");
        }
        if ("不涉及".equals(table28.getCsjm())) {
            syqkList.add("不适用");
            xtxzList.add("本系统不涉及重要数据传输完整性");
            jlList.add("不适用");
        } else if ("国密".equals(table28.getCsjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中重要数据采用了国密技术进行保护");
            jlList.add("符合");
        } else if ("非国密".equals(table28.getCsjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中重要数据未采用国密技术进行保护");
            jlList.add("不符合");
        } else if ("未加密".equals(table28.getCsjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中重要数据未采用密码技术进行保护");
            jlList.add("不符合");
        }
        if ("国密".equals(table28.getCcjm())) {
            syqkList.add("不适用");
            xtxzList.add("系统已经采用了合规的密码技术进行了存储机密性的保护");
            jlList.add("不适用");
        } else if ("非国密".equals(table28.getCcjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中未采用了合规的密码技术进行了存储机密性的保护");
            jlList.add("符合");
        } else if ("未加密".equals(table28.getCcjm())) {
            syqkList.add("适用");
            xtxzList.add("系统中未采用了合规的密码技术进行了存储机密性的保护");
            jlList.add("不符合");
        }
        if ("没有需求".equals(table27.getBkfr())) {
            syqkList.add("不适用");
            xtxzList.add("系统不需要保证不可否认性");
            jlList.add("不适用");
        } else if ("有需求&未做".equals(table27.getBkfr())) {
            syqkList.add("适用");
            xtxzList.add("系统需要保证不可否认性但还未保证");
            jlList.add("不符合");
        } else if ("有需求&已做".equals(table27.getBkfr())) {
            syqkList.add("适用");
            xtxzList.add("系统已保证不可否认性");
            jlList.add("符合");
        }

    }


    public void table51Init(Concent concent, List<String> zbList, List<String> cpList, List<String> msList, List<String> jlList, int i) {
        ScencePo scencePo = new ScencePo();
        Wlhhj wlhhj = concent.getWlhhjList().get(i);
        zbList.add("身份鉴别");
        zbList.add("电子门禁记录数据存储完整性");
        zbList.add("视频监控记录数据存储完整性");
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", wlhhj.getWlhhj_sfjb()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", wlhhj.getWlhhj_dzmj()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", wlhhj.getWlhhj_spjk()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }

    }

    public void table52Init(Concent concent, List<String> zbList, List<String> cpList, List<String> msList, List<String> jlList, int i) {
        ScencePo scencePo = new ScencePo();
        Wlhtx wlhtx = concent.getWlhtxList().get(i);
        zbList.add("身份鉴别");
        zbList.add("通信数据完整性");
        zbList.add("通信过程中重要数据的机密性");
        zbList.add("网络边界访问控制信息的完整性");
        zbList.add("安全接入认证");
        for (int j = 0; j < 5; j++) {
            scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", wlhtx.getWlhtx_xd().get(j)));
            if (scencePo != null) {
                cpList.add(scencePo.getCpzh());
                msList.add(scencePo.getDescription());
                jlList.add(scencePo.getJl());
            } else {
                cpList.add("数据查询出错");
                msList.add("数据查询出错");
                jlList.add("数据查询出错");
            }
        }
    }

    public void table53Init(Concent concent, List<String> zbList, List<String> cpList, List<String> msList, List<String> jlList, int i) {
        ScencePo scencePo = new ScencePo();
        Sbhjs sbhjs = concent.getSbhjsList().get(i);
        zbList.add("身份鉴别");
        zbList.add("远程管理通道安全");
        zbList.add("系统资源访问控制信息完整性");
        zbList.add("重要信息资源安全标记完整性");
        zbList.add("日志记录完整性");
        zbList.add("重要可执行程序完整性、重要可执行程序来源真实性");
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_sfjb()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_ycgl()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_xtzy()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_zyxx()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_rzjl()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_zykz()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
    }

    public void table54Init(Concent concent, List<String> zbList, List<String> cpList, List<String> msList, List<String> jlList, int i) {
        ScencePo scencePo = new ScencePo();
        Yyhsj yyhsj = concent.getYyhsjList().get(i);
        zbList.add("身份鉴别");
        zbList.add("访问控制信息完整性");
        zbList.add("重要信息资源安全标记完整性");
        zbList.add("重要数据传输机密性");
        zbList.add("重要数据存储机密性");
        zbList.add("重要数据传输完整性");
        zbList.add("重要数据存储完整性");
        zbList.add("不可否认性");
        StringBuilder description = new StringBuilder("");
        String cpzh = "";
        String jl = "";
        for (int j = 0; j < yyhsj.getYyhsj_sfjb().size(); j++) {
            scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_sfjb().get(j)));
            if (scencePo != null) {
                description.append(scencePo.getDescription());
                jl = scencePo.getJl();
                cpzh = scencePo.getCpzh();
            }
        }
        if (concent.getYyhsjList().get(i).getYyhsj_sfjb().contains("41-02-1")) {
            cpzh += "、协同签名系统";
        }
        cpList.add(cpzh);
        msList.add(description.toString());
        jlList.add(jl);
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_fwkz()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_xxzy()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        description = new StringBuilder();
        cpzh = "";
        jl = "";
        for (int j = 0; j < concent.getYyhsjList().get(i).getYyhsj_csjmx().size(); j++) {
            scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_csjmx().get(j)));
            if (scencePo != null) {
                description.append(scencePo.getDescription());
            }
        }
        if (concent.getYyhsjList().get(i).getYyhsj_csjmx().contains("44-00-1") || concent.getYyhsjList().get(i).getYyhsj_csjmx().contains("44-01-1")) {
            cpzh = "国密安全密码应用中间件、服务器密码机";
            jl = "符合";
        } else {
            cpzh = "无";
            jl = "不符合";
        }
        cpList.add(cpzh);
        msList.add(description.toString());
        jlList.add(jl);
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_ccjmx()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_cswzx()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_ccwzx()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_bkfr()));
        if (scencePo != null) {
            cpList.add(scencePo.getCpzh());
            msList.add(scencePo.getDescription());
            jlList.add(scencePo.getJl());
        } else {
            cpList.add("数据查询出错");
            msList.add("数据查询出错");
            jlList.add("数据查询出错");
        }
    }

    public void table58Init(Concent concent, List<String> zbList, List<String> cpzbList, List<String> dycpList, int i) {
        ScencePo scencePo = new ScencePo();
        Wlhhj wlhhj = concent.getWlhhjList().get(i);
        zbList.add("身份鉴别");
        zbList.add("电子门禁记录数据存储完整性");
        zbList.add("视频监控记录数据存储完整性");
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", wlhhj.getWlhhj_sfjb()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", wlhhj.getWlhhj_dzmj()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", wlhhj.getWlhhj_spjk()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }

    }

    public void table59Init(Concent concent, List<String> zbList, List<String> cpzbList, List<String> dycpList, int i) {
        ScencePo scencePo = new ScencePo();
        Wlhtx wlhtx = concent.getWlhtxList().get(i);
        zbList.add("身份鉴别");
        zbList.add("通信数据完整性");
        zbList.add("通信过程中重要数据的机密性");
        zbList.add("网络边界访问控制信息的完整性");
        zbList.add("安全接入认证");
        for (int j = 0; j < 5; j++) {
            scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", wlhtx.getWlhtx_xd().get(j)));
            if (scencePo != null) {
                cpzbList.add(scencePo.getCpzb());
                dycpList.add(scencePo.getDycp());
            } else {
                cpzbList.add("数据查询出错");
                dycpList.add("数据查询出错");
            }
        }
    }

    public void table510Init(Concent concent, List<String> zbList, List<String> cpzbList, List<String> dycpList, int i) {
        ScencePo scencePo = new ScencePo();
        Sbhjs sbhjs = concent.getSbhjsList().get(i);
        zbList.add("身份鉴别");
        zbList.add("远程管理通道安全");
        zbList.add("系统资源访问控制信息完整性");
        zbList.add("重要信息资源安全标记完整性");
        zbList.add("日志记录完整性");
        zbList.add("重要可执行程序完整性、重要可执行程序来源真实性");
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_sfjb()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_ycgl()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_xtzy()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_zyxx()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_rzjl()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", sbhjs.getSbhjs_zykz()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
    }

    public void table511Init(Concent concent, List<String> zbList, List<String> cpzbList, List<String> dycpList, int i) {
        ScencePo scencePo = new ScencePo();
        Yyhsj yyhsj = concent.getYyhsjList().get(i);
        zbList.add("身份鉴别");
        zbList.add("访问控制信息完整性");
        zbList.add("重要信息资源安全标记完整性");
        zbList.add("重要数据传输机密性");
        zbList.add("重要数据存储机密性");
        zbList.add("重要数据传输完整性");
        zbList.add("重要数据存储完整性");
        zbList.add("不可否认性");
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_sfjb().get(0)));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_fwkz()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_xxzy()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_csjmx().get(0)));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_ccjmx()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_cswzx()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_ccwzx()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", yyhsj.getYyhsj_bkfr()));
        if (scencePo != null) {
            cpzbList.add(scencePo.getCpzb());
            dycpList.add(scencePo.getDycp());
        } else {
            cpzbList.add("数据查询出错");
            dycpList.add("数据查询出错");
        }
    }


    public Chaptre1input getC1() {
        return c1;
    }

    public Chaptre2input getC2() {
        return c2;
    }

    public Chaptre3input getC3() {
        return c3;
    }

    public Chaptre4input getC4() {
        return c4;
    }

    public Chaptre5input getC5() {
        return c5;
    }

    public Chaptre6input getC6() {
        return c6;
    }

    public Chaptre7input getC7() {
        return c7;
    }

    public Chaptre8input getC8() {
        return c8;
    }

    private Chaptre1input c1;
    private Chaptre2input c2;
    private Chaptre3input c3;
    private Chaptre4input c4;
    private Chaptre5input c5;
    private Chaptre6input c6;
    private Chaptre7input c7;
    private Chaptre8input c8;
}
