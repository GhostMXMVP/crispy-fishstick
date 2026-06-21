/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class HashDuplicate {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet();
        ArrayList<Integer> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want in the list: ");
        int s = sc.nextInt();
        for(int i = 1; i<=s; i++) {
            System.out.println("Enter number: ");
            int num = sc.nextInt();
            list.add(num);
        }
        int count = 0;
        for(int i = 0; i<list.size(); i++) {
           boolean result  =  set.add(list.get(i));
           if(result == false) {
               System.out.println("Duplicate found " + list.get(i));
           }
        }
    }
}
