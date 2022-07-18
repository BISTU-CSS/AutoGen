package com.autogen.dao.entity;

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
//    public String question_1;       //项目名称
//    public String question_2;       //公司名称
//    public String question_3;       //机房名称

    public String sys_name;  //系统名称
    public String wlhhj_sfjb; //物理： 身份鉴别
    public String wlhhj_dzmj;       //电子门禁记录数据存储完整性
    public String wlhhj_spjk;       //视频监控记录数据存储完整性
//    public String wlhtx_sfjb;       //通信过程中重要数据完整性
//    public String wlhtx_sjwzx;      //网络：
//    public String wlhtx_sjjmx;      //
//    public String wlhtx_wlbj;       //
//    public String wlhtx_aqjr;       //
    public String sbhjs_sfjb;       //设备： 身份鉴别
    public String sbhjs_ycgl;       //远程管理通道安全
    public String sbhjs_xtzy;       //系统资源访问控制信息完整性
    public String sbhjs_zyxx;       //重要信息资源安全标记完整性
    public String sbhjs_rzjl;       //日志记录完整性
    public String sbhjs_zykz;       //重要可执行程序完整性、重要可执行程序来源真实性
    public List<String> yyhsj_sfjb;       //应用： 身份鉴别 （多选）
    public String yyhsj_fwkz;       //访问控制信息完整性
    public String yyhsj_xxzy;       //重要信息资源安全标记完整性
    public List<String> yyhsj_csjmx;      //重要数据传输机密性 （多选）
    public String yyhsj_ccjmx;      //重要数据存储机密性
    public String yyhsj_cswzx;      //重要数据传输完整性
    public String yyhsj_ccwzx;      //重要数据存储完整性
    public String yyhsj_bkfr;       //不可否认性
    public String ts_glzd;          //管理制度
    public List<String> ts_wlhtxaq;       //信道 （多选）
    public String ts_mmyy;          //密码应用技术框架
}
