/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.sql.Connection;
import java.sql.DriverManager;  // <-- CRITICAL: Make sure this one is included!
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    private static final String URL = "jdbc:h2:./bmidb;AUTO_SERVER=TRUE";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    // The method signature MUST include "throws SQLException"
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.h2.Driver"); 
        } catch (ClassNotFoundException e) {
            System.err.println("Driver missing: " + e.getMessage());
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void initializeDatabase() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS bmi_records ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100), "
                + "gender VARCHAR(10), "
                + "age DOUBLE, "
                + "weight DOUBLE, "
                + "height DOUBLE, "
                + "bmi DOUBLE, "
                + "bmr DOUBLE, "
                + "maintenance_calories DOUBLE, "
                + "protein_target DOUBLE, "
                + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                + ");";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(createTableSQL);
            System.out.println("[Database System Active]");
            System.out.println("----------------------------------------");
            
        } catch (SQLException e) {
            System.err.println("Database initialization failed: " + e.getMessage());
        }
    }

    public static void displayDatabaseContents() {
        String querySQL = "SELECT * FROM bmi_records ORDER BY created_at DESC";

        System.out.println("\n==========================================================================================");
        System.out.println("                               DATABASE RECORDS LOG                                       ");
        System.out.println("==========================================================================================");
        System.out.printf("%-4s | %-12s | %-6s | %-5s | %-8s | %-8s | %-6s | %-12s | %-14s\n", 
                "ID", "NAME", "GENDER", "AGE", "WEIGHT", "HEIGHT", "BMI", "MAINT. CAL", "PROTEIN TARGET");
        System.out.println("------------------------------------------------------------------------------------------");

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(querySQL)) {

            while (rs.next()) {
                System.out.printf("%-4d | %-12s | %-6s | %-5.1f | %-8.1f | %-8.2f | %-6.2f | %-12.1f | %-14.1f\n", 
                        rs.getInt("id"), 
                        rs.getString("name"), 
                        rs.getString("gender"), 
                        rs.getDouble("age"), 
                        rs.getDouble("weight"), 
                        rs.getDouble("height"), 
                        rs.getDouble("bmi"), 
                        rs.getDouble("maintenance_calories"), 
                        rs.getDouble("protein_target"));
            }
            System.out.println("==========================================================================================");

        } catch (SQLException e) {
            System.err.println("Error reading records from database: " + e.getMessage());
        }
    }
}