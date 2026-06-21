

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */

class Swap {

    int a, b;

    // Constructor
    Swap(int x, int y) {

        System.out.println("Before Swapping:");
        System.out.println("a = " + x);
        System.out.println("b = " + y);

        // Swapping
        a = y;
        b = x;

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);  
    }

    public static void main(String[] args) {
        Swap obj = new Swap(10, 20);
        
        while (true) {
            System.out.println("Hello");
        }
    }
}