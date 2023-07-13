package com.autogen.util;

import com.alibaba.fastjson.*;
import com.autogen.dao.entity.Information;
import com.autogen.dao.entity.input.*;

import java.util.ArrayList;
import java.util.List;

public class MyJSON {
    public static void parsingJSON(JSONObject data, QuestionNaire questionNaire){
        JSONObject jsonObject = data.getJSONObject("data");
        questionNaire.setSys_sshy(jsonObject.getString("sys_sshy"));
        questionNaire.setSys_sshy_qt(jsonObject.getString("sys_sshy_qt"));
        questionNaire.setSys_xmlx(jsonObject.getString("sys_xmlx"));
        questionNaire.setSys_name(jsonObject.getString("sys_name"));
        questionNaire.setSys_unit(jsonObject.getString("sys_unit"));
        questionNaire.setSys_dbjb(jsonObject.getString("sys_dbjb"));
        questionNaire.setSys_xtjs(jsonObject.getString("sys_xtjs"));
        questionNaire.setSys_mpsc(jsonObject.getString("sys_mpsc"));
        questionNaire.setSys_mmzd(jsonObject.getString("sys_mmzd"));
        questionNaire.setSys_ysbs(jsonObject.getString("sys_ysbs"));
        questionNaire.setSys_rzys(jsonObject.getString("sys_rzys"));
        questionNaire.setMpjb_fwd(jsonObject.getString("mpjb_fwd"));
        questionNaire.setMpjb_ydd(addList(jsonObject,"mpjb_ydd"));
        questionNaire.setSys_djbh(jsonObject.getString("sys_djbh"));
        questionNaire.setSys_xtjg(jsonObject.getString("sys_xtjg"));
        questionNaire.setSys_dwdz(jsonObject.getString("sys_dwdz"));
        questionNaire.setSys_sxsj(jsonObject.getString("sys_sxsj"));
        questionNaire.setSys_dbsj(jsonObject.getString("sys_dbsj"));
        questionNaire.setSys_cpjg(jsonObject.getString("sys_cpjg"));

        questionNaire.setMpjb_sfrz(addList(jsonObject,"mpjb_sfrz"));
        questionNaire.setMpjb_fwfs(addList(jsonObject,"mpjb_fwfs"));
        questionNaire.setMpjb_yjzd(jsonObject.getString("mpjb_yjzd"));
        questionNaire.setMpjb_sjk(jsonObject.getString("mpjb_sjk"));
        questionNaire.setMpjb_sslvpn(jsonObject.getString("mpjb_sslvpn"));
        questionNaire.setMpjb_ipsecvpn(jsonObject.getString("mpjb_ipsecvpn"));
        questionNaire.setMpjb_blj(jsonObject.getString("mpjb_blj"));
        questionNaire.setMpjb_bkfr(jsonObject.getString("mpjb_bkfr"));
        questionNaire.setMpjb_dzqz(jsonObject.getString("mpjb_dzqz"));
        questionNaire.setMpjb_cssjl(jsonObject.getString("mpjb_cssjl"));
        questionNaire.setMpjb_ccsjl(jsonObject.getString("mpjb_ccsjl"));

        questionNaire.setInputTable22List(add22List(jsonObject,"sys_xtyh"));
        questionNaire.setInputTable23List(add23List(jsonObject,"sys_wlhhj"));
        questionNaire.setInputTable24List(add24List(jsonObject,"sys_wlhtx"));
        questionNaire.setInputTable25List(add25List(jsonObject,"sys_fwq"));
        questionNaire.setInputTable26List(add26List(jsonObject,"sys_sbhjs"));
        questionNaire.setInputTable27List(add27List(jsonObject,"sys_ywyy"));
        questionNaire.setInputTable28List(add28List(jsonObject,"sys_zysj"));

        questionNaire.setSbqd(addProduct(jsonObject,"sbqd"));
    }

    public static void parsingJSON(JSONObject data, Concent concent){
        JSONObject jsonObject = data.getJSONObject("data");
//        questionNaire.setSys_name(jsonObject.getString("sys_name"));
//        questionNaire.setSys_ywyy(jsonObject.getString("sys_ywyy"));
//        questionNaire.setSys_ywsjk(jsonObject.getString("sys_ywsjk"));
//        questionNaire.setSys_ywczxt(jsonObject.getString("sys_ywczxt"));
//        questionNaire.setInputTable213List(add213List(jsonObject,"sys_xtyh"));
//        questionNaire.setInputTable25List(add25List(jsonObject,"sys_yhyjqdb"));
//        questionNaire.setSys_glzd(jsonObject.getString("sys_glzd"));
//        questionNaire.setSys_mmyyjskj(jsonObject.getString("sys_mmyyjskj"));
        concent.setWlhhjList(addWuli(jsonObject,"wlhhj"));
        concent.setWlhtxList(addWangluo(jsonObject,"wlhtx"));
        concent.setSbhjsList(addShebei(jsonObject,"sbhjs"));
        concent.setYyhsjList(addYingyong(jsonObject,"yyhsj"));
        concent.setSbqd(addProduct(jsonObject,"sbqd"));
    }

    public static void parsingJSON(JSONObject data, InputInformation information){

        information.setXmmc(data.getString("xmmc"));
        information.setCjr(data.getString("cjr"));
        information.setZdls(data.getString("zdls"));
        information.setXmsm(data.getString("xmsm"));
        information.setDate(data.getString("date"));
    }


    public static List<Wlhhj> addWuli(JSONObject jsonObject, String str){
        List<Wlhhj>wlhhjList = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        wlhhjList = JSONObject.parseArray(js,Wlhhj.class);
        return wlhhjList;
    }

    public static List<Wlhtx> addWangluo(JSONObject jsonObject, String str){
        List<Wlhtx> wlhtxList = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        wlhtxList = JSONObject.parseArray(js,Wlhtx.class);
        return wlhtxList;
    }

    public static List<Sbhjs> addShebei(JSONObject jsonObject, String str){
        List<Sbhjs> sbhjsList = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        sbhjsList = JSONObject.parseArray(js,Sbhjs.class);
        return sbhjsList;
    }

    public static List<Yyhsj> addYingyong(JSONObject jsonObject, String str){
        List<Yyhsj> yyhsjList = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        yyhsjList = JSONObject.parseArray(js,Yyhsj.class);
        return yyhsjList;
    }

    public static List<Product> addProduct(JSONObject jsonObject, String str){
        List<Product> productList = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        productList = JSONObject.parseArray(js, Product.class);
        return productList;
    }

    public static List<String> addList(JSONObject jsonObject, String str){
        List<String> list = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        list = JSONObject.parseArray(js, String.class);
        return list;
    }

    public static List<InputTable22> add22List(JSONObject jsonObject, String str){
        List<InputTable22> list = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        list = JSONObject.parseArray(js, InputTable22.class);
        return list;
    }

    public static List<InputTable23> add23List(JSONObject jsonObject, String str){
        List<InputTable23> list = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        list = JSONObject.parseArray(js, InputTable23.class);
        return list;
    }

    public static List<InputTable24> add24List(JSONObject jsonObject, String str){
        List<InputTable24> list = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        list = JSONObject.parseArray(js, InputTable24.class);
        return list;
    }

    public static List<InputTable25> add25List(JSONObject jsonObject, String str){
        List<InputTable25> list = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        list = JSONObject.parseArray(js, InputTable25.class);
        return list;
    }

    public static List<InputTable26> add26List(JSONObject jsonObject, String str){
        List<InputTable26> list = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        list = JSONObject.parseArray(js, InputTable26.class);
        return list;
    }

    public static List<InputTable27> add27List(JSONObject jsonObject, String str){
        List<InputTable27> list = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        list = JSONObject.parseArray(js, InputTable27.class);
        return list;
    }

    public static List<InputTable28> add28List(JSONObject jsonObject, String str){
        List<InputTable28> list = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        list = JSONObject.parseArray(js, InputTable28.class);
        return list;
    }





}
