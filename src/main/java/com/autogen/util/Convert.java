package com.autogen.util;

import com.autogen.dao.entity.input.*;
import org.apache.batik.gvt.CompositeGraphicsNode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Convert {
    public static void convertToText(QuestionNaire questionNaire) {
        List<String> sys_sshy = new ArrayList<String>() {{
            add("公安");
            add("医疗");
            add("电信");
            add("金融");
            add("能源");
            add("教育");
            add("交通");
            add("政务");
            add("工控");
        }};
        List<String> sys_xmlx = new ArrayList<String>() {{
            add("单系统模式");
            add("多系统模式");
            add("云租户模式");
            add("云租户+云平台模式");
        }};
        List<String> sys_xtjs = new ArrayList<String>() {{
            add("未建设");
            add("正在建设");
            add("已上线");
        }};
        List<String> sys_dbjb = new ArrayList<String>() {{
            add("二级");
            add("三级");
            add("四级");
        }};
        List<String> sys_mpsc = new ArrayList<String>() {{
            add("首次");
            add("做过,未通过");
            add("做过,已通过");
        }};
        List<String> sys_mmzd = new ArrayList<String>() {{
            add("未建设");
            add("已建设");
        }};
        List<String> sys_ysbs = new ArrayList<String>() {{
            add("在云上");
            add("不在云上");
        }};
        List<String> sys_rzys = new ArrayList<String>() {{
            add("云平台已过密评");
            add("云平台尚未过密评");
            add("");
        }};
        List<String> mpjb_fwd = new ArrayList<String>() {{
            add("HTTPS");
            add("HTTP");
            add("其他");
        }};
        List<String> mpjb_ydd = new ArrayList<String>() {{
            add("无");
            add("手机APP");
            add("微信小程序");
        }};
        List<String> mpjb_sfrz = new ArrayList<String>() {{
            add("人工登记");
            add("IC卡");
            add("生物技术");
            add("口令");
            add("手机短信");
        }};
        List<String> mpjb_fwfs = new ArrayList<String>() {{
            add("不支持");
            add("PC浏览器");
            add("手机APP");
            add("公众号");
            add("微信小程序");
        }};
        List<String> mpjb_yjzd = new ArrayList<String>() {{
            add("无");
            add("视频摄像头");
            add("传感器");
            add("手持办公设备");
        }};
        List<String> mpjb_sjk = new ArrayList<String>() {{
            add("Oracle");
            add("SQL Server");
            add("MySQL");
        }};
        List<String> wu = new ArrayList<String>() {{
            add("无");
        }};
        List<String> ywxq = new ArrayList<String>() {{
            add("无需求");
            add("有需求");
        }};
        List<String> sys_xtyh_yh = new ArrayList<String>() {{
            add("运维人员");
            add("系统管理员");
            add("普通用户");
            add("公众用户");
        }};
        List<String> sys_xtyh_dlfs = new ArrayList<String>() {{
            add("PC浏览器");
            add("PC客户端");
            add("手机APP");
            add("微信小程序");
        }};
        List<String> sys_xtyh_sfrz = new ArrayList<String>() {{
            add("U盘证书");
            add("用户名+口令");
            add("手机短信");
            add("邮箱验证");
            add("直接访问，无需认证");
        }};
        List<String> sys_xtyh_szwl = new ArrayList<String>() {{
            add("互联网");
            add("政务外网");
            add("专网");
            add("内网");
        }};
        List<String> sys_wlhhj_jflx = new ArrayList<String>() {{
            add("新机房");
            add("旧机房");
            add("租机房");
        }};
        List<String> sys_wlhhj_mj = new ArrayList<String>() {{
            add("国密电子");
            add("普通电子");
            add("非电子");
            add("无");
        }};
        List<String> sys_wlhhj_sfrz = new ArrayList<String>() {{
            add("用户名+口令");
            add("IC卡");
            add("U盘证书");
            add("手机短信");
            add("生物技术");
            add("人工登记");
        }};
        List<String> sys_wlhhj_spjk = new ArrayList<String>() {{
            add("国密");
            add("普通");
            add("无");
        }};
        List<String> sys_wlhtx_txzt = new ArrayList<String>() {{
            add("运维人员");
            add("PC浏览器");
            add("PC-客户端");
            add("移动APP");
            add("微信小程序");
        }};
        List<String> sys_wlhtx_sfrz = new ArrayList<String>() {{
            add("U盘证书");
            add("用户名+口令");
            add("手机短信");
            add("邮箱验证");
            add("直接访问，无需认证");
            add("服务器证书");
            add("设备证书");
        }};
        List<String> sys_fwq_czxt = new ArrayList<String>() {{
            add("Linux");
            add("Windows");
            add("UNIX");
        }};
        List<String> sys_fwq_sjk = new ArrayList<String>() {{
            add("Oracle");
            add("MySQL");
            add("SQL Server");
            add("MongoDB");
            add("DB2");
            add("PostgreSQL");
            add("无");
        }};
        List<String> sys_sfrz = new ArrayList<String>() {{
            add("用户名+口令");
            add("U盘证书");
            add("手机短信");
            add("生物技术");
        }};
        List<String> sf = new ArrayList<String>() {{
            add("是");
            add("否");
        }};
        List<String> sys_ywyy_bkfr = new ArrayList<String>() {{
            add("没有需求");
            add("有需求&未做");
            add("有需求&已做");
        }};
        List<String> sys_ywyy_ccjm = new ArrayList<String>() {{
            add("国密");
            add("非国密");
            add("未加密");
        }};
        List<String> sys_ywyy_csjm = new ArrayList<String>() {{
            add("不涉及");
            add("国密");
            add("非国密");
            add("未加密");
        }};
        List<String> sys_ywyy_sjlx = new ArrayList<String>() {{
            add("鉴别数据");
            add("重要业务数据");
            add("重要审计数据");
            add("个人敏感信息");
            add("法律法规规定的其他重要数");
            add("访问控制信息");
        }};
        if ("10".equals(questionNaire.getSys_sshy())){
            questionNaire.setSys_sshy(questionNaire.getSys_sshy_qt());
        }else {
            questionNaire.setSys_sshy(setString(questionNaire.getSys_sshy(), sys_sshy));
        }
        questionNaire.setSys_xmlx(setString(questionNaire.getSys_xmlx(), sys_xmlx));
        questionNaire.setSys_xtjs(setString(questionNaire.getSys_xtjs(), sys_xtjs));
        questionNaire.setSys_dbjb(setString(questionNaire.getSys_dbjb(), sys_dbjb));
        questionNaire.setSys_mpsc(setString(questionNaire.getSys_mpsc(), sys_mpsc));
        questionNaire.setSys_mmzd(setString(questionNaire.getSys_mmzd(), sys_mmzd));
        questionNaire.setSys_ysbs(setString(questionNaire.getSys_ysbs(), sys_ysbs));
        questionNaire.setSys_rzys(setString(questionNaire.getSys_rzys(), sys_rzys));
        questionNaire.setMpjb_fwd(setString(questionNaire.getMpjb_fwd(), mpjb_fwd));
        questionNaire.setMpjb_ydd(setList(questionNaire.getMpjb_ydd(), mpjb_ydd));
        List<InputTable22> table22List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable22List().size(); i++) {
            InputTable22 table22 = new InputTable22();
            table22.setYwyy(questionNaire.getInputTable22List().get(i).getYwyy());
            table22.setYh(setString(questionNaire.getInputTable22List().get(i).getYh(), sys_xtyh_yh));
            table22.setDlfs(setList(questionNaire.getInputTable22List().get(i).getDlfs(), sys_xtyh_dlfs));
            table22.setSfrz(setList(questionNaire.getInputTable22List().get(i).getSfrz(), sys_xtyh_sfrz));
            table22.setSzwl(setList(questionNaire.getInputTable22List().get(i).getSzwl(), sys_xtyh_szwl));
            table22.setSl(questionNaire.getInputTable22List().get(i).getSl());
            table22List.add(table22);
        }
        questionNaire.setInputTable22List(table22List);
        List<InputTable23> table23List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable23List().size(); i++) {
            InputTable23 table23 = new InputTable23();
            table23.setJfmc(questionNaire.getInputTable23List().get(i).getJfmc());
            table23.setJflx(setString(questionNaire.getInputTable23List().get(i).getJflx(), sys_wlhhj_jflx));
            table23.setMj(setString(questionNaire.getInputTable23List().get(i).getMj(), sys_wlhhj_mj));
            table23.setSfrz(setList(questionNaire.getInputTable23List().get(i).getSfrz(), sys_wlhhj_sfrz));
            table23.setSpjk(setString(questionNaire.getInputTable23List().get(i).getSpjk(), sys_wlhhj_spjk));
            table23.setZjsb(setString(questionNaire.getInputTable23List().get(i).getZjsb(),sf));
            table23List.add(table23);
        }
        questionNaire.setInputTable23List(table23List);
        List<InputTable24> table24List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable24List().size(); i++) {
            InputTable24 table24 = new InputTable24();
            table24.setType(questionNaire.getInputTable24List().get(i).getType());
            table24.setTxzt(setString(questionNaire.getInputTable24List().get(i).getTxzt(), sys_wlhtx_txzt));
            table24.setSfrz(setList(questionNaire.getInputTable24List().get(i).getSfrz(), sys_wlhtx_sfrz));
            table24.setZysj(setString(questionNaire.getInputTable24List().get(i).getZysj(), sf));
            table24.setSl(questionNaire.getInputTable24List().get(i).getSl());
            table24.setSm(questionNaire.getInputTable24List().get(i).getSm());
            table24.setCpdx(questionNaire.getInputTable24List().get(i).getCpdx());
            table24List.add(table24);
        }
        questionNaire.setInputTable24List(table24List);
        List<InputTable25> table25List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable25List().size(); i++) {
            InputTable25 table25 = new InputTable25();
            table25.setSbmc(questionNaire.getInputTable25List().get(i).getSbmc());
            table25.setPpxh(questionNaire.getInputTable25List().get(i).getPpxh());
            table25.setSl(questionNaire.getInputTable25List().get(i).getSl());
            table25.setCzxt(setString(questionNaire.getInputTable25List().get(i).getCzxt(), sys_fwq_czxt));
            table25.setSjk(setString(questionNaire.getInputTable25List().get(i).getSjk(), sys_fwq_sjk));
            table25.setYcyw(setString(questionNaire.getInputTable25List().get(i).getYcyw(), sf));
            table25.setSfrz(setList(questionNaire.getInputTable25List().get(i).getSfrz(), sys_sfrz));
            table25.setBlj(setString(questionNaire.getInputTable25List().get(i).getBlj(), sf));
            table25List.add(table25);
        }
        questionNaire.setInputTable25List(table25List);
        List<InputTable26> table26List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable26List().size(); i++) {
            InputTable26 table26 = new InputTable26();
            table26.setType(questionNaire.getInputTable26List().get(i).getType());
            table26.setSbmc(questionNaire.getInputTable26List().get(i).getSbmc());
            table26.setPpxh(questionNaire.getInputTable26List().get(i).getPpxh());
            table26.setSl(questionNaire.getInputTable26List().get(i).getSl());
            table26.setGmsf(setString(questionNaire.getInputTable26List().get(i).getGmsf(), sf));
            table26.setSmzs(setString(questionNaire.getInputTable26List().get(i).getSmzs(), sf));
            table26.setYcyw(setString(questionNaire.getInputTable26List().get(i).getYcyw(), sf));
            table26.setSfrz(setList(questionNaire.getInputTable26List().get(i).getSfrz(), sys_sfrz));
            table26.setBlj(setString(questionNaire.getInputTable26List().get(i).getBlj(), sf));
            table26List.add(table26);
        }
        questionNaire.setInputTable26List(table26List);
        List<InputTable27> table27List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable27List().size(); i++) {
            InputTable27 table27 = new InputTable27();
            table27.setYwyy(questionNaire.getInputTable27List().get(i).getYwyy());
            table27.setGnms(questionNaire.getInputTable27List().get(i).getGnms());
            table27.setFwfs(setString(questionNaire.getInputTable27List().get(i).getFwfs(), mpjb_fwd));
            table27.setBkfr(setString(questionNaire.getInputTable27List().get(i).getBkfr(), sys_ywyy_bkfr));
            table27.setJtqk1(questionNaire.getInputTable27List().get(i).getJtqk1());
            table27.setDzqm(setString(questionNaire.getInputTable27List().get(i).getDzqm(), sys_ywyy_bkfr));
            table27.setJtqk2(questionNaire.getInputTable27List().get(i).getJtqk2());
            table27List.add(table27);
        }
        questionNaire.setInputTable27List(table27List);
        List<InputTable28> table28List = new ArrayList<>();
        for (int i = 0; i < questionNaire.getInputTable28List().size(); i++) {
            InputTable28 table28 = new InputTable28();
            table28.setYwyy(questionNaire.getInputTable28List().get(i).getYwyy());
            table28.setSjlx(setString(questionNaire.getInputTable28List().get(i).getSjlx(), sys_ywyy_sjlx));
            table28.setSjnr(questionNaire.getInputTable28List().get(i).getSjnr());
            table28.setBhxq(questionNaire.getInputTable28List().get(i).getBhxq());
            table28.setCcjm(setString(questionNaire.getInputTable28List().get(i).getCcjm(), sys_ywyy_ccjm));
            table28.setSjl(questionNaire.getInputTable28List().get(i).getSjl());
            table28.setCsjm(setString(questionNaire.getInputTable28List().get(i).getCsjm(), sys_ywyy_csjm));
            table28.setLl(questionNaire.getInputTable28List().get(i).getLl());
            table28List.add(table28);
        }
        questionNaire.setInputTable28List(table28List);
    }

    public static String setString(String str, List<String> list) {
        if (StringUtils.isNumeric(str)) {
            str = list.get(Integer.parseInt(str) - 1);
        }
        return str;
    }

    public static List<String> setList(List<String> strList, List<String> list) {
        List<String> resList = new ArrayList<>();
        for (int i = 0; i < strList.size(); i++) {
            String str = strList.get(i);
            if (StringUtils.isNumeric(str)) {
                resList.add(list.get(Integer.parseInt(str) - 1));
            } else {
                resList.add(strList.get(i));
            }
        }
        return resList;
    }

    public static Concent convertToSence(QuestionNaire questionNaire) {
        Concent concent = new Concent();
        concent.setSys_sshy(questionNaire.getSys_sshy());
        concent.setSys_xmlx(questionNaire.getSys_xmlx());
        concent.setSys_name(questionNaire.getSys_name());
        concent.setSys_unit(questionNaire.getSys_unit());
        concent.setSys_dbjb(questionNaire.getSys_dbjb());
        concent.setSys_xtjs(questionNaire.getSys_xtjs());
        concent.setSys_mpsc(questionNaire.getSys_mpsc());
        concent.setSys_mmzd(questionNaire.getSys_mmzd());
        concent.setSys_ysbs(questionNaire.getSys_ysbs());
        concent.setSys_rzys(questionNaire.getSys_rzys());
        List<Product> sbqdList = new ArrayList<>();
        List<Wlhhj> wlhhjList = new ArrayList<>();
        List<Wlhtx> wlhtxList = new ArrayList<>();
        List<Sbhjs> sbhjsList = new ArrayList<>();
        List<Yyhsj> yyhsjList = new ArrayList<>();
        for (int i = 0; i < questionNaire.getSbqd().size(); i++) {
            Product product = questionNaire.getSbqd().get(i);
            if (!"0".equals(product.getNum())) {
                sbqdList.add(product);
            }
        }
        convertWlhhj(questionNaire, wlhhjList, sbqdList);
        convertWlhtx(questionNaire, wlhtxList, sbqdList);
        convertSbhjx(questionNaire, sbhjsList, sbqdList);
        convertYyhsj(questionNaire, yyhsjList, sbqdList);
        concent.setWlhhjList(wlhhjList);
        concent.setWlhtxList(wlhtxList);
        concent.setSbhjsList(sbhjsList);
        concent.setYyhsjList(yyhsjList);
        concent.setSbqd(sbqdList);
        return concent;
    }

    private static void convertWlhhj(QuestionNaire questionNaire, List<Wlhhj> wlhhjList, List<Product> sbqdList) {
        List<String> sbqdStrList = new ArrayList<>();
        for (int i=0;i<sbqdList.size();i++){
            sbqdStrList.add(sbqdList.get(i).getName());
        }
        for (int i = 0; i < questionNaire.getInputTable23List().size(); i++) {
            Wlhhj wlhhj = new Wlhhj();
            InputTable23 table23 = questionNaire.getInputTable23List().get(i);
            wlhhj.setWlhhj_jfmc(table23.getJfmc());
            if (sbqdStrList.contains("安全门禁系统")) {
                if ("1".equals(table23.getJflx()) && "1".equals(table23.getMj())) {
                    wlhhj.setWlhhj_sfjb("11-00-1");
                    wlhhj.setWlhhj_dzmj("12-00-1");
                } else if ("3".equals(table23.getJflx()) && !"1".equals(table23.getMj())) {
                    wlhhj.setWlhhj_sfjb("11-01-1");
                    wlhhj.setWlhhj_dzmj("12-01-1");
                } else if ("2".equals(table23.getJflx()) && !"1".equals(table23.getMj())) {
                    wlhhj.setWlhhj_sfjb("11-03-1");
                    wlhhj.setWlhhj_dzmj("12-03-1");
                } else {
                    wlhhj.setWlhhj_sfjb("11-05-1");
                    wlhhj.setWlhhj_dzmj("12-05-1");
                }
            } else {
                if ("1".equals(table23.getJflx()) && "1".equals(table23.getMj())) {
                    wlhhj.setWlhhj_sfjb("11-00-2");
                    wlhhj.setWlhhj_dzmj("12-00-2");
                } else if ("3".equals(table23.getJflx()) && !"1".equals(table23.getMj())) {
                    wlhhj.setWlhhj_sfjb("11-01-2");
                    wlhhj.setWlhhj_dzmj("12-01-2");
                } else if ("3".equals(table23.getJflx()) && "1".equals(table23.getMj())) {
                    wlhhj.setWlhhj_sfjb("11-02-1");
                    wlhhj.setWlhhj_dzmj("12-02-1");
                } else if ("2".equals(table23.getJflx()) && !"1".equals(table23.getMj())) {
                    wlhhj.setWlhhj_sfjb("11-03-2");
                    wlhhj.setWlhhj_dzmj("12-03-2");
                } else if ("2".equals(table23.getJflx()) && "1".equals(table23.getMj())) {
                    wlhhj.setWlhhj_sfjb("11-04-1");
                    wlhhj.setWlhhj_dzmj("12-04-1");
                } else {
                    wlhhj.setWlhhj_sfjb("11-05-1");
                    wlhhj.setWlhhj_dzmj("12-05-1");
                }
            }
            if (sbqdStrList.contains("国密视频监控系统")) {
                if ("1".equals(table23.getJflx()) && "1".equals(table23.getSpjk())) {
                    wlhhj.setWlhhj_spjk("13-00-1");
                } else if ("3".equals(table23.getJflx()) && !"1".equals(table23.getSpjk())) {
                    wlhhj.setWlhhj_spjk("13-01-1");
                } else if ("2".equals(table23.getJflx()) && !"1".equals(table23.getSpjk())) {
                    wlhhj.setWlhhj_spjk("13-03-1");
                } else {
                    wlhhj.setWlhhj_spjk("13-05-1");
                }
            } else {
                if ("1".equals(table23.getJflx()) && "1".equals(table23.getSpjk())) {
                    wlhhj.setWlhhj_spjk("13-00-2");
                } else if ("3".equals(table23.getJflx()) && !"1".equals(table23.getSpjk())) {
                    wlhhj.setWlhhj_spjk("13-01-2");
                } else if ("3".equals(table23.getJflx()) && "1".equals(table23.getSpjk())) {
                    wlhhj.setWlhhj_spjk("13-02-1");
                } else if ("2".equals(table23.getJflx()) && !"1".equals(table23.getSpjk())) {
                    wlhhj.setWlhhj_spjk("13-03-2");
                } else if ("2".equals(table23.getJflx()) && "1".equals(table23.getSpjk())) {
                    wlhhj.setWlhhj_spjk("13-04-1");
                } else {
                    wlhhj.setWlhhj_spjk("13-05-1");
                }
            }
//            }
            wlhhjList.add(wlhhj);
        }
    }

    private static void convertWlhtx(QuestionNaire questionNaire, List<Wlhtx> wlhtxList, List<Product> sbqdList) {
        List<String> sbqdStrList = new ArrayList<>();
        for (int i=0;i<sbqdList.size();i++){
            sbqdStrList.add(sbqdList.get(i).getName());
        }
        for (int i = 0; i < questionNaire.getInputTable24List().size(); i++) {
            InputTable24 table24 = questionNaire.getInputTable24List().get(i);
            Wlhtx wlhtx = new Wlhtx();
            List<String> list = new ArrayList<>();
            if (table24.getTxzt().contains("系统")) {
                wlhtx.setWlhtx_xdmc(table24.getCpdx());
                list.add("52-02-1");
                list.add("52-02-2");
                list.add("52-02-3");
                list.add("52-02-4");
                list.add("52-02-5");
            } else if (table24.getTxzt().contains("机房")) {
                wlhtx.setWlhtx_xdmc(table24.getCpdx());
                list.add("52-01-1");
                list.add("52-01-2");
                list.add("52-01-3");
                list.add("52-01-4");
                list.add("52-01-5");
            } else if (table24.getTxzt().contains("设备")) {
                wlhtx.setWlhtx_xdmc(table24.getCpdx());
                list.add("52-03-1");
                list.add("52-03-2");
                list.add("52-03-3");
                list.add("52-03-4");
                list.add("52-03-5");
            } else if ("1".equals(table24.getType()) && "1".equals(table24.getTxzt())) {
                wlhtx.setWlhtx_xdmc(table24.getCpdx());
                list.add("52-05-1");
                list.add("52-05-2");
                list.add("52-05-3");
                list.add("52-05-4");
                list.add("52-05-5");
            } else if (!("1".equals(table24.getType())) && "1".equals(table24.getTxzt())) {
                wlhtx.setWlhtx_xdmc(table24.getCpdx());
                list.add("52-06-1");
                list.add("52-06-2");
                list.add("52-06-3");
                list.add("52-06-4");
                list.add("52-06-5");
            } else if ("1".equals(table24.getType()) && "2".equals(table24.getTxzt())) {
                if (sbqdStrList.contains("SSL VPN安全网关")) {
                    wlhtx.setWlhtx_xdmc(table24.getCpdx());
                    list.add("52-07-1");
                    list.add("52-07-2");
                    list.add("52-07-3");
                    list.add("52-07-4");
                    list.add("52-07-5");
                } else {
                    wlhtx.setWlhtx_xdmc(table24.getCpdx());
                    list.add("52-08-1");
                    list.add("52-08-2");
                    list.add("52-08-3");
                    list.add("52-08-4");
                    list.add("52-08-5");
                }
            } else if (!("1".equals(table24.getType())) && "2".equals(table24.getTxzt())) {
                if (sbqdStrList.contains("可信浏览器")){
                    wlhtx.setWlhtx_xdmc(table24.getCpdx());
                    list.add("52-10-1");
                    list.add("52-10-2");
                    list.add("52-10-3");
                    list.add("52-10-4");
                    list.add("52-10-5");
                }else if (!sbqdStrList.contains("可信浏览器") && sbqdStrList.contains("SSL VPN安全网关")){
                    wlhtx.setWlhtx_xdmc(table24.getCpdx());
                    list.add("52-09-1");
                    list.add("52-09-2");
                    list.add("52-09-3");
                    list.add("52-09-4");
                    list.add("52-09-5");
                }else {
                    wlhtx.setWlhtx_xdmc("此通道映射存在问题");
                    list.add("52-01-1");
                    list.add("52-01-2");
                    list.add("52-01-3");
                    list.add("52-01-4");
                    list.add("52-01-5");
                }

            } else if ("1".equals(table24.getType()) && "3".equals(table24.getTxzt())) {
                wlhtx.setWlhtx_xdmc(table24.getCpdx());
                list.add("52-11-1");
                list.add("52-11-2");
                list.add("52-11-3");
                list.add("52-11-4");
                list.add("52-11-5");
//            } else if ("1".equals(table24.getType()) && "4".equals(table24.getTxzt())) {
            } else if ("4".equals(table24.getTxzt())) {
                if (sbqdStrList.contains("SSL VPN安全网关") && sbqdStrList.contains("协同签名系统")) {
                    wlhtx.setWlhtx_xdmc(table24.getCpdx());
                    list.add("52-14-1");
                    list.add("52-14-2");
                    list.add("52-14-3");
                    list.add("52-14-4");
                    list.add("52-14-5");
                } else if (sbqdStrList.contains("SSL VPN安全网关")) {
                    wlhtx.setWlhtx_xdmc(table24.getCpdx());
                    list.add("52-13-1");
                    list.add("52-13-2");
                    list.add("52-13-3");
                    list.add("52-13-4");
                    list.add("52-13-5");
                } else if (sbqdStrList.contains("协同签名系统")) {
                    wlhtx.setWlhtx_xdmc(table24.getCpdx());
                    list.add("52-14-1");
                    list.add("52-14-2");
                    list.add("52-14-3");
                    list.add("52-14-4");
                    list.add("52-14-5");
                }else {
                    wlhtx.setWlhtx_xdmc("此通道映射存在问题");
                    list.add("52-01-1");
                    list.add("52-01-2");
                    list.add("52-01-3");
                    list.add("52-01-4");
                    list.add("52-01-5");
                }
//            } else if (("1".equals(table24.getType()) && "5".equals(table24.getTxzt()))||table24.getTxzt().equals("微信公众号")) {
            } else if ("5".equals(table24.getTxzt())||table24.getTxzt().equals("微信公众号")) {
                wlhtx.setWlhtx_xdmc(table24.getCpdx());
                list.add("52-15-1");
                list.add("52-15-2");
                list.add("52-15-3");
                list.add("52-15-4");
                list.add("52-15-5");
            } else if (!("1".equals(table24.getType())) && "3".equals(table24.getTxzt())) {
                wlhtx.setWlhtx_xdmc(table24.getCpdx());
                list.add("52-12-1");
                list.add("52-12-2");
                list.add("52-12-3");
                list.add("52-12-4");
                list.add("52-12-5");
            } else {
                wlhtx.setWlhtx_xdmc("此通道映射存在问题");
                list.add("52-01-1");
                list.add("52-01-2");
                list.add("52-01-3");
                list.add("52-01-4");
                list.add("52-01-5");
            }
            wlhtx.setWlhtx_xd(list);
            wlhtxList.add(wlhtx);
        }
    }

    private static void convertSbhjx(QuestionNaire questionNaire, List<Sbhjs> sbhjsList, List<Product> sbqdList) {
        List<String> sbqdStrList = new ArrayList<>();
        for (int i=0;i<sbqdList.size();i++){
            sbqdStrList.add(sbqdList.get(i).getName());
        }
        for (int i = 0; i < questionNaire.getInputTable25List().size(); i++) {
            Sbhjs sbhjs = new Sbhjs();
            InputTable25 table25 = questionNaire.getInputTable25List().get(i);
            sbhjs.setSbhjs_sbmc(table25.getSbmc());
            if (sbqdStrList.contains("国密堡垒机")) {
                sbhjs.setSbhjs_sfjb("31-01-1");
            } else {
                if ("1".equals(table25.getBlj())) {
                    sbhjs.setSbhjs_sfjb("31-00-1");
                } else if ("2".equals(table25.getBlj())) {
                    if (sbqdStrList.contains("签名验签服务器")) {
                        sbhjs.setSbhjs_sfjb("31-02-1");
                    } else {
                        sbhjs.setSbhjs_sfjb("31-03-1");
                    }
                }
            }
            if ("1".equals(table25.getBlj())) {
                sbhjs.setSbhjs_ycgl("32-01-1");
            } else {
                sbhjs.setSbhjs_ycgl("32-03-1");
            }
            List<String>list = new ArrayList<>();
            if (table25.getCzxt().equals("1")){
                list.add("33-00-1");
            }else if (table25.getCzxt().equals("2")){
                list.add("33-01-1");
            }else if (table25.getCzxt().equals("3")){
                list.add("33-02-1");
            }
            if (table25.getSjk().equals("1")){
                list.add("33-03-1");
            }else if (table25.getSjk().equals("3")){
                list.add("33-04-1");
            }else if (table25.getSjk().equals("2")){
                list.add("33-05-1");
            }else if (table25.getSjk().equals("4")){
                list.add("33-06-1");
            }else if (table25.getSjk().equals("5")){
                list.add("33-07-1");
            }else if (table25.getSjk().equals("6")){
                list.add("33-08-1");
            }
            list.add("33-09-1");
            sbhjs.setSbhjs_xtzy(list);
            sbhjs.setSbhjs_zyxx("34-00-1");
            sbhjs.setSbhjs_rzjl("35-00-1");
            sbhjs.setSbhjs_zykz("36-00-1");
            sbhjsList.add(sbhjs);
        }
        for (int i = 0; i < questionNaire.getInputTable26List().size(); i++) {
            InputTable26 table26 = questionNaire.getInputTable26List().get(i);
            if ("1".equals(table26.getType()) || "2".equals(table26.getType()) || "3".equals(table26.getType())) {
                Sbhjs sbhjs = new Sbhjs();
                sbhjs.setSbhjs_sbmc(table26.getSbmc());
                if (sbqdStrList.contains("国密堡垒机")) {
                    sbhjs.setSbhjs_sfjb("31-01-1");
                } else {
                    if ("1".equals(table26.getBlj())) {
                        sbhjs.setSbhjs_sfjb("31-00-1");
                    } else if ("2".equals(table26.getBlj())) {
                        if (sbqdStrList.contains("签名验签服务器")) {
                            sbhjs.setSbhjs_sfjb("31-02-1");
                        } else {
                            sbhjs.setSbhjs_sfjb("31-03-1");
                        }
                    }
                }
                if ("1".equals(table26.getBlj())) {
                    sbhjs.setSbhjs_ycgl("32-01-1");
                } else {
                    sbhjs.setSbhjs_ycgl("32-03-1");
                }
                List<String>list = new ArrayList<>();
                list.add("33-10-1");
                sbhjs.setSbhjs_xtzy(list);
                sbhjs.setSbhjs_zyxx("34-00-1");
                sbhjs.setSbhjs_rzjl("35-00-1");
                sbhjs.setSbhjs_zykz("36-01-1");
                sbhjsList.add(sbhjs);
            }
        }
        //循环设备清单
        for (int i = 0; i < sbqdStrList.size(); i++) {
                Sbhjs sbhjs = new Sbhjs();
                sbhjs.setSbhjs_sbmc(sbqdStrList.get(i));
                if (sbhjs.getSbhjs_sbmc().equals("国密安全密码应用中间件")||sbhjs.getSbhjs_sbmc().equals("国密数字证书")
                        ||sbhjs.getSbhjs_sbmc().equals("智能密码钥匙")||sbhjs.getSbhjs_sbmc().equals("可信浏览器")
                        ||sbhjs.getSbhjs_sbmc().equals("密码设备管理平台")||sbhjs.getSbhjs_sbmc().equals("云安全管理平台（CSMP）")
                        ||sbhjs.getSbhjs_sbmc().equals("国密视频监控系统")||sbhjs.getSbhjs_sbmc().equals("安全门禁系统")
                        ||sbhjs.getSbhjs_sbmc().equals("密码应用技术服务")){
                    continue;
                }
                if (sbqdStrList.contains("国密堡垒机")) {
                    sbhjs.setSbhjs_sfjb("31-01-1");
                } else {
                    if ("1".equals(questionNaire.getInputTable25List().get(0).getBlj())) {
                        sbhjs.setSbhjs_sfjb("31-00-1");
                    } else if ("2".equals(questionNaire.getInputTable25List().get(0).getBlj())) {
                        if (sbqdStrList.contains("签名验签服务器")) {
                            sbhjs.setSbhjs_sfjb("31-02-1");
                        } else {
                            sbhjs.setSbhjs_sfjb("31-03-1");
                        }
                    }
                }
                if ("1".equals(questionNaire.getInputTable25List().get(0).getBlj())) {
                    sbhjs.setSbhjs_ycgl("32-01-1");
                } else {
                    sbhjs.setSbhjs_ycgl("32-03-1");
                }
                List<String>list = new ArrayList<>();
                list.add("33-10-1");
                sbhjs.setSbhjs_xtzy(list);
                sbhjs.setSbhjs_zyxx("34-00-1");
                sbhjs.setSbhjs_rzjl("35-00-1");
                sbhjs.setSbhjs_zykz("36-01-1");
                sbhjsList.add(sbhjs);
        }
    }

    private static void convertYyhsj(QuestionNaire questionNaire, List<Yyhsj> yyhsjList, List<Product> sbqdList) {
        List<String> sbqdStrList = new ArrayList<>();
        for (int i=0;i<sbqdList.size();i++){
            sbqdStrList.add(sbqdList.get(i).getName());
        }
        for (int i = 0; i < questionNaire.getInputTable27List().size(); i++) {
            List<String> sfjbList = new ArrayList<>();
            List<String> zysjList = new ArrayList<>();
            Yyhsj yyhsj = new Yyhsj();
            InputTable27 table27 = questionNaire.getInputTable27List().get(i);
            yyhsj.setYyhsj_ywmc(table27.getYwyy());
            for (int j = 0; j < questionNaire.getInputTable22List().size(); j++) {
                if (table27.getYwyy().equals(questionNaire.getInputTable22List().get(j).getYwyy())) {
                    InputTable22 table22 = questionNaire.getInputTable22List().get(j);
                    if ((("1".equals(questionNaire.getSys_sshy()) || "4".equals(questionNaire.getSys_sshy())) && table22.getYh().equals("3")) || table22.getYh().equals("2")) {
                        if (table22.getSzwl().contains("4")) {
                            if (!sfjbList.contains("41-00-1")){
                                sfjbList.add("41-00-1");
                            }
                        } else {
                            if (!sfjbList.contains("41-00-2")){
                                sfjbList.add("41-00-2");
                            }
                        }
                    } else if ((!("1".equals(questionNaire.getSys_sshy()) || "4".equals(questionNaire.getSys_sshy())) && table22.getYh().equals("3"))||table22.getYh().equals("4")){
                        if (!sfjbList.contains("41-03-1")){
                            sfjbList.add("41-03-1");
                        }
                    }
                    //其他情况不判断，可能存在问题
//                    else {
//                        System.out.println("questionNaire.getSys_sshy():"+questionNaire.getSys_sshy()+"-----table22.getYh():"+table22.getYh());
//                        sfjbList.add("0-0-0");
//                    }
                }
            }
            if (sbqdStrList.contains("可信浏览器")) {
                sfjbList.add("41-01-1");
            }
            if (sbqdStrList.contains("协同签名系统")) {
                sfjbList.add("41-02-1");
            }
            yyhsj.setYyhsj_sfjb(sfjbList);
            Boolean flag = true;
            List<String> ccjmx = new ArrayList<>();
            for (int j = 0; j < questionNaire.getInputTable28List().size(); j++) {
                InputTable28 table28 = questionNaire.getInputTable28List().get(j);
                if (table27.getYwyy().equals(table28.getYwyy())){
                if ("6".equals(table28.getSjlx())) {
                    if ("1".equals(table28.getCcjm())) {
                        yyhsj.setYyhsj_fwkz("42-02-1");
                    } else if ("2".equals(table28.getCcjm())) {
                        yyhsj.setYyhsj_fwkz("42-01-1");
                    } else if ("3".equals(table28.getCcjm())) {
                        yyhsj.setYyhsj_fwkz("42-00-1");
                    }
                }
                if (flag) {
                    yyhsj.setYyhsj_xxzy("43-00-1");
                    zysjList.add("44-00-1");
                    for (int k = 0;k<questionNaire.getInputTable24List().size();k++){
                        InputTable24 inputTable24 = questionNaire.getInputTable24List().get(k);
                        if (inputTable24.getTxzt().contains("机房") || inputTable24.getTxzt().contains("系统")){
                            zysjList.add("44-01-1");
                            break;
                        }
                    }

                    yyhsj.setYyhsj_csjmx(zysjList);
                    yyhsj.setYyhsj_cswzx("46-00-1");
                    ccjmx.add(table28.getCcjm());
//                    if ("1".equals(table28.getCcjm())) {
//                        yyhsj.setYyhsj_ccjmx("45-00-1");
//                    } else if ("2".equals(table28.getCcjm())) {
//                        yyhsj.setYyhsj_ccjmx("45-01-1");
//                    } else if ("3".equals(table28.getCcjm())) {
//                        yyhsj.setYyhsj_ccjmx("45-02-1");
//                    }
//
//                    if ("1".equals(table28.getCcjm())) {
//                        yyhsj.setYyhsj_ccwzx("47-00-1");
//                    } else if ("2".equals(table28.getCcjm())) {
//                        yyhsj.setYyhsj_ccwzx("47-01-1");
//                    } else if ("3".equals(table28.getCcjm())) {
//                        yyhsj.setYyhsj_ccwzx("47-02-1");
//                    }
                    flag = false;
                }
            }
        }
            if (ccjmx.contains("2")||ccjmx.contains("3")){
                yyhsj.setYyhsj_ccjmx("45-01-1");
                yyhsj.setYyhsj_ccwzx("47-01-1");
            }else {
                yyhsj.setYyhsj_ccjmx("45-00-1");
                yyhsj.setYyhsj_ccwzx("47-00-1");
            }

            if ("1".equals(table27.getBkfr())){
                yyhsj.setYyhsj_bkfr("48-00-1");
            }else if ("2".equals(table27.getBkfr())){
                if ("2".equals(table27.getDzqm())){
                    yyhsj.setYyhsj_bkfr("48-02-1");
                }else {
                    yyhsj.setYyhsj_bkfr("48-01-1");
                }
            }else if ("3".equals(table27.getBkfr())){
                yyhsj.setYyhsj_bkfr("48-03-1");
            }
            yyhsjList.add(yyhsj);
        }
    }

}
