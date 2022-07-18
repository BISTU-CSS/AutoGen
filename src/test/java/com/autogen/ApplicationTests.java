package com.autogen;

import com.autogen.dao.Mapper.ScenceMapper;
import com.autogen.dao.entity.QuestionNaire;
import com.autogen.dao.entity.ScencePo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
public class ApplicationTests {

    @Autowired
    private ScenceMapper scenceMapper;
    @Test
    void contextLoads() {
//        List<ScencePo> list = scenceMapper.selectList(new QueryWrapper<ScencePo>().eq("wildcard","222"));
//        List<Map<String,Object>> mapList = scenceMapper.selectMaps(new QueryWrapper<ScencePo>().eq("wildcard","222"));
//        System.out.println(mapList);

        Map<String,Object> map = new HashMap<>();
        QuestionNaire questionNaire =new QuestionNaire();
        questionNaire.setWlhhj_sfjb("11-05-1");
        map.put("222",scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard","222").eq("scence",questionNaire.getWlhhj_sfjb())));
       // System.out.println("map :" + map.get("222").getDescription());

        List<String>list = new ArrayList<>();
        list.add("41-00-1");
        list.add("41-01-1");
        questionNaire.setYyhsj_sfjb(list);
        for (int i=0;i<questionNaire.yyhsj_sfjb.size();i++) {
            map.put("*534list" + i, scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*534list").eq("scence",questionNaire.yyhsj_sfjb.get(i))).getDescription());
        }
        String str = "";
        String temp = "";
        for (int i=0;i<questionNaire.yyhsj_sfjb.size();i++) {
            str = map.get("*534list"+i).toString();
            if (0!=i){
                temp = map.get("*534list"+i).toString();
                str += temp.substring(temp.indexOf("：")+1);
            }
            System.out.println("*534list"+i+":" + map.get("*534list"+i).toString());
        }
        System.out.println(str);

    }

//    @Test
//    void a() {
//        QuestionNaire questionNaire =new QuestionNaire();
//        questionNaire.setWlhhj_sfjb("11-10-1");
//        BasicTemplate basicTemplate = new BasicTemplate();
//        basicTemplate.selectDes(questionNaire);
//
//
//    }


    @Test
    void aaa() {
        QuestionNaire questionNaire = new QuestionNaire();
        List<String>list = new ArrayList<>();
        list.add("52-01-1");
        list.add("52-01-2");
        list.add("52-01-3");
        list.add("52-01-4");
        list.add("52-01-5");
        list.add("52-02-1");
        list.add("52-02-2");
        list.add("52-02-3");
        list.add("52-02-4");
        list.add("52-02-5");
        System.out.println(list);
        questionNaire.setTs_wlhtxaq(list);
        List<String> listWlhtxaq = new ArrayList<>();
        Map<String,Integer> mapWlhtxaq = new HashMap<>();
        for (String s : questionNaire.ts_wlhtxaq){
            listWlhtxaq.add(s.substring(0,5));
        }
        System.out.println(listWlhtxaq);
        for (String s : listWlhtxaq){
            Integer i = 1;
            if(mapWlhtxaq.get(s)!= null){
                i=mapWlhtxaq.get(s)+1;
            }
            mapWlhtxaq.put(s,i);
        }
        System.out.println("重复数据的个数："+mapWlhtxaq);
        System.out.println(mapWlhtxaq.get("52-03"));
    }
}
