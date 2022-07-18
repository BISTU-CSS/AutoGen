package com.autogen.service;

import com.autogen.dao.entity.QuestionNaire;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface Service1 {
     void BasicTemplate(QuestionNaire questionNaire, List<String> productName);
     Map<String,Object> selectDes(QuestionNaire questionNaire);
     void generate() throws Exception;
}
