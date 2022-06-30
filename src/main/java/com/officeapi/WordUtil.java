package com.officeapi;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
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

    public static XWPFDocument add_rowtable_loop(XWPFDocument input, String table_name, HashMap<String, Object> table_list) {
        LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind(table_name, policy).build();
        XWPFTemplate template = XWPFTemplate.compile(input, config).render(table_list);
        return template.getXWPFDocument();
    }

}
