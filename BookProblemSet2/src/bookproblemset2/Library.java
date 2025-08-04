/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookproblemset2;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void loanBook(Book book, int loanCount) {
        if (book.decrementCopies(loanCount)) {
            System.out.println("Successfully loaned out " + loanCount + " copies of \"" + book.title + "\".");
        } else {
            System.out.println("Loan failed. Not enough copies available.");
        }
    }

    public void displayLibrary() {
        System.out.println("\nLibrary Inventory:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
