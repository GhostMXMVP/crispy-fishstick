/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class arrayNumberType {
    // program to find if numbers in the array are positive, negative or zero
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]>0) {
                positiveCount++;
            } else if(arr[i]<0) {
                negativeCount++;
            } else if(arr[i]==0) {
                zeroCount++;
            }
        }
        
        System.out.println("Number of 0s in the array: " + zeroCount);
        System.out.println("Number of positive numbers in the array: " + positiveCount);
        System.out.println("Number of negative numbers in the array: " + negativeCount);
    }
}
