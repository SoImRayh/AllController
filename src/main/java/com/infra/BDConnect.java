package com.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnect {
    private BDConnect(){}

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/AllController","postgres","123");
        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
    }
}
