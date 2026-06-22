/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;

public class StudentSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> set1 = new HashMap();
        System.out.println("How big do you want the hash map to be?");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println("Enter name: ");
            sc.next();
            String name = sc.nextLine();
            System.out.println("Enter marks: ");
            int marks = sc.nextInt();
            set1.put(name, marks);
        }

        System.out.println("MENU:");
        System.out.println("1. Add students to current list");
        System.out.println("2. Remove students from current list");
        System.out.println("3. Search for student in current list");
        System.out.println("4. Clear list");
        System.out.println("5. Make new list");
        System.out.println("Enter choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("How many students do you want to add?");
                int s2 = sc.nextInt();
                for (int i = 0; i < s2; i++) {
                    System.out.println("Enter name: ");
                    sc.next();
                    String n2 = sc.nextLine();
                    System.out.println("Enter marks: ");
                    int m2 = sc.nextInt();
                    set1.put(n2, m2);
                }
                break;

            case 2:
                System.out.println("Enter name: ");
                String name2 = sc.nextLine();
                System.out.println("Enter marks: ");
                int marks2 = sc.nextInt();
                if (set1.containsKey(name2) && set1.containsKey(marks2)) {
                    set1.remove(name2, marks2);
                    System.out.println("Item removed successfully");
                    System.out.println(set1);
                } else {
                    System.out.println("Item not found in the list");
                }
                break;

            case 3:
                System.out.println("Enter the name of student you want to search: ");
                int n3 = sc.nextInt();
                System.out.println("Enter the marks of student you want: ");
                int m3 = sc.nextInt();
                if (set1.containsKey(n3) && set1.containsKey(m3)) {
                    System.out.println("Item found");
                } else {
                    System.out.println("Item not found");
                }
                break;

            case 4:
                set1.clear();
                System.out.println("List cleared");
                System.out.println(set1);
                break;

            case 5:
                HashMap<String, Integer> set2 = new HashMap();
                System.out.println("How big do you want the hash map to be?");
                int s4 = sc.nextInt();
                for (int i = 0; i < s4; i++) {
                    System.out.println("Enter name: ");
                    sc.next();
                    String name6 = sc.nextLine();
                    System.out.println("Enter marks: ");
                    int marks6 = sc.nextInt();
                    set1.put(name6, marks6);
                }
                break;
        }
    }

}
