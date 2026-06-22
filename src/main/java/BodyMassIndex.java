/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BodyMassIndex {

    // Saves tracking data by borrowing a connection from DatabaseManager
    public void saveToDatabase(String name, String gender, double age, double weight, double height, 
                               double bmi, double bmr, double maintenanceCal, double proteinTarget) {
        
        String insertSQL = "INSERT INTO bmi_records (name, gender, age, weight, height, bmi, bmr, "
                         + "maintenance_calories, protein_target) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            pstmt.setString(1, name);
            pstmt.setString(2, gender);
            pstmt.setDouble(3, age);
            pstmt.setDouble(4, weight);
            pstmt.setDouble(5, height);
            pstmt.setDouble(6, bmi);
            pstmt.setDouble(7, bmr);
            pstmt.setDouble(8, maintenanceCal);
            pstmt.setDouble(9, proteinTarget);

            pstmt.executeUpdate();
            System.out.println("\n>>> [Success] This metrics sheet has been securely saved to H2 database.");

        } catch (SQLException e) {
            System.err.println("\n>>> [Database Error] Failed to save record: " + e.getMessage());
        }
    }

    // --- YOUR CALCULATION METHODS ---
    double[] calculateBMIandCalories(double m, double h, String n, double a, String g, String e) {
        double bmi = m / (h * h);
        double bmr = 0;
        double new_Height = h * 100; 
        double maintenance_cal = 0;

        if (g.equalsIgnoreCase("Male") || g.equalsIgnoreCase("M")) {
            bmr = 10 * m + 6.25 * new_Height - 5 * a + 5;
        } else if (g.equalsIgnoreCase("Female") || g.equalsIgnoreCase("F")) {
            bmr = 10 * m + 6.25 * new_Height - 5 * a - 161;
        }

        if (e.toLowerCase().contains("little") || e.toLowerCase().contains("none")) {
            maintenance_cal = bmr * 1.2;
        } else if (e.toLowerCase().contains("light")) {
            maintenance_cal = bmr * 1.375;
        } else if (e.toLowerCase().contains("mod")) {
            maintenance_cal = bmr * 1.55;
        } else if (e.toLowerCase().contains("heavy")) {
            maintenance_cal = bmr * 1.725;
        } else {
            maintenance_cal = bmr * 1.2;
        }

        System.out.println("\n=== HEALTH REPORT SUMMARY ===");
        System.out.println("Name: " + n);
        System.out.println("Age: " + a);
        System.out.println("Gender: " + g);
        System.out.println("BMI: " + String.format("%.2f", bmi));
        System.out.println("Basal Metabolic Rate (BMR): " + String.format("%.2f", bmr) + " kcal");
        System.out.println("Maintenance Calories: " + String.format("%.2f", maintenance_cal) + " kcal");

        if (bmi <= 18.5) {
            System.out.println("Status: You are underweight");
            System.out.println("Advice: You need to consume more calories than your maintenance calories to gain weight safely.");
        } else if (bmi > 18.5 && bmi <= 24.9) {
            System.out.println("Status: You are normal weight");
            System.out.println("Advice: Maintain your current routine; your weight is already optimal.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Status: You are overweight");
            System.out.println("Advice: Consume fewer calories than your maintenance value to shed weight.");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Status: You have Class I Obesity");
            System.out.println("Advice: Enter a controlled caloric deficit relative to your maintenance target.");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Status: You have Class II Obesity");
            System.out.println("Advice: You are in an extreme tier; consistent calorie tracking is highly recommended.");
        } else { 
            System.out.println("Status: You have Class III obesity (severely obese)");
            System.out.println("Advice: Structured caloric deficits are vital to lower clinical health risks.");
        }

        return new double[]{bmi, bmr, maintenance_cal};
    }

    double calculateProteinTarget(double m, double bmi) {
        double pt = 0;
        if (bmi <= 18.5) pt = m * 2;
        else if (bmi > 18.5 && bmi <= 24.9) pt = m * 1.6;
        else pt = m * 2.4;
        
        System.out.println("Your targeted daily protein requirement: " + String.format("%.2f", pt) + "g");
        return pt;
    }

    void targetCal(double m) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your target weight (kg): ");
        double target_w = sc.nextDouble();
        System.out.print("Enter the time duration amount: ");
        double time = sc.nextDouble();
        System.out.print("Enter unit of time (weeks/months/years): ");
        String unit_t = sc.next();
        
        double originalTime = time;
        if (unit_t.equalsIgnoreCase("weeks")) time = time * 7;
        else if (unit_t.equalsIgnoreCase("months")) time = time * 30;
        else if (unit_t.equalsIgnoreCase("years")) time = time * 365;
        
        double weight_toLose = m - target_w;
        double cal_deficit = (weight_toLose * 7700) / time;
        
        System.out.println("\nTo lose " + weight_toLose + " kg in " + originalTime + " " + unit_t + ":");
        System.out.println("Maintain a daily calorie deficit of: " + String.format("%.2f", cal_deficit) + " kcal.");
    }
    
    // --- MAIN EXECUTION PIPELINE ---
    public static void main(String[] args) {
        // Step 1: Initialize database files using your external manager
        DatabaseManager.initializeDatabase();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter your gender (Male/Female): ");
        String gender = sc.next();
        System.out.print("Enter mass (kg): ");
        double mass = sc.nextDouble();
        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();
        System.out.print("Enter age: ");
        double age = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Input activity level (none, light, moderate, heavy): ");
        String exercise = sc.nextLine();
        
        BodyMassIndex obj = new BodyMassIndex();
        
        // Step 2: Run core metrics analysis algorithms
        double[] metrics = obj.calculateBMIandCalories(mass, height, name, age, gender, exercise);
        double currentBmi = metrics[0];
        double currentBmr = metrics[1];
        double maintenanceCalories = metrics[2];
        
        // Step 3: Run protein computation check
        double proteinTarget = obj.calculateProteinTarget(mass, currentBmi);
        
        // Step 4: Write values out to your persistent H2 file database
        obj.saveToDatabase(name, gender, age, mass, height, currentBmi, currentBmr, maintenanceCalories, proteinTarget);
        
        // Step 5: Process targeted projection logs
        obj.targetCal(mass);
        
        // Step 6: Query H2 and print out all saved table contents right in the console layout
        DatabaseManager.displayDatabaseContents();
        
        sc.close();
    } 
}