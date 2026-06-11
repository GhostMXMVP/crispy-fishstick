/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;

public class LibraryBookManager {

    public static void main(String[] args) {
        ArrayList<String> library = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Add books");
            System.out.println("2. Remove books");
            System.out.println("3. Search books");
            System.out.println("4. Display all books alphabetically");
            System.out.println("Enter choice(1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How many books do you want to add?");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Enter book name: ");
                        String books = sc.nextLine();
                        library.add(books);
                    }
                    System.out.println(library);
                    break;

                case 2:
                    System.out.println(library);
                    System.out.println("Which book do you want to remove?? (select the position at which the book is): ");
                    int pos = sc.nextInt();
                    library.remove(library.get(pos));
                    System.out.println("ITEM REMOVED");
                    System.out.println("Updated list: " + library);
                    break;

                case 3:
                    System.out.println("Enter book title to search (Spelling should be correct and all cases should be matching): ");
                    String search = sc.nextLine();
                    if (library.contains(search)) {
                        System.out.println("The book is there in the Library");
                    } else {
                        System.out.println("Book not found");
                    }
                    break;

                case 4:
                    Collections.sort(library);
                    System.out.println(library);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
