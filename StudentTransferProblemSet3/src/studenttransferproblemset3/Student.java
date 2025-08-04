/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttransferproblemset3;

/**
 *
 * @author User
 */
public class Student {
     private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + ", ID: " + id);
    }

    // Getter for name or id if needed
    public String getName() {
        return name;
    }
}
