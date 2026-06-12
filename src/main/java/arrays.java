
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;

class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; //decided the length of array

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
