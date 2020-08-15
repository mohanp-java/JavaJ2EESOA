package com.session7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection connection = null;

    public static Connection getConnection() throws Exception{
        if(connection == null) {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "amirtha", "pwd");
            System.out.println("Connected to the database");
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
