package com.fileapi;

import com.deepoove.poi.xwpf.NiceXWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.xmlbeans.ResourceLoader;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOManager {
    ResourceLoader loader;
    /**
     *
     * @param path  Windows形式。例子："F:\\test\\table2.docx"
     * @return
     * @throws IOException
     */
    static public XWPFDocument readFile(String path) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource(path);
        File file = classPathResource.getFile();
        FileInputStream in = new FileInputStream(file);
        return new NiceXWPFDocument(in);
    }

    /**
     *
     * @param doc
     * @param path  Windows形式。例子："F:\\test\\new_doc.docx"
     * @throws IOException
     */
    static public void writeFile(XWPFDocument doc,String path) throws IOException {
        FileOutputStream out = new FileOutputStream(path);
        doc.write(out);
        out.close();
    }
}
