/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookactivity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Library_Class {

    private List<BookClass> books;

    public Library_Class() {
        books = new ArrayList<>();
    }

    public void addBook(BookClass book) {
        books.add(book);
    }

    public void updateBookTitle(BookClass book, String newTitle) {
        System.out.println("Updating book title from \"" + book.getTitle() + "\" to \"" + newTitle + "\".");
        book.setTitle(newTitle);
    }

    public void attemptPrimitiveChange(int number) {
        System.out.println("Inside method before change: " + number);
        number = 999;
        System.out.println("Inside method after change: " + number);
    }

    public void displayLibrary() {
        System.out.println("Library Inventory:");
        for (BookClass book : books) {
            book.displayBookInfo();
        }
    }
}
