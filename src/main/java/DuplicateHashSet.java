/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class DuplicateHashSet {
    public static void main(String[] args) {
        HashSet <Integer> set1 = new HashSet();
        HashSet <Integer> set2 = new HashSet();
        Scanner sc = new Scanner(System.in);
        System.out.println("How big would you like the first set to be?");
        int s1 = sc.nextInt();
        for(int i = 1; i<=s1; i++) {
            System.out.println("Enter words: ");
            int n1 = sc.nextInt();
            set1.add(n1);
        }
        
        System.out.println("How big would you like the second set to be?");
        int s2 = sc.nextInt();
        for(int i = 1; i<=s2; i++) {
            System.out.println("Enter words: ");
            int n2 = sc.nextInt();
            set2.add(n2);
        }
        
       
        for(int i = 1; i<set1.size(); i++) {
            if(set2.contains(i)) {
                System.out.println("Duplicate found");
            } else {
                System.out.println("Duplicate not found");
            }
        }
    }
}
