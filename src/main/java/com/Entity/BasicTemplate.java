package com.Entity;

import com.Entity.cp1.Chaptre1input;
import com.Entity.cp2.Chaptre2input;
import com.Entity.cp2.fragment.SystemUserUsageTable;
import com.Entity.cp3.Chaptre3input;
import com.Entity.cp5.Chaptre5input;
import com.Entity.cp5.fragment.Table53;
import javafx.scene.control.Tab;

import java.util.ArrayList;
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
        c1 = new Chaptre1input();
        c2 = new Chaptre2input();
        c3 = new Chaptre3input();
        c5 = new Chaptre5input();

        c1.system_name = questionNaire.question_1;
        c2.system_name = questionNaire.question_1;
        c3.system_name = questionNaire.question_1;
        c5.system_name = questionNaire.question_1;


        List<SystemUserUsageTable> sys_user = new ArrayList<>();
        sys_user.add(new SystemUserUsageTable(1,"公司KK","人员CC","场景WW"));
        sys_user.add(new SystemUserUsageTable(2,"达瓦达瓦","人员CC","场景WW"));
        sys_user.add(new SystemUserUsageTable(3,"而且我认为去人","人员CC","场景WW"));
        c2.systemUserUsageTableList = sys_user;

        List<Table53> table53List = new ArrayList<>();
        table53List.add(new Table53(1,"物理和环境安全",questionNaire.question_3));
        c5.table53List = table53List;


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

    public Chaptre5input getC5() {
        return c5;
    }

    private Chaptre1input c1;
    private Chaptre2input c2;
    private Chaptre3input c3;
    private Chaptre1input c4;
    private Chaptre5input c5;
}
