package com.autogen;

import com.autogen.dao.Mapper.DeviceMapper;
import com.autogen.dao.Mapper.ScenceMapper;
import com.autogen.dao.entity.Device;
import com.autogen.dao.entity.ScencePo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class ApplicationTests {
//
//    @Autowired
//    private ScenceMapper scenceMapper;
//    private DeviceMapper deviceMapper;
//    @Test
//    void contextLoads() {
////        List<ScencePo> list = scenceMapper.selectList(new QueryWrapper<ScencePo>().eq("wildcard","222"));
////        List<Map<String,Object>> mapList = scenceMapper.selectMaps(new QueryWrapper<ScencePo>().eq("wildcard","222"));
////        System.out.println(mapList);
//
//        Map<String,Object> map = new HashMap<>();
//        QuestionNaire questionNaire =new QuestionNaire();
//        questionNaire.setWlhhj_sfjb("11-05-1");
//        map.put("222",scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard","222").eq("scence",questionNaire.getWlhhj_sfjb())));
//       // System.out.println("map :" + map.get("222").getDescription());
//
//        List<String>list = new ArrayList<>();
//        list.add("41-00-1");
//        list.add("41-01-1");
//        questionNaire.setYyhsj_sfjb(list);
//        for (int i=0;i<questionNaire.yyhsj_sfjb.size();i++) {
//            map.put("*534list" + i, scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("wildcard", "*534list").eq("scence",questionNaire.yyhsj_sfjb.get(i))).getDescription());
//        }
//        String str = "";
//        String temp = "";
//        for (int i=0;i<questionNaire.yyhsj_sfjb.size();i++) {
//            str = map.get("*534list"+i).toString();
//            if (0!=i){
//                temp = map.get("*534list"+i).toString();
//                str += temp.substring(temp.indexOf("：")+1);
//            }
//            System.out.println("*534list"+i+":" + map.get("*534list"+i).toString());
//        }
//        System.out.println(str);
//
//    }
//

//
//
//    @Test
//    public void aaa() {
//        ScencePo scencePo = new ScencePo();
//        Device device = new Device();
//
//        scencePo = scenceMapper.selectOne(new QueryWrapper<ScencePo>().eq("scence", "11-00-1"));
//        if (scencePo != null) {
//            System.out.println(scencePo);
//        }
//        device = deviceMapper.selectOne(new QueryWrapper<Device>().eq("id","1"));
//        if (device != null){
//            System.out.println(device);
//        }
//    }
}
