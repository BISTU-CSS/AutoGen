package com.Entity.cp2.fragment;

public class SystemUserUsageTable {
    public SystemUserUsageTable(int id, String company, String staff, String scene) {
        this.id = id;
        this.company = company;
        this.staff = staff;
        this.scene = scene;
    }

    public int id;
    public String company;    //使用单位
    public String staff;   //使用人员
    public String scene;// 使用场景
}
