/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        HashSet <Integer> set = new HashSet();
        System.out.println("How big do you want the list to be?");
        int size = sc.nextInt();
        for(int i = 1; i<=size; i++) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            list.add(n);
        }
        int count = 0;
        for(int i = 0; i<list.size();i++) {
            set.add(list.get(i));
            if(set.contains(i)) {
                count++;
            }
        }
        System.out.println("Frequency: " + count);
        
        
    } 
}
