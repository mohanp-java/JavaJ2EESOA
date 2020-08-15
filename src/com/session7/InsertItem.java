package com.session7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertItem {
    public static void main(String[] args) throws SQLException {
        //Connect to database
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "amirtha", "pwd");
        System.out.println("Connection established...");
        //Create statement
        Statement statement = connection.createStatement();
        System.out.println("Statement executed");
        //Execute statement
        statement.execute("insert into items values(100, 'Apple watch', 30000)");
        System.out.println("Table created");
        //Closing the connection
        connection.close();
        System.out.println("Connection closed...");
    }
}
