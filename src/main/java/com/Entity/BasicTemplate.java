package com.Entity;

import com.Entity.cp1.Chaptre1input;
import com.Entity.cp2.Chaptre2input;
import com.Entity.cp3.Chaptre3input;

import java.util.List;

/**
 * 把所有输入进行解析，然后生成自动生成所需要的东西
 */
public class BasicTemplate {

    /**
     * 处理输入的调研表和需要的产品，生成各个章节的输入参数
     * @param questionNaire 调研表问题答案
     * @param productName 产品名称列表
     */
    public BasicTemplate(QuestionNaire questionNaire, List<String> productName) {
        c1.system_name = questionNaire.question_1;




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

    public Chaptre1input getC4() {
        return c4;
    }

    private Chaptre1input c1;
    private Chaptre2input c2;
    private Chaptre3input c3;
    private Chaptre1input c4;
}
