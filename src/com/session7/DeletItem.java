package com.session7;

import java.sql.*;

public class DeletItem {
    public static void main(String[] args) throws SQLException {
        //Connect to database
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "amirtha", "pwd");
        System.out.println("Connection established...");
        //Create statement
        Statement statement = connection.createStatement();
        System.out.println("Statement executed");
        //Execute statement
        ResultSet resultSet = statement.executeQuery("select * from items");
        statement.executeUpdate("delete from items where itemid = 102");
        resultSet.close();
        //Closing the connection
        connection.close();
        System.out.println("Connection closed...");
    }
}
