import com.autogen.dao.entity.BasicTemplate;
import com.autogen.dao.entity.QuestionNaire;
import com.autogen.service.atgInterface.AutoGenerator;
import com.autogen.service.atgInterface.AutoGeneratorImpl;
import com.autogen.service.fileapi.IOManager;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class main {

    public static void main(String[] args) throws Exception {

        //获取调研表并处理
        QuestionNaire questionNaire = new QuestionNaire();
        questionNaire.question_1 = "北京市医疗";
        questionNaire.question_2 = "北京市医院公司";
        questionNaire.question_3 = "通州机房";
//
//        BasicTemplate basicTemplate = new BasicTemplate(questionNaire,null);
//
//        AutoGenerator autogen = new AutoGeneratorImpl();
//        XWPFDocument doc1 = autogen.chapter_one_generator(basicTemplate.getC1());
//        XWPFDocument doc2 = autogen.chapter_two_generator(basicTemplate.getC2());
//        XWPFDocument doc3 = autogen.chapter_three_generator(basicTemplate.getC3());
//        XWPFDocument doc4 = autogen.chapter_four_generator(basicTemplate.getC4());
//        XWPFDocument doc5 = autogen.chapter_five_generator(basicTemplate.getC5());
//        XWPFDocument doc6 = autogen.chapter_six_generator(basicTemplate.getC6());
//        XWPFDocument doc7 = autogen.chapter_seven_generator(basicTemplate.getC7());
//        XWPFDocument doc8 = autogen.chapter_eight_generator(basicTemplate.getC8());
//
//        IOManager.writeFile(doc3,"example3.docx");



    }
}
