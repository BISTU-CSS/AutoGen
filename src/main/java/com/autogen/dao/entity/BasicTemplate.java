package com.autogen.dao.entity;

import com.autogen.dao.entity.cp1.Chaptre1input;
import com.autogen.dao.entity.cp2.fragment.Table25;
import com.autogen.dao.entity.cp4.Chaptre4input;
import com.autogen.dao.entity.cp5.Chaptre5input;
import com.autogen.dao.entity.cp5.fragment.Table55;
import com.autogen.dao.entity.cp2.Chaptre2input;
import com.autogen.dao.entity.cp2.fragment.Table213;
import com.autogen.dao.entity.cp3.Chaptre3input;
import com.autogen.dao.entity.cp5.fragment.WangLuo;
import com.autogen.dao.entity.cp6.Chaptre6input;
import com.autogen.dao.entity.cp7.Chaptre7input;
import com.autogen.dao.entity.cp8.Chaptre8input;
import com.autogen.dao.entity.cp8.fragment.Table8;
import com.deepoove.poi.data.Numberings;

import java.util.ArrayList;
import java.util.List;

/**
 * 把所有输入进行解析，然后生成自动生成所需要的东西
 */
public class BasicTemplate {

    /**
     * 处理输入的调研表和需要的产品，生成各个章节的输入参数
     *
     * @param questionNaire 调研表问题答案
     * @param productName   产品名称列表
     */
    public BasicTemplate(QuestionNaire questionNaire, List<String> productName) {
        c1 = new Chaptre1input();
        c2 = new Chaptre2input();
        c3 = new Chaptre3input();
        c4 = new Chaptre4input();
        c5 = new Chaptre5input();
        c6 = new Chaptre6input();
        c7 = new Chaptre7input();
        c8 = new Chaptre8input();

        //第一章
        c1.system_name = questionNaire.question_1;

        //第二章
        c2.system_name = questionNaire.question_1;
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
        c2.s222 = "[这里从数据库填入机房情况]";
        c2.business = "[这里从调研表填入业务说明]";
        c2.db = "[这里从调研表填入数据库信息]";
        c2.os = "[这里从调研表填入操作系统信息]";
        c2.s25 = "[这里从数据库填入管理制度情况]";

        //第三章
        c3.system_name = questionNaire.question_1;
        List<String> list311 = new ArrayList<>();
        list311.add("[这里从数据库填入风险分析]");
        list311.add("[这里从数据库填入风险分析]");
        c3.list311a = list311;
        c3.list311b = list311;
        c3.list312a = list311;
        c3.list312b = list311;
        c3.list313a = list311;
        c3.list313b = list311;
        c3.list314a = list311;
        c3.list314b = list311;
        c3.s315 = "[这里从数据库填入密码安全管理]";

        //第四章
        c4.system_name = questionNaire.question_1;

        //第五章
        c5.system_name = questionNaire.question_1;
        List<Table55> table55List = new ArrayList<>();
        table55List.add(new Table55(1, "服务器密码机","功能","硬件",2,"备注"));
        table55List.add(new Table55(2, "时间戳服务器","功能","硬件",2,"备注"));
        table55List.add(new Table55(3, "签名验签服务器","功能","硬件",2,"备注"));
        c5.table55List = table55List;
        c5.s531 = "[这里从数据库填入物理描述]";
        c5.s51 = "[这里从数据库填入场景描述]";

        List<String> list531 = new ArrayList<>();
        list531.add("[身份鉴别]");
        list531.add("[视频完整性]");
        c5.list531 = list531;

        List<WangLuo> list532 = new ArrayList<>();
        WangLuo date0 =new WangLuo();
        date0.setTongdao("[这里填入通道1]");
        date0.setNetlist(Numberings.ofDecimalParentheses("身份鉴别","网络完整性").create());
        WangLuo date1 =new WangLuo();
        date1.setTongdao("[这里填入通道2]");
        date1.setNetlist(Numberings.ofDecimalParentheses("身份鉴别","网络完整性").create());
        list532.add(date0);
        list532.add(date1);
        c5.list532 = list532;

        List<String> list533 = new ArrayList<>();
        list533.add("[身份鉴别]");
        list533.add("[设备完整性]");
        c5.list533 = list533;

        List<String> list534 = new ArrayList<>();
        list534.add("[身份鉴别]");
        list534.add("[数据完整性]");
        c5.list534 = list534;

        //第六章
        c6.system_name = questionNaire.question_1;
        c6.s6 = "[这里从数据库填入制度描述]";

        //第七章
        c7.system_name = questionNaire.question_1;

        //第八章
        List<Table8> table8List = new ArrayList<>();
        table8List.add(new Table8(1,"服务器密码机","品牌",2));
        table8List.add(new Table8(2,"时间戳服务器","品牌",2));
        table8List.add(new Table8(3,"签名验签服务器","品牌",2));
        c8.system_name = questionNaire.question_1;
        c8.table8List = table8List;
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
