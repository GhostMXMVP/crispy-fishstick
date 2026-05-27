
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter marks in Mathematics: ");
        double m1 = sc.nextDouble();
        System.out.println("Enter marks in Physics: ");
        double m2 = sc.nextDouble();
        System.out.println("Enter marks in Chemistry: ");
        double m3 = sc.nextDouble();
        
        double average = m1 + m2 + m3/3;
        double max1 = Math.max(m1, m2);
        double max2 = Math.max(max1, m3);
        System.out.println("Name: " + name);
        System.out.println("Marks in Mathematics: " + m1);
        System.out.println("Marks in Physics: " + m2);
        System.out.println("Marks in Chemistry: " + m3);
        System.out.println("Highest marks scored: "  + max2);
        System.out.println("Average: " + average);
    }
}
