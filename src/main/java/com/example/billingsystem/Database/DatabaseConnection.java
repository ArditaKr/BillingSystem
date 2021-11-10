package com.example.billingsystem.Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection databaseLink;

    public Connection getConnection(){
        String database_name= "billingsystem";
        String databaseUser = "root";
        String database_password = "";
        String url = "jdbc:mysql://localohost:3306/nillingsystem";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseUser,database_password);

        }
        catch(Exception e){
            e.printStackTrace();
            e.getCause();

        }
        return databaseLink;

    }
}
