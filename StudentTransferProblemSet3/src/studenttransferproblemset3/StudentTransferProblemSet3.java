/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studenttransferproblemset3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StudentTransferProblemSet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Classroom classA = new Classroom("Classroom A");
        Classroom classB = new Classroom("Classroom B");

        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);
        Student s3 = new Student("Charlie", 103);

        classA.addStudent(s1);
        classA.addStudent(s2);
        classA.addStudent(s3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Students in Classroom A before transfer:");
        classA.displayStudents();

        System.out.println("\nStudents in Classroom B before transfer:");
        classB.displayStudents();

        System.out.println("\nSelect a student to transfer by number:");
        for (int i = 0; i < classA.getStudents().size(); i++) {
            System.out.println((i + 1) + ". " + classA.getStudents().get(i).getName());
        }

        int choice = 0;
        while (true) {
            try {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= classA.getStudents().size()) {
                    break;
                } else {
                    System.out.println("Please select a valid student number.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }

        Student selectedStudent = classA.getStudents().get(choice - 1);
        classA.transferStudent(selectedStudent, classB);

        System.out.println("\nStudents in Classroom A after transfer:");
        classA.displayStudents();

        System.out.println("\nStudents in Classroom B after transfer:");
        classB.displayStudents();
    }
    }
    

