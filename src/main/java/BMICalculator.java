
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        System.out.println("Enter weight: ");
        double w = sc.nextDouble();
        double BMI = w/h;
        System.out.println("Your BMI is: " + BMI);    
    }
}
