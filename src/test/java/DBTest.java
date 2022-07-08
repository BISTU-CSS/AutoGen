import com.util.DBUtil;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class DBTest {
    @Before
    public void setUp() throws Exception {
        
    }

    @Test
    public void select521aTest() throws SQLException {
        String str = DBUtil.select521a("11-3XX0-2");
        System.out.println(str);
    }

    @Test
    public void select521listTest() throws SQLException {
        List<String> list = DBUtil.select521list("11-3XX0-1","12-3XX0-1","13-3XX0-1");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
