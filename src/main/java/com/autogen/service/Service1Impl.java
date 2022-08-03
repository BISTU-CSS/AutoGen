package com.autogen.service;

import com.autogen.dao.Mapper.DeviceMapper;
import com.autogen.dao.Mapper.ScenceMapper;
import com.autogen.dao.entity.Device;
import com.autogen.dao.entity.cp3.fragment.cp3JiSuan;
import com.autogen.dao.entity.cp3.fragment.cp3WangLuo;
import com.autogen.dao.entity.cp3.fragment.cp3YingYong;
import com.autogen.dao.entity.cp5.fragment.cp5JiSuan;
import com.autogen.dao.entity.cp5.fragment.cp5WangLuo;
import com.autogen.dao.entity.cp5.fragment.cp5WuLi;
import com.autogen.dao.entity.cp5.fragment.cp5YingYong;
import com.autogen.dao.entity.input.QuestionNaire;
import com.autogen.dao.entity.ScencePo;
import com.autogen.dao.entity.cp1.Chaptre1input;
import com.autogen.dao.entity.cp2.Chaptre2input;
import com.autogen.dao.entity.cp3.fragment.cp3WuLi;
import com.autogen.dao.entity.table.*;
import com.autogen.dao.entity.cp3.Chaptre3input;
import com.autogen.dao.entity.cp4.Chaptre4input;
import com.autogen.dao.entity.cp5.Chaptre5input;
import com.autogen.dao.entity.cp6.Chaptre6input;
import com.autogen.dao.entity.cp7.Chaptre7input;
import com.autogen.dao.entity.cp8.Chaptre8input;
import com.autogen.service.atgInterface.AutoGenerator;
import com.autogen.service.atgInterface.AutoGeneratorImpl;
import com.autogen.service.fileapi.IOManager;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.deepoove.poi.data.NumberingFormat;
import com.deepoove.poi.data.NumberingRenderData;
import com.deepoove.poi.data.Numberings;
import com.deepoove.poi.xwpf.NiceXWPFDocument;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public void BasicTemplate(QuestionNaire questionNaire, List<String> productName) {
        c1 = new Chaptre1input();
        c2 = new Chaptre2input();
        c3 = new Chaptre3input();
        c4 = new Chaptre4input();
        c5 = new Chaptre5input();
        c6 = new Chaptre6input();
        c7 = new Chaptre7input();
        c8 = new Chaptre8input();

        Map<String, Object> map = selectDes(questionNaire);

        //第一章
        c1.system_name = questionNaire.sys_name;

        //第二章
        c2.system_name = questionNaire.sys_name;
        c2.table213List = (List<Table213>) map.get("table213");
        c2.table25List = (List<Table25>) map.get("table25");
        c2.staff = (String) map.get("staff");
        c2.s222 = (String) map.get("222");
        c2.business = questionNaire.sys_ywyy;
        c2.db = questionNaire.sys_ywsjk;
        c2.os = questionNaire.sys_ywczxt;
        c2.s25 = (String) map.get("25");

        //第三章
        c3.system_name = questionNaire.sys_name;
        c3.list311 = (List<cp3WuLi>) map.get("*list311");
        c3.list312 = (List<cp3WangLuo>) map.get("*list312");
        c3.list313 = (List<cp3JiSuan>) map.get("*list313");
        c3.list314 = (List<cp3YingYong>) map.get("*list314");
        c3.table311List = (List<Table5Util>) map.get("table311");
        c3.table312List = (List<Table5Util>) map.get("table312");
        c3.table313List = (List<Table5Util>) map.get("table313");
        c3.table314List = (List<Table5Util>) map.get("table314");
        c3.s315 = (String) map.get("315");

        //第四章
        c4.system_name = questionNaire.sys_name;

        //第五章
        c5.system_name = questionNaire.sys_name;
        c5.s51 = (String) map.get("51");
        c5.img51 = (String) map.get("img51");
        c5.list51 = (NumberingRenderData) map.get("*list51");
        c5.list52 = (List<String>) map.get("*list52");
        c5.table52List = (List<Table5Util>) map.get("table52");
        c5.list53 = (List<String>) map.get("*list53");
        c5.table53List = (List<Table5Util>) map.get("table53");
        c5.list54 = (List<String>) map.get("*list54");
        c5.table54List = (List<Table5Util>) map.get("table54");
        c5.list55 = (List<String>) map.get("*list55");
        c5.table55List = (List<Table5Util>) map.get("table55");
        c5.table58List = (List<Table58>) map.get("table58");

        //第六章
        c6.system_name = questionNaire.sys_name;
        c6.s6 = (String) map.get("6");

        //第七章
        c7.system_name = questionNaire.sys_name;

        //第八章
        c8.system_name = questionNaire.sys_name;
        c8.table8List = (List<Table8>) map.get("table8");
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
        XWPFDocument doc8 = autoGenerator.chapter_eight_generator(getC8());
        NiceXWPFDocument completeDoc = IOManager.mergeFile((NiceXWPFDocument) doc1, (NiceXWPFDocument) doc2, (NiceXWPFDocument) doc3, (NiceXWPFDocument) doc4, (NiceXWPFDocument) doc5, (NiceXWPFDocument) doc6, (NiceXWPFDocument) doc7, (NiceXWPFDocument) doc8);
        IOManager.writeFile(completeDoc, "/home/ubuntu/Desktop/code_package/complete_example.docx");
        //IOManager.writeFile(completeDoc, "complete_example.docx");
    }

    @Override
    @Transactional
    public Map<String, Object> selectDes(QuestionNaire questionNaire) {
        Map<String, Object> map = new HashMap<>();
        List<Table213> table213List = new ArrayList<>();
        List<Table25> table25List = new ArrayList<>();
        List<cp3WuLi> cp3WuLiList = new ArrayList<>();
        List<cp3WangLuo> cp3WangLuoList = new ArrayList<>();
        List<cp3JiSuan> cp3JiSuanList = new ArrayList<>();
        List<cp3YingYong> cp3YingYongList = new ArrayList<>();
        List<cp5WuLi> cp5WuLiList = new ArrayList<>();
        List<cp5WangLuo> cp5WangLuoList = new ArrayList<>();
        List<cp5JiSuan> cp5JiSuanList = new ArrayList<>();
        List<cp5YingYong> cp5YingYongList = new ArrayList<>();
        List<Table5Util> table5UtilList = new ArrayList<>();
        List<Table58> table58List = new ArrayList<>();
        List<Table8> table8List = new ArrayList<>();
        List<String> list = new ArrayList<>();
        String temp = "";
        int count = 1;
        ScencePo scencePo = new ScencePo();
        Device device = new Device();

        for (int i=0;i<questionNaire.inputTable213List.size();i++){
            if (i == 0){
                temp = questionNaire.inputTable213List.get(0).getSyry();
            }else {
                temp += "、" + questionNaire.inputTable213List.get(i).getSyry();
            }
        }
        map.put("staff",temp);

        for (int i = 0;i<questionNaire.inputTable213List.size();i++){
            table213List.add(new Table213(i+1,questionNaire.inputTable213List.get(i).getSydw(),questionNaire.inputTable213List.get(i).getSyry(),questionNaire.inputTable213List.get(i).getSycj()));
        }
        map.put("table213",table213List);

        for (int i = 0;i<questionNaire.inputTable25List.size();i++){
            table25List.add(new Table25(i+1,questionNaire.inputTable25List.get(i).getZclx(),questionNaire.inputTable25List.get(i).getYt(),questionNaire.inputTable25List.get(i).getYp(),questionNaire.inputTable25List.get(i).getSl()));
        }
        map.put("table25",table25List);

        int num = 0;
        for (int i = 0; i < questionNaire.wlhhjList.size(); i++) {
            if (!questionNaire.wlhhjList.get(i).wlhhj_jfmc.isEmpty()) {
                num++;
            }
        }
        temp = "本系统机房共有" + num + "个，其中包括：";
        for (int i = 0; i < questionNaire.wlhhjList.size(); i++) {
            if (!questionNaire.wlhhjList.get(i).wlhhj_jfmc.isEmpty()) {
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "222").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_sfjb));
                if (scencePo != null) {
                    temp += questionNaire.wlhhjList.get(i).wlhhj_jfmc + "，" + scencePo.getDescription();
                }
            }
        }
        map.put("222", temp);
        temp = "";

        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "25").eq("scence", questionNaire.sys_glzd));
        if (scencePo != null) {
            temp = scencePo.getDescription();
        }
        map.put("25", temp);
        temp = "";

        for (int i = 0; i < questionNaire.wlhhjList.size(); i++) {
            if (!questionNaire.wlhhjList.get(i).wlhhj_jfmc.isEmpty()) {
                Numberings.NumberingBuilder nb1 = Numberings.of(NumberingFormat.LOWER_LETTER);
                Numberings.NumberingBuilder nb2 = Numberings.of(NumberingFormat.LOWER_LETTER);
                Numberings.NumberingBuilder nb3 = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                table5UtilList.add(new Table5Util(i + 1, "物理和环境安全", questionNaire.wlhhjList.get(i).wlhhj_jfmc));
                cp3WuLi cp3WuLi = new cp3WuLi();
                cp5WuLi cp5WuLi = new cp5WuLi();
                cp3WuLi.setJifang(count + "）" + questionNaire.wlhhjList.get(i).getWlhhj_jfmc());
                cp5WuLi.setJifang(count + "、" + questionNaire.wlhhjList.get(i).getWlhhj_jfmc());
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list311a").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_sfjb));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list311a").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_dzmj));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list311a").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_spjk));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                cp3WuLi.setList311a(nb2.create());
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list311b").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_sfjb));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list311b").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_dzmj));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list311b").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_spjk));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list52").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_sfjb));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list52").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_dzmj));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list52").eq("scence", questionNaire.wlhhjList.get(i).wlhhj_spjk));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                cp3WuLi.setList311a(nb2.create());
                cp3WuLi.setList311b(nb1.create());
                cp3WuLiList.add(cp3WuLi);
                cp5WuLi.setList52(nb3.create());
                cp5WuLiList.add(cp5WuLi);
                count++;
            }
        }
        map.put("*list311", cp3WuLiList);
        map.put("table311", table5UtilList);
        map.put("*list52", cp5WuLiList);
        map.put("table52", table5UtilList);
        table5UtilList = new ArrayList<>();
        count = 1;


        for (int i = 0; i < questionNaire.wlhtxList.size(); i++) {
            if (!questionNaire.wlhtxList.get(i).wlhtx_xdmc.isEmpty()) {
                Numberings.NumberingBuilder nb1 = Numberings.of(NumberingFormat.LOWER_LETTER);
                Numberings.NumberingBuilder nb2 = Numberings.of(NumberingFormat.LOWER_LETTER);
                Numberings.NumberingBuilder nb3 = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                cp3WangLuo cp3WangLuo = new cp3WangLuo();
                cp5WangLuo cp5WangLuo = new cp5WangLuo();
                if ("52-01".equals(questionNaire.wlhtxList.get(i).getWlhtx_xdmc())) {
                    questionNaire.wlhtxList.get(i).setWlhtx_xdmc("外网IPSec VPN与IPSec VPN之间的通信信道");
                } else if ("52-02".equals(questionNaire.wlhtxList.get(i).getWlhtx_xdmc())) {
                    questionNaire.wlhtxList.get(i).setWlhtx_xdmc("互联网VPN客户端与内网SSL VPN之间的通信信道");
                }
                table5UtilList.add(new Table5Util(i + 1, "网络和通信安全", questionNaire.wlhtxList.get(i).wlhtx_xdmc));
                cp3WangLuo.setTongdao(count + "）" + questionNaire.wlhtxList.get(i).getWlhtx_xdmc());
                cp5WangLuo.setTongdao(count + "、" + questionNaire.wlhtxList.get(i).getWlhtx_xdmc());
                for (int j = 0; j < questionNaire.wlhtxList.get(i).getWlhtx_xd().size(); j++) {
                    scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list312a").eq("scence", questionNaire.wlhtxList.get(i).wlhtx_xd.get(j)));
                    if (scencePo != null) {
                        nb1.addItem(scencePo.getDescription());
                    }
                    scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list312b").eq("scence", questionNaire.wlhtxList.get(i).wlhtx_xd.get(j)));
                    if (scencePo != null) {
                        nb2.addItem(scencePo.getDescription());
                    }
                    scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list53").eq("scence", questionNaire.wlhtxList.get(i).wlhtx_xd.get(j)));
                    if (scencePo != null) {
                        nb3.addItem(scencePo.getDescription());
                    }
                }
                cp3WangLuo.setList312a(nb1.create());
                cp3WangLuo.setList312b(nb2.create());
                cp5WangLuo.setList53(nb3.create());
                cp3WangLuoList.add(cp3WangLuo);
                cp5WangLuoList.add(cp5WangLuo);
                count++;
            }
        }
        map.put("*list312", cp3WangLuoList);
        map.put("table312", table5UtilList);
        map.put("*list53", cp5WangLuoList);
        map.put("table53", table5UtilList);
        table5UtilList = new ArrayList<>();
        count = 1;

        for (int i = 0; i < questionNaire.sbhjsList.size(); i++) {
            if (!questionNaire.sbhjsList.get(i).sbhjs_sbmc.isEmpty()) {
                Numberings.NumberingBuilder nb1 = Numberings.of(NumberingFormat.LOWER_LETTER);
                Numberings.NumberingBuilder nb2 = Numberings.of(NumberingFormat.LOWER_LETTER);
                Numberings.NumberingBuilder nb3 = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                table5UtilList.add(new Table5Util(i + 1, "设备和计算安全", questionNaire.sbhjsList.get(i).sbhjs_sbmc));
                cp3JiSuan cp3JiSuan = new cp3JiSuan();
                cp5JiSuan cp5JiSuan = new cp5JiSuan();
                cp3JiSuan.setShebei(count + "）" + questionNaire.sbhjsList.get(i).getSbhjs_sbmc());
                cp5JiSuan.setShebei(count + "、" + questionNaire.sbhjsList.get(i).getSbhjs_sbmc());
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313a").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_sfjb));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313a").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_ycgl));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313a").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_xtzy));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313a").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_zyxx));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313a").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_rzjl));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313a").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_zykz));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313b").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_sfjb));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313b").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_ycgl));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313b").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_xtzy));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313b").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_zyxx));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313b").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_rzjl));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list313b").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_zykz));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list54").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_sfjb));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list54").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_ycgl));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list54").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_xtzy));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list54").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_zyxx));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list54").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_rzjl));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list54").eq("scence", questionNaire.sbhjsList.get(i).sbhjs_zykz));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                cp3JiSuan.setList313a(nb1.create());
                cp3JiSuan.setList313b(nb2.create());
                cp5JiSuan.setList54(nb3.create());
                cp3JiSuanList.add(cp3JiSuan);
                cp5JiSuanList.add(cp5JiSuan);
                count++;
            }
        }
        map.put("*list313", cp3JiSuanList);
        map.put("table313", table5UtilList);
        map.put("*list54", cp5JiSuanList);
        map.put("table54", table5UtilList);
        table5UtilList = new ArrayList<>();
        count = 1;

        for (int i = 0; i < questionNaire.yyhsjList.size(); i++) {
            if (!questionNaire.yyhsjList.get(i).yyhsj_ywmc.isEmpty()) {
                Numberings.NumberingBuilder nb1 = Numberings.of(NumberingFormat.LOWER_LETTER);
                Numberings.NumberingBuilder nb2 = Numberings.of(NumberingFormat.LOWER_LETTER);
                Numberings.NumberingBuilder nb3 = Numberings.of(NumberingFormat.DECIMAL_PARENTHESES);
                table5UtilList.add(new Table5Util(i + 1, "应用和数据安全", questionNaire.yyhsjList.get(i).yyhsj_ywmc));
                cp3YingYong cp3YingYong = new cp3YingYong();
                cp5YingYong cp5YingYong = new cp5YingYong();
                cp3YingYong.setYewu(count + "）" + questionNaire.yyhsjList.get(i).yyhsj_ywmc);
                cp5YingYong.setYewu(count + "、" + questionNaire.yyhsjList.get(i).yyhsj_ywmc);
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314a").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_sfjb.get(0)));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314b").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_sfjb.get(0)));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }

                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314a").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_fwkz));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314a").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_xxzy));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }

                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314a").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_csjmx.get(0)));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314b").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_csjmx.get(0)));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }

                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314a").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_ccjmx));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314a").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_cswzx));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314a").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_ccwzx));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314a").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_bkfr));
                if (scencePo != null) {
                    nb1.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314b").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_fwkz));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314b").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_xxzy));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314b").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_ccjmx));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314b").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_cswzx));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314b").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_ccwzx));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list314b").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_bkfr));
                if (scencePo != null) {
                    nb2.addItem(scencePo.getDescription());
                }
                temp = "身份鉴别：";
                for (int j = 0; j < questionNaire.yyhsjList.get(i).yyhsj_sfjb.size(); j++) {
                    scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list55").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_sfjb.get(j)));
                    if (scencePo != null) {
                        temp += scencePo.getDescription();
                    }
                }
                nb3.addItem(temp);
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list55").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_fwkz));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list55").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_xxzy));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                temp = "重要数据传输机密性：";
                for (int j = 0; j < questionNaire.yyhsjList.get(i).yyhsj_csjmx.size(); j++) {
                    scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list55").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_csjmx.get(j)));
                    if (scencePo != null) {
                        temp += scencePo.getDescription();
                    }
                }
                nb3.addItem(temp);
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list55").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_ccjmx));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list55").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_cswzx));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list55").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_ccwzx));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*list55").eq("scence", questionNaire.yyhsjList.get(i).yyhsj_bkfr));
                if (scencePo != null) {
                    nb3.addItem(scencePo.getDescription());
                }
                cp3YingYong.setList314a(nb1.create());
                cp3YingYong.setList314b(nb2.create());
                cp5YingYong.setList55(nb3.create());
                cp3YingYongList.add(cp3YingYong);
                cp5YingYongList.add(cp5YingYong);
                count++;
            }
        }
        map.put("*list314", cp3YingYongList);
        map.put("table314", table5UtilList);
        map.put("*list55", cp5YingYongList);
        map.put("table55", table5UtilList);
        count = 1;

        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "315").eq("scence", questionNaire.sys_glzd));
        if (scencePo != null) {
            temp = scencePo.getDescription();
        }
        map.put("315", temp);

        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "51").eq("scence", questionNaire.sys_mmyyjskj));
        if (scencePo != null) {
            if ("53-03-1".equals(scencePo.getScence())){
                temp = scencePo.getDescription();
                StringBuilder stringBuilder = new StringBuilder(temp);
                stringBuilder.insert(temp.indexOf("2"),'\t');
                stringBuilder.insert(temp.indexOf("密码设备管理平台支持硬件虚拟化")+1,'\t');
                stringBuilder.insert(temp.indexOf("3")+2,'\t');
                temp = stringBuilder.toString();
            }
        }
        map.put("51", temp);
        if ("53-01-1".equals(scencePo.getScence())){
            map.put("img51","/etc/autogen/image/53-01-1.png");
        }else if ("53-02-1".equals(scencePo.getScence())){
            map.put("img51","/etc/autogen/image/53-02-1.png");
        }else if ("53-03-1".equals(scencePo.getScence())){
            map.put("img51","/etc/autogen/image/53-03-1.png");
        }

        Numberings.NumberingBuilder nb = Numberings.of(NumberingFormat.LOWER_LETTER);
        for (int i =0; i<questionNaire.sbqd.size();i++){
            device = deviceMapper.selectOne(new QueryWrapper<Device>().eq("id",questionNaire.sbqd.get(i).getId()));
            if (device != null && !questionNaire.sbqd.get(i).getNum().equals(0)){
                temp = device.getName() + "：" + device.getMs();
                nb.addItem(temp);
            }
        }
        map.put("*list51",nb.create());

        for (int i = 0;i<questionNaire.sbqd.size();i++){
            device = deviceMapper.selectOne(new QueryWrapper<Device>().eq("id",questionNaire.sbqd.get(i).getId()));
            if (device != null){
                table58List.add(new Table58(i+1,device.getName(),device.getLocation(),device.getAlgorithm(),questionNaire.sbqd.get(i).getNum(),device.getDev_function()));
                table8List.add(new Table8(i+1,device.getName(),device.getBrand(),questionNaire.sbqd.get(i).getNum(),device.getRemark()));
            }
        }
        map.put("table58",table58List);
        map.put("table8",table8List);

        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "6").eq("scence", questionNaire.sys_glzd));
        if (scencePo != null) {
            temp = scencePo.getDescription();
        }
        map.put("6", temp);
        return map;
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
