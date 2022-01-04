package com.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private ConnectionFactory(){}

    public static Connection getconection(){
        try{
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/AllController","postgres","40028922");
        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    };
}
