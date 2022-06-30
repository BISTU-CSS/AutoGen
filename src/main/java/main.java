import com.Entity.BasicTemplate;
import com.Entity.QuestionNaire;
import com.atginterface.AutoGenerator;
import com.atginterface.AutoGeneratorImpl;
import com.fileapi.IOManager;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {

        QuestionNaire questionNaire = new QuestionNaire();
        questionNaire.question_1 = "北京市医疗";
        BasicTemplate basicTemplate = new BasicTemplate(questionNaire,null);

        AutoGenerator autogen = new AutoGeneratorImpl();
        XWPFDocument ak = autogen.chapter_one_generator(basicTemplate.getC1());

        IOManager.writeFile(ak,"22.docx");
    }
}
