package com.autogen.dao.entity.cp5.fragment;

import com.deepoove.poi.data.NumberingRenderData;

public class WuLi {
    private String jifang;
    private NumberingRenderData list52;

    public WuLi(String jifang, NumberingRenderData list52) {
        this.jifang = jifang;
        this.list52 = list52;
    }

    public WuLi() {
    }

    public String getShebei() {
        return jifang;
    }

    public void setShebei(String jifang) {
        this.jifang = jifang;
    }

    public NumberingRenderData getList() {
        return list52;
    }

    public void setList52(NumberingRenderData list52) {
        this.list52 = list52;
    }
}
