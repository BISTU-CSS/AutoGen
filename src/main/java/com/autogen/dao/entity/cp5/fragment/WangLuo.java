package com.autogen.dao.entity.cp5.fragment;

import com.deepoove.poi.data.NumberingRenderData;

public class WangLuo {
    public WangLuo() {
    }

    public WangLuo(String tongdao, NumberingRenderData netlist) {
        this.tongdao = tongdao;
        this.netlist = netlist;
    }

    public String getTongdao() {
        return tongdao;
    }

    public void setTongdao(String tongdao) {
        this.tongdao = tongdao;
    }

    public NumberingRenderData getNetlist() {
        return netlist;
    }

    public void setNetlist(NumberingRenderData netlist) {
        this.netlist = netlist;
    }

    private String tongdao;
    private NumberingRenderData netlist;
}
