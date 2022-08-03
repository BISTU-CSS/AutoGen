package com.autogen.util;

import com.alibaba.fastjson.*;
import com.autogen.dao.entity.input.*;

import java.util.ArrayList;
import java.util.List;

public class MyJSON {
    public static void parsingJSON(JSONObject data,QuestionNaire questionNaire){
        JSONObject jsonObject = data.getJSONObject("data");
        questionNaire.setSys_name(jsonObject.getString("sys_name"));
        questionNaire.setSys_ywyy(jsonObject.getString("sys_ywyy"));
        questionNaire.setSys_ywsjk(jsonObject.getString("sys_ywsjk"));
        questionNaire.setSys_ywczxt(jsonObject.getString("sys_ywczxt"));
        questionNaire.setInputTable213List(add213List(jsonObject,"sys_xtyh"));
        questionNaire.setInputTable25List(add25List(jsonObject,"sys_yhyjqdb"));
        questionNaire.setSys_glzd(jsonObject.getString("sys_glzd"));
        questionNaire.setSys_mmyyjskj(jsonObject.getString("sys_mmyyjskj"));
        questionNaire.setWlhhjList(addWuli(jsonObject,"wlhhj"));
        questionNaire.setWlhtxList(addWangluo(jsonObject,"wlhtx"));
        questionNaire.setSbhjsList(addShebei(jsonObject,"sbhjs"));
        questionNaire.setYyhsjList(addYingyong(jsonObject,"yyhsj"));
        questionNaire.setSbqd(addProduct(jsonObject,"sbqd"));

//        questionNaire.setTs_xdmc(addList(jsonObject,"ts_xdmc"));
//        questionNaire.setTs_wlhtxaq(addList(jsonObject,"ts_wlhtxaq"));
//
//        questionNaire.setSbhjs_sbmc(addList(jsonObject,"sbhjs_sbmc"));
//        questionNaire.setSbhjs_sfjb(addList(jsonObject,"sbhjs_sfjb"));
//        questionNaire.setSbhjs_ycgl(addList(jsonObject,"sbhjs_ycgl"));
//        questionNaire.setSbhjs_xtzy(addList(jsonObject,"sbhjs_xtzy"));
//        questionNaire.setSbhjs_zyxx(addList(jsonObject,"sbhjs_zyxx"));
//        questionNaire.setSbhjs_rzjl(addList(jsonObject,"sbhjs_rzjl"));
//        questionNaire.setSbhjs_zykz(addList(jsonObject,"sbhjs_zykz"));
//
//        questionNaire.setYyhsj_ywmc(addList(jsonObject,"yyhsj_ywmc"));
//        questionNaire.setYyhsj_sfjb(addList(jsonObject,"yyhsj_sfjb"));
//        questionNaire.setYyhsj_fwkz(addList(jsonObject,"yyhsj_fwkz"));
//        questionNaire.setYyhsj_xxzy(addList(jsonObject,"yyhsj_xxzy"));
//        questionNaire.setYyhsj_csjmx(addList(jsonObject,"yyhsj_csjmx"));
//        questionNaire.setYyhsj_ccjmx(addList(jsonObject,"yyhsj_ccjmx"));
//        questionNaire.setYyhsj_cswzx(addList(jsonObject,"yyhsj_cswzx"));
//        questionNaire.setYyhsj_ccwzx(addList(jsonObject,"yyhsj_ccwzx"));
//        questionNaire.setYyhsj_bkfr(addList(jsonObject,"yyhsj_bkfr"));





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
    public static List<InputTable213> add213List(JSONObject jsonObject, String str){
        List<InputTable213> table213List = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        table213List = JSONObject.parseArray(js, InputTable213.class);
        return table213List;
    }
    public static List<InputTable25> add25List(JSONObject jsonObject, String str){
        List<InputTable25> table25List = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        table25List = JSONObject.parseArray(js, InputTable25.class);
        return table25List;
    }
    public static List<Product> addProduct(JSONObject jsonObject, String str){
        List<Product> productList = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray(str);
        String js = JSONObject.toJSONString(jsonArray);
        productList = JSONObject.parseArray(js, Product.class);
        return productList;
    }

}
