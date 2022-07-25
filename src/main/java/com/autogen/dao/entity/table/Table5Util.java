package com.autogen.dao.entity.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Table5Util {
    //第五章表5.1、5.2、5.3、5.4通用格式

    int id;         //序号
    String level;   //安全层面
    String object;  //保护对象
}
