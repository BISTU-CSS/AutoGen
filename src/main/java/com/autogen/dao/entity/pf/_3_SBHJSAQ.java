package com.autogen.dao.entity.pf;

//3-设备和计算安全
public class _3_SBHJSAQ {
    public String cpdx;                 //测评对象
    public String[] sfjb;               //身份鉴别
    public String[] ycgltdaq;           //远程管理通道安全
    public String[] xtzyfwkzxxwzx;      //系统资源访问控制信息完整性
    public String[] zyxxzyaqbjwzx;      //重要信息资源安全标记完整性
    public String[] rzjlwzx;            //日志记录完整性
    public String[] zykzxcx;            //重要可执行程序完整性、重要可执行程序来源真实性

    public _3_SBHJSAQ() {
    }

    public _3_SBHJSAQ(String cpdx, String[] sfjb, String[] ycgltdaq, String[] xtzyfwkzxxwzx, String[] zyxxzyaqbjwzx, String[] rzjlwzx, String[] zykzxcx) {
        this.cpdx = cpdx;
        this.sfjb = sfjb;
        this.ycgltdaq = ycgltdaq;
        this.xtzyfwkzxxwzx = xtzyfwkzxxwzx;
        this.zyxxzyaqbjwzx = zyxxzyaqbjwzx;
        this.rzjlwzx = rzjlwzx;
        this.zykzxcx = zykzxcx;
    }
}
