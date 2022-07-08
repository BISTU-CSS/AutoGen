package com.Entity;

public class Device {
    private int id;         //索引
    private String cpmc;    //产品名称
    private String pp;      //品牌
    private String cpckxh;  //产品参考型号
    private String gnsm;    //功能说明
    private String lb;      //类别
    private String pz;      //配置
    private String dw;      //单位
    private String zb;      //质保

    public Device(int id, String cpmc, String pp, String cpckxh, String gnsm, String lb, String pz, String dw, String zb) {
        this.id = id;
        this.cpmc = cpmc;
        this.pp = pp;
        this.cpckxh = cpckxh;
        this.gnsm = gnsm;
        this.lb = lb;
        this.pz = pz;
        this.dw = dw;
        this.zb = zb;
    }
    public String[] toArray(){
        String[] strs = {String.valueOf(id),cpmc,pp,cpckxh,gnsm,lb,pz,dw,zb};
        return strs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpmc() {
        return cpmc;
    }

    public void setCpmc(String cpmc) {
        this.cpmc = cpmc;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public String getCpckxh() {
        return cpckxh;
    }

    public void setCpckxh(String cpckxh) {
        this.cpckxh = cpckxh;
    }

    public String getGnsm() {
        return gnsm;
    }

    public void setGnsm(String gnsm) {
        this.gnsm = gnsm;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getPz() {
        return pz;
    }

    public void setPz(String pz) {
        this.pz = pz;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public String getZb() {
        return zb;
    }

    public void setZb(String zb) {
        this.zb = zb;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", cpmc='" + cpmc + '\'' +
                ", pp='" + pp + '\'' +
                ", cpckxh='" + cpckxh + '\'' +
                ", gnsm='" + gnsm + '\'' +
                ", lb='" + lb + '\'' +
                ", pz='" + pz + '\'' +
                ", dw='" + dw + '\'' +
                ", zb='" + zb + '\'' +
                '}';
    }


}
