/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplestore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class SQLconnection {

    private static Connection storeConnection = null;

    public static Connection getConnection() {
        if (storeConnection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                storeConnection = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/Store", //NAME SA DATA BASE
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
        return storeConnection;
    }
}
