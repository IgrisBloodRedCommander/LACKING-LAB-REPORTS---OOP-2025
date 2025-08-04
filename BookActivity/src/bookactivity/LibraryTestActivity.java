/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookactivity;

import javax.crypto.AEADBadTagException;

/**
 *
 * @author User
 */
public class LibraryTestActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library_Class library = new Library_Class();

        // This part creates and add Book objects to the library
        BookClass book1 = new BookClass("1984", "George Orwell", 5);
        BookClass book2 = new BookClass("To Kill a Mockingbird", "Harper Lee", 3);
        library.addBook(book1);
        library.addBook(book2);

        // Displays library details before updates
        System.out.println("Before update:");
        library.displayLibrary();

        // Task A
        library.updateBookTitle(book1, "Nineteen Eighty-Four");

        // This part displays library details
        System.out.println("\nAfter updating book title:");
        library.displayLibrary();

        // Task B
        int originalNumber = 123;
        System.out.println("\nOriginal number before method call: " + originalNumber);
        library.attemptPrimitiveChange(originalNumber);
        System.out.println("Original number after method call: " + originalNumber);
    }
}
