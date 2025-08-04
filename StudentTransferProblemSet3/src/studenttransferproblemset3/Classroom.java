/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttransferproblemset3;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Classroom {
     private String className;
    private ArrayList<Student> students;

    public Classroom(String className) {
        this.className = className;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayStudents() {
        System.out.println("Classroom: " + className);
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Student s : students) {
                s.displayInfo();
            }
        }
    }

    public void transferStudent(Student student, Classroom newClassroom) {
        if (students.contains(student)) {
            removeStudent(student);
            newClassroom.addStudent(student);
            System.out.println("Transferred " + student.getName() + " from " + className + " to " + newClassroom.className);
        } else {
            System.out.println(student.getName() + " is not in " + className);
        }
    }

    
    public ArrayList<Student> getStudents() {
        return students;
    }
}
