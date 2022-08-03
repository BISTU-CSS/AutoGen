package com.autogen.dao.entity.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 调研表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionNaire {

    //基础情况
    public String sys_name;                         //系统名称
    public String sys_dbjb;                         //等保级别
    public List<InputTable213> inputTable213List;   //系统用户表
    public String sys_ywyy;                         //业务基本情况描述
    public List<InputTable25> inputTable25List;     //系统硬件清单表
    public String sys_ywczxt;                       //操作系统种类
    public String sys_ywsjk;                        //数据库种类
    public String sys_glzd;                         //管理制度
    public String sys_mmyyjskj;                     //密码应用技术框架
    public List<Product> sbqd;

    //物理和环境安全
    public List<Wlhhj> wlhhjList;

    //网络和通信安全
    public List<Wlhtx> wlhtxList;

    //设备和计算安全
    public List<Sbhjs> sbhjsList;

    //应用和数据安全
    public List<Yyhsj> yyhsjList;

}
