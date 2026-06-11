/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class StudentMarksSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList();
        while(true) {
            System.out.println("Menu ");
            System.out.println("1. Input marks: ");
            System.out.println("2. Remove marks: ");
            System.out.println("3. Find highest/lowest marks: ");
            System.out.println("4. Count the number of students who got equal to or more than 90%");
            System.out.println("Select choice from 1-4: ");
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                   System.out.println("How many times do you want to input the marks?: ");
                   int n = sc.nextInt();
                   for(int i = 1; i<=n; i++) {
                       System.out.println("Enter marks: ");
                       int result = sc.nextInt();
                       marks.add(result);
                   }
                   System.out.println(marks);
                   break;
                   
                case 2:
                    // remove marks
                    System.out.println("Enter which position was your marks inputed which you want to delete: ");
                    int pos = sc.nextInt();
                    
                    marks.remove(pos);
                    System.out.println("Updated list: " + marks);
                    break;
                
                case 3:
                    int max = marks.get(0);
                    for(int i = max; i<marks.size(); i++) {
                        if(marks.get(i)>max) {
                            max = marks.get(i);
                        }
                    }
                    System.out.println("Maximum marks: " + max);
                    
                    int min = marks.get(0);
                    for(int i = 1; i<marks.size(); i++) {
                        if(marks.get(i)<min) {
                            min = marks.get(i);
                        }
                    }
                    System.out.println("Minimum marks: " + min);
                    break;
                    
                case 4:
                    //since maximum marks which can be scored, 90% of 80 is 72, hence anyone who got a 72 or above got equal to or more than a 90%
                    for(int i = 1; i < marks.size(); i++) {
                        if(marks.get(i) >= 72) {
                            System.out.println(marks.get(i) + " has scored 90% above");
                        }
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice: ");
            }
        }
    }
}
