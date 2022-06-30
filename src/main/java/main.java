import com.Entity.BasicTemplate;
import com.Entity.QuestionNaire;
import com.Entity.cp2.fragment.SystemUserUsageTable;
import com.atginterface.AutoGenerator;
import com.atginterface.AutoGeneratorImpl;
import com.fileapi.IOManager;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws IOException {

        //获取调研表并处理
        QuestionNaire questionNaire = new QuestionNaire();
        questionNaire.question_1 = "北京市医疗";
        questionNaire.question_2 = "北京市医院公司";


        BasicTemplate basicTemplate = new BasicTemplate(questionNaire,null);

        AutoGenerator autogen = new AutoGeneratorImpl();
        //XWPFDocument ak = autogen.chapter_one_generator(basicTemplate.getC1());
        XWPFDocument ak = autogen.chapter_two_generator(basicTemplate.getC2());
        IOManager.writeFile(ak,"example.docx");


    }
}
