

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;

public class ArrayListDuplicate {
    
    static ArrayList <Integer> list2 = new ArrayList();
    void found(int a) {
        
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to add in the list?");
        int s = sc.nextInt();
        for(int i = 1; i<=s; i++) {
            System.out.println("Enter number: ");
            int num = sc.nextInt();
            list.add(num);
        }
        int count = 0;
        for(int i = 0; i<list.size(); i++) {
           int b = list.get(i);
            boolean duplicate = addIfNot(b);
            if(duplicate) {
                System.out.println(" Duplicate found " + b);
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
    
    public static boolean addIfNot(int a) {
        int count = 0;
        for(int i=0;i<list2.size();i++) {
            if(list2.get(i)==a) {
                return true;         
            } 
        }
        list2.add(a);
        return false;
    }
}
