package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {
    public static Connection Connector() {
        try {
            // 1) Load the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // 2) Build the JDBC URL to point at your SalmanBankDB database:
            String url = "jdbc:sqlserver://localhost:1433;"
                       + "databaseName=SalmanBankDB;"
                       + "user=Salmanappuser;"
                       + "password=skb123;"
                       + "encrypt=true;trustServerCertificate=true;";

            // 3) OPEN a connection using that URL 
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
