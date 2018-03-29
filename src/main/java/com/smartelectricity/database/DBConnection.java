package com.smartelectricity.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@smarte.c3b0tdtt6v01.ap-south-1.rds.amazonaws.com:1521:xe","janithsg","Mapalagama1");
    }

    public static DBConnection getDbConnection() throws SQLException, ClassNotFoundException {
        dbConnection = new DBConnection();

        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
