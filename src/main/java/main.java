import com.Entity.BasicTemplate;
import com.Entity.QuestionNaire;
import com.Entity.cp2.fragment.SystemUserUsageTable;
import com.atginterface.AutoGenerator;
import com.atginterface.AutoGeneratorImpl;
import com.deepoove.poi.xwpf.NiceXWPFDocument;
import com.fileapi.IOManager;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {

        //获取调研表并处理
        QuestionNaire questionNaire = new QuestionNaire();
        questionNaire.question_1 = "北京市医疗";
        questionNaire.question_2 = "北京市医院公司";


        BasicTemplate basicTemplate = new BasicTemplate(questionNaire,null);

        AutoGenerator autogen = new AutoGeneratorImpl();
        XWPFDocument doc1 = autogen.chapter_one_generator(basicTemplate.getC1());
        XWPFDocument doc2 = autogen.chapter_two_generator(basicTemplate.getC2());
        IOManager.writeFile(doc2,"example2.docx");


    }
}
