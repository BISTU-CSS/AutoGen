package com.autogen.dao.entity.cp5.fragment;

public class Table55 {
    public Table55(int id, String name, String function, String type, int num, String remark) {
        this.id = id;
        this.name = name;
        this.function = function;
        this.type = type;
        this.num = num;
        this.remark = remark;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getType() {
        return type;
    }

    public void setType(String typr) {
        this.type = typr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private int id;
    private String name;
    private String function;
    private String type;
    private int num;
    private String remark;

}
