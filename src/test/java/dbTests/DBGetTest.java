package dbTests;

import db.DBHelper;
import org.testng.annotations.Test;

public class DBGetTest {

    @Test
    public void startTest() {
        String sql = "SELECT * FROM REGISTRATION";

        DBHelper.getSqlResult(sql).forEach(s -> System.out.println(s));

        System.out.println(DBHelper.getValueFirstRow(sql, "first"));
    }
}
