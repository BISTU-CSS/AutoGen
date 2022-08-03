package com.autogen.dao.entity.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table58 {
    private int id;            //序号
    private String name;       // 产品名称
    private String location;   //部署位置
    private String algorithm;  //使用的密码算法
    private String num;           //数量
    private String function;   //用途
}
