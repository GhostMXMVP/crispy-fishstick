/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;
public class arraySortBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How big do you want the array to be?");
        int n = sc.nextInt();
        sc.nextLine();
        String [] arr = new String[n];    
        for(int i = 0; i<arr.length; i++) {           
            arr[i] = sc.nextLine();
        }
         
        Arrays.sort(arr);
        
        for(String books:arr) {
            System.out.println(books);
        }
        
    
    }
}
