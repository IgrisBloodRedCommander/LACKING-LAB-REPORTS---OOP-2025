/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainbank;

import java.util.Scanner;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class BankTransfer {

    public void transferMoney(BankAccounts from, BankAccounts to) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.print("Enter amount to transfer from " + from.getAccountName() + " to " + to.getAccountName() + ": Php");

        double amount;
        while (true) {
            try {
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    System.out.print("Enter a positive amount: Php");
                } else if (from.getBalance() < amount) {
                    System.out.print("Insufficient funds. Enter a smaller amount: Php");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter a valid number: Php");
                scanner.next(); 
            }
        }

        from.withdraw(amount);
        to.deposit(amount);

        System.out.println("Successfully transferred Php" + amount + " from " + from.getAccountName() + " to " + to.getAccountName());

     
        System.out.println("\nUpdated Account Details:");
        from.displayBankAccount();
        System.out.println();
        to.displayBankAccount();
    }
}




   
  
     
   
