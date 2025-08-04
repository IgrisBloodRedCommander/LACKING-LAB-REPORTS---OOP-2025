/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookactivity;

/**
 *
 * @author User
 */
public class BookClass {

    private String title;
    private String author;
    private int copies;

    public BookClass(String title, String author, int copies) {
        this.author = author;
        this.title = title;
        this.copies = copies;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nNo. of Copies: " + copies);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

}
