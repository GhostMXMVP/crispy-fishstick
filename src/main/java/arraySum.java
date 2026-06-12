/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of array: " + sum);
    }
}
