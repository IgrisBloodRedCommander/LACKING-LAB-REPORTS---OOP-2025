/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainbank;

/**
 *
 * @author User
 */
public class BankAccounts {

    private String accountHolder;
    private String accountNumber;
    private double accountBalance;
    private double deposit;
    private double withdraw;
public BankAccounts (){
withdraw = 0;
}

    public BankAccounts(String holder, String number, double balance, double withdraw, double deposit) {
        this.accountBalance = balance;
        this.accountHolder = holder;
        this.accountNumber = number;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }
   
     
public void displayNewAmount (){
    System.out.println("Current Balance Available: "+withDrawMoney());
}
public void displayNewAmount2 (){
    System.out.println("Current Balance Available: "+depositMoney());
}
    public double withDrawMoney (){
    return accountBalance - withdraw;
    }
    public double depositMoney (){
    return accountBalance + deposit;
    }
    public void displayBankAccount (){
        System.out.println("Bank Details: \nAccount Holder: "+ accountHolder+"\nAccount Number: "+accountNumber+"\nAccount Balance: "+ accountBalance);
    }
    public double getBalance() {
    return accountBalance;
}

public String getAccountName() {
    return accountHolder;
}

public void withdraw(double amount) {
    if (amount > 0 && accountBalance >= amount) {
        accountBalance -= amount;
    }
}

public void deposit(double amount) {
    if (amount > 0) {
        accountBalance += amount;
    }
}
    
}


        
    

    
  
