package com.util;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.sql.*;

public class DBSingleton {
    private volatile static DBSingleton dbSingleton;
    public Connection conn = null;
    public ResultSet rs = null;
    public PreparedStatement prep = null;
    public Statement stat = null;
    public DBSingleton() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:src/main/resources/SqliteDB/sqlite.db");
        stat = conn.createStatement();
    }

    public static DBSingleton getDBSingleton() throws Exception {
        if (dbSingleton == null) {
            synchronized (DBSingleton.class) {
                if (dbSingleton == null) {
                    dbSingleton = new DBSingleton();
                }
            }
        }
        return dbSingleton;
    }
}
