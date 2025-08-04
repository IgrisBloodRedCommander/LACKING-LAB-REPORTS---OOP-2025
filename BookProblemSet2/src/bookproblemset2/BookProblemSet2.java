/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookproblemset2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BookProblemSet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library library = new Library();

        // Add specific books
        Book b1 = new Book("The Maze Runner", "James Dashner", 6);
        Book b2 = new Book("Harry Potter", "J.K. Rowling", 8);
        Book b3 = new Book("Twilight", "Stephenie Meyer", 5);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Library System!");
        library.displayLibrary();

        System.out.println("\nWhich book do you want to loan? Enter number:");
        for (int i = 0; i < library.books.size(); i++) {
            System.out.println((i + 1) + ". " + library.books.get(i).title);
        }

        int choice = 0;
        while (true) {
            try {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= library.books.size()) {
                    break;
                } else {
                    System.out.println("Please enter a valid number between 1 and " + library.books.size());
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }

        Book selectedBook = library.books.get(choice - 1);

        System.out.println("Enter number of copies to loan:");
        int count = 0;
        while (true) {
            try {
                count = sc.nextInt();
                if (count > 0) {
                    break;
                } else {
                    System.out.println("Enter a number greater than 0.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }

        library.loanBook(selectedBook, count);

        System.out.println("\nUpdated library inventory:");
        library.displayLibrary();
    }
    }
    

