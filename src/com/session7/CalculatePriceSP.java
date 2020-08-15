package com.session7;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class CalculatePriceSP {
    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionFactory.getConnection();
        CallableStatement callableStatement = connection.prepareCall("{call usp_Calculate_Price(?,?,?)}");
        callableStatement.setInt(1, 10000);
        callableStatement.setInt(2, 5);
        callableStatement.registerOutParameter(3, Types.INTEGER);
        callableStatement.execute();
        System.out.println("Total amount : " + callableStatement.getInt(3));
        callableStatement.close();
        connection.close();
    }
}
