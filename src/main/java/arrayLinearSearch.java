/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class arrayLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Which number would you like to find in the array?");
        int key = sc.nextInt();
        boolean found = false;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == key) {
                found = true;
            } else {
                found = false;
            }
        }
        
        if(found) {
            System.out.println(key + " was found in the array");
        } else {
            System.out.println(key + " was not found in the array");
        }
    }
}
