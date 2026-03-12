package org.example.Config;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DatabaseConnection {
    private static final String url = "jdbc:postgresql://localhost:5432/HospitalManagement";
    private static final  String userName = "postgres";
    private static final  String password = "Hello12@12";

  Connection connection;


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,userName,password);
    }


}
