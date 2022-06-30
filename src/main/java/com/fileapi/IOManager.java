package com.fileapi;

import com.deepoove.poi.xwpf.NiceXWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOManager {

    /**
     *
     * @param path  Windows形式。例子："F:\\test\\table2.docx"
     * @return
     * @throws IOException
     */
    static public XWPFDocument readFile(String path) throws IOException {

        return new NiceXWPFDocument(new FileInputStream(path));
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