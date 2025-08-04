/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samplecrud;

/**
 *
 * @author User
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_connection {
    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/StudentInformation_Test",
                    "root", "root"  
                );
            } catch (ClassNotFoundException e) {
                System.out.println("MySQL JDBC Driver not found");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Connection failed! Check your database credentials and server.");
                e.printStackTrace();
            }
        }
        return conn;
    }
}
