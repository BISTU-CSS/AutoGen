package com.autogen.dao.entity.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Table5Util {
    //第二章表3.1、3.2、3.3、3.4通用格式
    //第五章表5.1、5.2、5.3、5.4通用格式

    private int id;         //序号
    private String level;   //安全层面
    private String object;  //保护对象
}
