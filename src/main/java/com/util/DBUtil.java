package com.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
    public static String select521a(String sence) throws SQLException {
        String res = "";
        String sql = "select description from p53 where wildcard = '521a' and sence = ?";
        dbSingleton.prep = dbSingleton.conn.prepareStatement(sql);
        dbSingleton.prep.setFetchSize(10000);
        dbSingleton.prep.setString(1,sence);
        dbSingleton.rs = dbSingleton.prep.executeQuery();
        while (dbSingleton.rs.next()) {
            res = dbSingleton.rs.getString("description");
        }
        return res;
    }
    public static List<String> select521list(String sence1, String sence2, String sence3) throws SQLException {
        List<String> list = new ArrayList<>();
        String res = "";
        String sql = "select description from p53 where wildcard = '*521list' and sence = ? or sence = ? or sence = ?";
        dbSingleton.prep = dbSingleton.conn.prepareStatement(sql);
        dbSingleton.prep.setFetchSize(10000);
        dbSingleton.prep.setString(1,sence1);
        dbSingleton.prep.setString(2,sence2);
        dbSingleton.prep.setString(3,sence3);
        dbSingleton.rs = dbSingleton.prep.executeQuery();
        while (dbSingleton.rs.next()){
            res = dbSingleton.rs.getString("description");
            list.add(res);
        }
        return list;
    }

    private static DBSingleton dbSingleton;

    static {
        try {
            dbSingleton = new DBSingleton();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
