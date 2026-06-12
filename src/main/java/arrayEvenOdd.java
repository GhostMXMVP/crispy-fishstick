/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class arrayEvenOdd {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int[] arr = new int[5];
        int evenCount = 0;
        int oddCount=0;
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Number of odd number: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
    }
    
}
