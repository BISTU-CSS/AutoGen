package com.autogen.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.autogen.dao.entity.QuestionNaire;

import java.util.ArrayList;
import java.util.List;

public class MyJSON {
    public static QuestionNaire parsingJSON(JSONObject data){
        JSONObject jsonObject = data.getJSONObject("data");
        QuestionNaire questionNaire = new QuestionNaire();
        questionNaire.setSys_name(jsonObject.getString("sys_name"));
        questionNaire.setWlhhj_sfjb(jsonObject.getString("wlhhj_sfjb"));
        questionNaire.setWlhhj_dzmj(jsonObject.getString("wlhhj_dzmj"));
        questionNaire.setWlhhj_spjk(jsonObject.getString("wlhhj_spjk"));
        questionNaire.setSbhjs_sfjb(jsonObject.getString("sbhjs_sfjb"));
        questionNaire.setSbhjs_ycgl(jsonObject.getString("sbhjs_ycgl"));
        questionNaire.setSbhjs_xtzy(jsonObject.getString("sbhjs_xtzy"));
        questionNaire.setSbhjs_zyxx(jsonObject.getString("sbhjs_zyxx"));
        questionNaire.setSbhjs_rzjl(jsonObject.getString("sbhjs_rzjl"));
        questionNaire.setSbhjs_zykz(jsonObject.getString("sbhjs_zykz"));
        JSONArray jsonArray = jsonObject.getJSONArray("yyhsj_sfjb");
        List<String> listyyhsj_sfjb = new ArrayList<>();
        String str = "";
        for (int i = 0;i < jsonArray.size();i++){
            str = (String) jsonArray.get(i);
            listyyhsj_sfjb.add(str);
        }
        questionNaire.setYyhsj_sfjb(listyyhsj_sfjb);
        questionNaire.setYyhsj_fwkz(jsonObject.getString("yyhsj_fwkz"));
        questionNaire.setYyhsj_xxzy(jsonObject.getString("yyhsj_xxzy"));
        List<String>listyyhsj_csjmx = new ArrayList<>();
        jsonArray = jsonObject.getJSONArray("yyhsj_csjmx");
        for (int i = 0;i < jsonArray.size();i++){
            str = (String) jsonArray.get(i);
            listyyhsj_csjmx.add(str);
        }
        questionNaire.setYyhsj_csjmx(listyyhsj_csjmx);
        questionNaire.setYyhsj_ccjmx(jsonObject.getString("yyhsj_ccjmx"));
        questionNaire.setYyhsj_cswzx(jsonObject.getString("yyhsj_cswzx"));
        questionNaire.setYyhsj_ccwzx(jsonObject.getString("yyhsj_ccwzx"));
        questionNaire.setYyhsj_bkfr(jsonObject.getString("yyhsj_bkfr"));
        questionNaire.setTs_glzd(jsonObject.getString("ts_glzd"));
        List<String>listts_wlhtxaq = new ArrayList<>();
        jsonArray = jsonObject.getJSONArray("ts_wlhtxaq");
        for(int i = 0;i < jsonArray.size();i++){
            str = (String) jsonArray.get(i);
            listts_wlhtxaq.add(str);
        }
        questionNaire.setTs_wlhtxaq(listts_wlhtxaq);
        questionNaire.setTs_mmyy(jsonObject.getString("ts_mmyy"));
        return questionNaire;
    }
}
