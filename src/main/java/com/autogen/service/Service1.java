package com.autogen.service;

import com.autogen.dao.entity.QuestionNaire;

import java.util.List;
import java.util.Map;

public interface Service1 {
     /**
      * 生成整个文档所需要的变量
      * @param questionNaire 调研表/网页传回的JSON
      * @param productName 产品清单
      */
     void BasicTemplate(QuestionNaire questionNaire, List<String> productName);

     /**
      * 从数据库查询相应的描述
      * @param questionNaire 调研表/网页传回的JSON
      * @return map保存键值对，通配符-对应描述
      */
     Map<String,Object> selectDes(QuestionNaire questionNaire);

     /**
      * 合并各个章的文档
      * @throws Exception
      */
     void generate() throws Exception;
}
