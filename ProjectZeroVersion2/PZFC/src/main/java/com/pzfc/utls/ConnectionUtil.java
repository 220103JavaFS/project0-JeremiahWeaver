package com.pzfc.utls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(("org.postgresql.Drive"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql:database-1.cv5xhzgqb1is.us-east-1.rds.amazonaws.com:5432";
        String username = "postgres";
        String password = System.getenv("var-name");

        return DriverManager.getConnection(url, username, password);
    }

}


