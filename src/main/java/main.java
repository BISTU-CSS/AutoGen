import com.Entity.BasicTemplate;
import com.Entity.QuestionNaire;
import com.atginterface.AutoGenerator;
import com.atginterface.AutoGeneratorImpl;

public class main {

    public static void main(String[] args) {

        QuestionNaire questionNaire = new QuestionNaire();
        questionNaire.question_1 = "北京市医疗";
        BasicTemplate basicTemplate = new BasicTemplate(questionNaire,null);

        AutoGenerator autogen = new AutoGeneratorImpl();
        autogen.chapter_one_generator(basicTemplate.getC1());

    }
}
