
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
public class BMI {
    
    public double BMICal(double m,double h) {
        double bmi = m/(h*h);
        System.out.println("BMI: " + bmi);
        return bmi;
    } 
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mass in kilograms (kg): ");
        double mass = sc.nextDouble();
        System.out.println("Enter height in metres (m): ");
        double height = sc.nextDouble();
        BMI obj = new BMI();
        obj.BMICal(mass, height);
    }
}
