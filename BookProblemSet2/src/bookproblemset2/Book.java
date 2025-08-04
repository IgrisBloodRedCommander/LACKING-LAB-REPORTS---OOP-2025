/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookproblemset2;

/**
 *
 * @author User
 */
public class Book {
     String title;
    private String author;
    private int copies;

    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available Copies: " + copies);
    }

    public boolean decrementCopies(int count) {
        if (count <= copies && count > 0) {
            copies -= count;
            return true;
        } else {
            return false;
        }
    }

    // Getter for copies to check availability outside if needed
    public int getCopies() {
        return copies;
    }
}
