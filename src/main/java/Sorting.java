

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> list = new ArrayList();
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++) {
            System.out.println("Enter student's name: ");
            String name = sc.next();
            list.add(name);
        }
        
        System.out.println(list);
        
        ArrayList<Integer> results = new ArrayList();
        for(int i = 1; i<=n; i++) {
            System.out.println("Enter marks of the student: ");
            int marks = sc.nextInt();
            results.add(marks);
        }
        System.out.println(results);
        int max = results.get(0);
        for(int i = max; i < list.size(); i++) {
            if(results.get(i)>max) {
                max = results.get(i);
            }
        }
        
        int min = results.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(results.get(i) < min) {
                min = results.get(i);
            }
            
            if(results.get(i) > 40) {
                results.remove(results.get(i));               
            }
        }
        System.out.println(results);
        System.out.println("Minimum marks: " + min);
        System.out.println("Maximum marks: " + max);
        
       
        
    }
    
}       