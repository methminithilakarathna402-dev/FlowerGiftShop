/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flowergiftshop.dao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Methmini
 */
public class DatabaseConnection {
     public static Connection getConnection() throws java.sql.SQLException  {

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/flower_gift_shop",
            "root",
            ""
        );
    }
}
