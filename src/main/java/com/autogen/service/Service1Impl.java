package com.autogen.service;

import com.autogen.dao.Mapper.ScenceMapper;
import com.autogen.dao.entity.QuestionNaire;
import com.autogen.dao.entity.ScencePo;
import com.autogen.dao.entity.cp1.Chaptre1input;
import com.autogen.dao.entity.cp2.Chaptre2input;
import com.autogen.dao.entity.table.*;
import com.autogen.dao.entity.cp3.Chaptre3input;
import com.autogen.dao.entity.cp4.Chaptre4input;
import com.autogen.dao.entity.cp5.Chaptre5input;
import com.autogen.dao.entity.cp5.fragment.WangLuo;
import com.autogen.dao.entity.cp6.Chaptre6input;
import com.autogen.dao.entity.cp7.Chaptre7input;
import com.autogen.dao.entity.cp8.Chaptre8input;
import com.autogen.service.atgInterface.AutoGenerator;
import com.autogen.service.atgInterface.AutoGeneratorImpl;
import com.autogen.service.fileapi.IOManager;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
        List<Table213> table213List = new ArrayList<>();
        table213List.add(new Table213(1, "{{sysname}}", "单位内普通用户", "业务操作"));
        table213List.add(new Table213(2, "{{sysname}}", "系统管理员", "管理业务系统"));
        table213List.add(new Table213(3, "{{sysname}}", "系统运维人员", "系统运维"));
        table213List.add(new Table213(4, "{{sysname}}", "公众用户", ""));
        c2.table213List = table213List;
        List<Table25> table25List = new ArrayList<>();
        table25List.add((new Table25(1, "业务服务器", "业务服务", "500G", "2")));
        table25List.add((new Table25(2, "数据库服务器", "数据库服务", "500G", "2")));
        table25List.add((new Table25(3, "服务器", "其他服务", "500G", "2")));
        c2.table25List = table25List;
        c2.staff = "单位内普通用户、系统管理员、系统运维人员和公众用户";
        c2.s222 = (String) map.get("222");
        c2.business = "[这里从调研表填入业务说明]";
        c2.db = "[这里从调研表填入数据库信息]";
        c2.os = "[这里从调研表填入操作系统信息]";
        c2.s25 = (String) map.get("25");

        //第三章
        c3.system_name = questionNaire.sys_name;
        c3.list311a = (List<String>) map.get("*311alist");
        c3.list311b = (List<String>) map.get("*311blist");
        c3.list312a = (List<String>) map.get("*312alist");
        c3.list312b = (List<String>) map.get("*312blist");
        c3.list313a = (List<String>) map.get("*313alist");
        c3.list313b = (List<String>) map.get("*313blist");
        c3.list314a = (List<String>) map.get("*314alist");
        c3.list314b = (List<String>) map.get("*314blist");
        c3.s315 = (String) map.get("315");

        //第四章
        c4.system_name = questionNaire.sys_name;

        //第五章
        c5.system_name = questionNaire.sys_name;
        c5.s52 = (String) map.get("52");
        c5.s51 = (String) map.get("51");
        List<String> list51 = new ArrayList<>();
        list51.add("[这里获取网页传入产品id，从数据库筛选产品描述填入]");
        list51.add("[这里获取网页传入产品id，从数据库筛选产品描述填入]");
        list51.add("[这里获取网页传入产品id，从数据库筛选产品描述填入]");
        c5.list51 = list51;
        c5.list52 = (List<String>) map.get("*52list");
        List<Table5Util> table52 = new ArrayList<>();
        table52.add(new Table5Util(1,"物理和环境安全","机房1"));
        table52.add(new Table5Util(2,"物理和环境安全","机房2"));
        c5.table52List = table52;

        Numberings.NumberingBuilder nb1 = Numberings.ofDecimalParentheses();
        Numberings.NumberingBuilder nb2 = Numberings.ofDecimalParentheses();
        WangLuo data1 = new WangLuo();
        WangLuo data2 = new WangLuo();
        List<WangLuo> list53 = new ArrayList<>();
        int count = 1;
        for (String s : questionNaire.ts_wlhtxaq) {
            if (s.indexOf("52-01") == 0) {
                if (s.indexOf("52-01-1") == 0){
                    data1.setTongdao(count + "、XXX网IPSec VPN与IPSec VPN之间的通信信道");
                    count++;
                }
                nb1.addItem(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*netlist").eq("scence", s)).getDescription());
            } else if (s.indexOf("52-02") == 0) {
                if (s.indexOf("52-02-1") == 0){
                    data2.setTongdao(count + "、互联网VPN客户端与内网SSL VPN之间的通信信道");
                    count++;
                }
                nb2.addItem(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*netlist").eq("scence", s)).getDescription());
            }
        }
        data1.setNetlist(nb1.create());
        data2.setNetlist(nb2.create());
        list53.add(data1);
        list53.add(data2);
        c5.list53 = list53;
        List<Table5Util> table53 = new ArrayList<>();
        table53.add(new Table5Util(1,"网络和通信安全","通道1"));
        table53.add(new Table5Util(2,"网络和通信安全","通道2"));
        c5.table53List = table53;

        c5.list54 = (List<String>) map.get("*54list");
        List<Table5Util> table54 = new ArrayList<>();
        table54.add(new Table5Util(1,"设备和计算安全","设备1"));
        table54.add(new Table5Util(2,"设备和计算安全","设备2"));
        c5.table54List = table54;

        c5.list55 = (List<String>) map.get("*55list");
        List<Table5Util> table55 = new ArrayList<>();
        table55.add(new Table5Util(1,"应用和数据安全","设备1"));
        table55.add(new Table5Util(2,"应用和数据安全","设备2"));
        c5.table55List = table55;

        List<Table58> table58List = new ArrayList<>();
        table58List.add(new Table58(1, "服务器密码机", "基础设施区", "SM1/2/3/4", 2, "功能描述"));
        table58List.add(new Table58(2, "时间戳服务器", "基础设施区", "SM1/2/3/4", 2, "功能描述"));
        table58List.add(new Table58(3, "签名验签服务器", "基础设施区", "SM1/2/3/4", 2, "功能描述"));
        c5.table58List = table58List;

        //第六章
        c6.system_name = questionNaire.sys_name;
        c6.s6 = (String) map.get("6");

        //第七章
        c7.system_name = questionNaire.sys_name;

        //第八章
        List<Table8> table8List = new ArrayList<>();
        table8List.add(new Table8(1, "服务器密码机", "品牌", 2));
        table8List.add(new Table8(2, "时间戳服务器", "品牌", 2));
        table8List.add(new Table8(3, "签名验签服务器", "品牌", 2));
        c8.system_name = questionNaire.sys_name;
        c8.table8List = table8List;
    }

    @Override
    @Transactional
    public Map<String, Object> selectDes(QuestionNaire questionNaire) {
        Map<String, Object> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put("222", scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "222").eq("scence", questionNaire.wlhhj_sfjb)).getDescription());
        map.put("25", scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "25").eq("scence", questionNaire.ts_glzd)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*311alist").eq("scence", questionNaire.wlhhj_sfjb)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*311alist").eq("scence", questionNaire.wlhhj_dzmj)).getDescription());
        map.put("*311alist", list);
        list = new ArrayList<>();
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*311blist").eq("scence", questionNaire.wlhhj_sfjb)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*311blist").eq("scence", questionNaire.wlhhj_dzmj)).getDescription());
        map.put("*311blist", list);

        list = new ArrayList<>();
        if (questionNaire.ts_wlhtxaq.contains("52-01-1")) {
            list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*312alist").eq("scence", "52-01-1")).getDescription());
        }
        if (questionNaire.ts_wlhtxaq.contains("52-02-1")) {
            list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*312alist").eq("scence", "52-02-1")).getDescription());
        }
        map.put("*312alist", list);
        list = new ArrayList<>();
        if (questionNaire.ts_wlhtxaq.contains("52-01-1")) {
            list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*312blist").eq("scence", "52-01-1")).getDescription());
        }
        if (questionNaire.ts_wlhtxaq.contains("52-02-1")) {
            list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*312blist").eq("scence", "52-02-1")).getDescription());
        }
        map.put("*312blist", list);
        list = new ArrayList<>();
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313alist").eq("scence", questionNaire.sbhjs_sfjb)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313alist").eq("scence", questionNaire.sbhjs_ycgl)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313alist").eq("scence", questionNaire.sbhjs_xtzy)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313alist").eq("scence", questionNaire.sbhjs_zyxx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313alist").eq("scence", questionNaire.sbhjs_rzjl)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313alist").eq("scence", questionNaire.sbhjs_zykz)).getDescription());
        map.put("*313alist", list);
        list = new ArrayList<>();
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313blist").eq("scence", questionNaire.sbhjs_sfjb)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313blist").eq("scence", questionNaire.sbhjs_ycgl)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313blist").eq("scence", questionNaire.sbhjs_xtzy)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313blist").eq("scence", questionNaire.sbhjs_zyxx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313blist").eq("scence", questionNaire.sbhjs_rzjl)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*313blist").eq("scence", questionNaire.sbhjs_zykz)).getDescription());
        map.put("*313blist", list);
        list = new ArrayList<>();
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314alist").eq("scence", questionNaire.yyhsj_sfjb.get(0))).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314alist").eq("scence", questionNaire.yyhsj_fwkz)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314alist").eq("scence", questionNaire.yyhsj_xxzy)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314alist").eq("scence", questionNaire.yyhsj_csjmx.get(0))).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314alist").eq("scence", questionNaire.yyhsj_ccjmx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314alist").eq("scence", questionNaire.yyhsj_cswzx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314alist").eq("scence", questionNaire.yyhsj_ccwzx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314alist").eq("scence", questionNaire.yyhsj_bkfr)).getDescription());
        map.put("*314alist", list);
        list = new ArrayList<>();
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314blist").eq("scence", questionNaire.yyhsj_sfjb.get(0))).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314blist").eq("scence", questionNaire.yyhsj_fwkz)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314blist").eq("scence", questionNaire.yyhsj_xxzy)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314blist").eq("scence", questionNaire.yyhsj_csjmx.get(0))).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314blist").eq("scence", questionNaire.yyhsj_ccjmx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314blist").eq("scence", questionNaire.yyhsj_cswzx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314blist").eq("scence", questionNaire.yyhsj_ccwzx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*314blist").eq("scence", questionNaire.yyhsj_bkfr)).getDescription());
        map.put("*314blist", list);
        list = new ArrayList<>();
        map.put("315", scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "315").eq("scence", questionNaire.ts_glzd)).getDescription());
        map.put("51", scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "51").eq("scence", questionNaire.ts_mmyy)).getDescription());
        map.put("52", scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "52").eq("scence", questionNaire.wlhhj_sfjb)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*52list").eq("scence", questionNaire.wlhhj_sfjb)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*52list").eq("scence", questionNaire.wlhhj_dzmj)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*52list").eq("scence", questionNaire.wlhhj_spjk)).getDescription());
        map.put("*52list", list);

        list = new ArrayList<>();
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*54list").eq("scence", questionNaire.sbhjs_sfjb)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*54list").eq("scence", questionNaire.sbhjs_ycgl)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*54list").eq("scence", questionNaire.sbhjs_xtzy)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*54list").eq("scence", questionNaire.sbhjs_zyxx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*54list").eq("scence", questionNaire.sbhjs_rzjl)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*54list").eq("scence", questionNaire.sbhjs_zykz)).getDescription());
        map.put("*54list", list);
        list = new ArrayList<>();
        StringBuilder out = new StringBuilder();
        String temp = "";
        for (int i = 0; i < questionNaire.yyhsj_sfjb.size(); i++) {
            if (i != 0) {
                temp = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_sfjb.get(i))).getDescription();
                out.append(temp.substring(temp.indexOf("：") + 1));
            } else {
                out = new StringBuilder(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_sfjb.get(i))).getDescription());
            }
        }
        list.add(out.toString());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_fwkz)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_xxzy)).getDescription());
        for (int i = 0; i < questionNaire.yyhsj_csjmx.size(); i++) {
            if (i != 0) {
                temp = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_csjmx.get(i))).getDescription();
                out.append(temp.substring(temp.indexOf("：") + 1));
            } else {
                out = new StringBuilder(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_csjmx.get(i))).getDescription());
            }
        }
        list.add(out.toString());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_ccjmx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_cswzx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_ccwzx)).getDescription());
        list.add(scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*55list").eq("scence", questionNaire.yyhsj_bkfr)).getDescription());
        map.put("*55list", list);
        map.put("6", scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "6").eq("scence", questionNaire.ts_glzd)).getDescription());

        return map;
    }

    @Override
    @Transactional
    public void generate() throws Exception {
        AutoGenerator autoGenerator = new AutoGeneratorImpl();
//        XWPFDocument doc1 = autoGenerator.chapter_one_generator(getC1());
//        XWPFDocument doc2 = autoGenerator.chapter_two_generator(getC2());
//        XWPFDocument doc3 = autoGenerator.chapter_three_generator(getC3());
//        XWPFDocument doc4 = autoGenerator.chapter_four_generator(getC4());
        XWPFDocument doc5 = autoGenerator.chapter_five_generator(getC5());
//        XWPFDocument doc6 = autoGenerator.chapter_six_generator(getC6());
//        XWPFDocument doc7 = autoGenerator.chapter_seven_generator(getC7());
//        XWPFDocument doc8 = autoGenerator.chapter_eight_generator(getC8());
        //NiceXWPFDocument completeDoc = IOManager.mergeFile((NiceXWPFDocument) doc1, (NiceXWPFDocument) doc2, (NiceXWPFDocument) doc3, (NiceXWPFDocument) doc4, (NiceXWPFDocument) doc5, (NiceXWPFDocument) doc6, (NiceXWPFDocument) doc7, (NiceXWPFDocument) doc8);
        //IOManager.writeFile(completeDoc, "/home/ubuntu/Desktop/code_package/complete_example.docx");
        IOManager.writeFile(doc5,"5_example.docx");
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
