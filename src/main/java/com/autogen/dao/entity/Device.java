package com.autogen.dao.entity;

public class Device {
    private int id;         //索引
    private String cpmc;    //产品名称
    private String pp;      //品牌
    private String cpckxh;  //产品参考型号
    private String gnsm;    //功能说明
    private String lb;      //类别
    private String pz;      //配置
    private int sl;         //数量
    private String dw;      //单位
    private String zb;      //质保
    private String dj;      //单价
    private String zj;      //总价
    private String bz;      //备注

    public Device(int id, String cpmc, String pp, String cpckxh, String gnsm, String lb, String pz, int sl, String dw, String zb, String dj, String zj, String bz) {
        this.id = id;
        this.cpmc = cpmc;
        this.pp = pp;
        this.cpckxh = cpckxh;
        this.gnsm = gnsm;
        this.lb = lb;
        this.pz = pz;
        this.sl = sl;
        this.dw = dw;
        this.zb = zb;
        this.dj = dj;
        this.zj = zj;
        this.bz = bz;
    }

    public String[] toArray(){
        String[] strs = {String.valueOf(id),cpmc,pp,cpckxh,gnsm,lb,pz, String.valueOf(sl),dw,zb,dj,zj,bz};
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

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
    }

    public String getZj() {
        return zj;
    }

    public void setZj(String zj) {
        this.zj = zj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
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
                ", sl=" + sl +
                ", dw='" + dw + '\'' +
                ", zb='" + zb + '\'' +
                ", dj='" + dj + '\'' +
                ", zj='" + zj + '\'' +
                ", bz='" + bz + '\'' +
                '}';
    }
}
