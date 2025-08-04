/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainbank;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MainBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccounts accDetail = new BankAccounts("Lex Matondo", "2708", 23000, 0, 0);
    BankAccounts accDetail2 = new BankAccounts("Sung Jinwoo", "1234", 35000, 0, 0);
    Scanner bankTest = new Scanner(System.in);

    System.out.println("-------------------Gringots Bank-------------------");
    System.out.println("First Account:");
    accDetail.displayBankAccount();
    System.out.println("---------------------------------------------------\nSecond Account:");
    accDetail2.displayBankAccount();
    System.out.println("---------------------------------------------------\n1. Withdraw\n2. Deposit\n3. Transfer Money\nInput Here: ");

    int pickChoice;
    while (true) {
        try {
            pickChoice = bankTest.nextInt();
            if (pickChoice >= 1 && pickChoice <= 3) {
                break;
            } else {
                System.out.println("Please enter 1-3 only.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter 1-3.");
            bankTest.next();
        }
    }

    if (pickChoice == 1 || pickChoice == 2) {
        System.out.println("Choose Account:\n1. Lex Matondo\n2. Sung Jinwoo");
        int accChoice;
        while (true) {
            try {
                accChoice = bankTest.nextInt();
                if (accChoice == 1 || accChoice == 2) {
                    break;
                } else {
                    System.out.println("Please enter 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                bankTest.next();
            }
        }

        BankAccounts selectedAccount = (accChoice == 1) ? accDetail : accDetail2;

        if (pickChoice == 1) { // Withdraw
    double inputWithdraw = 0;
    while (true) {
        System.out.println("---------------------------------------------------\nInput Withdrawal Amount: ");
        try {
            inputWithdraw = bankTest.nextDouble();

            if (inputWithdraw <= 0) {
                System.out.println("Please enter an amount greater than 0.");
            } else if (inputWithdraw > selectedAccount.getBalance()) {
                System.out.println("Insufficient funds. Your balance is: ₱" + selectedAccount.getBalance());
            } else {
                break; // valid amount
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            bankTest.next(); // clear invalid input
        }
    }

    selectedAccount.withdraw(inputWithdraw);
    System.out.println("Updated Account Details:");
    selectedAccount.displayBankAccount();
}

        if (pickChoice == 2) { // Deposit
            System.out.println("---------------------------------------------------\nInput Deposit Amount: ");
            double inputDeposit = bankTest.nextDouble();
            selectedAccount.deposit(inputDeposit);
            System.out.println("Updated Account Details:");
            selectedAccount.displayBankAccount();
        }
    }

    if (pickChoice == 3) {
        System.out.println("---------------------------------------------------");
        BankTransfer transfer = new BankTransfer();
        transfer.transferMoney(accDetail, accDetail2);
    }
}
}