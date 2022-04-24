package dbTests;

import db.DBHelper;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class DBInsertTestTask8 {

    @Test
    public void startTest() {
        String sql2 = "SELECT * FROM REGISTRATION ORDER BY id DESC";

        int id1 = Integer.parseInt(DBHelper.getValueFirstRow(sql2, "id")) + 1;

        String sql = "INSERT INTO REGISTRATION (id, last, first, age) VALUES ('" + id1 + "', 'lastname9', 'name9', 22)";

        int count1 = DBHelper.countSqlResult(sql2);
        DBHelper.executeSqlResult(sql);
        int count2 = DBHelper.countSqlResult(sql2);
        DBHelper.getSqlResult(sql2).forEach(s -> System.out.println(s));

        Assertion as = new Assertion();
        as.assertEquals(Integer.parseInt(DBHelper.getValueFirstRow(sql2, "id")), id1);
        //as.assertEquals(DBHelper.getValueFirstRow(sql2, "first"), "name8");
        //as.assertEquals(DBHelper.getValueFirstRow(sql2, "last"), "lastname8");
        as.assertTrue(count2 > count1);
        System.out.println("Запись добавлена в таблицу c id = " + DBHelper.getValueFirstRow(sql2, "id"));

    }

}
