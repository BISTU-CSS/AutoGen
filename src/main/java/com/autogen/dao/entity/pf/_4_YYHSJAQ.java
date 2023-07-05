package com.autogen.dao.entity.pf;

//4-应用和数据安全

public class _4_YYHSJAQ {
    public String cpdx;                 //测评对象
    public String []sfjb;                 //身份鉴别
    public String []fwkzxxwzx;            //访问控制信息完整性
    public String []zyxxzyaqbjwzx;        //重要信息资源安全标记完整性
    public String []zysjcsjmx;            //重要数据传输机密性
    public String []zysjccjmx;            //重要数据存储机密性
    public String []zysjcswzx;            //重要数据传输完整性
    public String []zysjccwzx;            //重要数据存储完整性
    public String []bkfrx;                //不可否认性

    public _4_YYHSJAQ() {
    }

    public _4_YYHSJAQ(String cpdx, String[] sfjb, String[] fwkzxxwzx, String[] zyxxzyaqbjwzx, String[] zysjcsjmx, String[] zysjccjmx, String[] zysjcswzx, String[] zysjccwzx, String[] bkfrx) {

        this.cpdx = cpdx;
        this.sfjb = sfjb;
        this.fwkzxxwzx = fwkzxxwzx;
        this.zyxxzyaqbjwzx = zyxxzyaqbjwzx;
        this.zysjcsjmx = zysjcsjmx;
        this.zysjccjmx = zysjccjmx;
        this.zysjcswzx = zysjcswzx;
        this.zysjccwzx = zysjccwzx;
        this.bkfrx = bkfrx;
    }
}
