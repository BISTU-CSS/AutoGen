package com.officeapi;

import com.deepoove.poi.XWPFTemplate;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.OutputStream;
import java.util.HashMap;

public class WordUtil {
    /**
     * 替换基本项目的通配符
     * @param input 输入文档
     * @return 输出文档
     */
    public static XWPFDocument replace_wildcards(XWPFDocument input,HashMap<String, Object> replace_list){
        XWPFTemplate template = XWPFTemplate.compile(input).render(replace_list);
        return template.getXWPFDocument();
    }


}
