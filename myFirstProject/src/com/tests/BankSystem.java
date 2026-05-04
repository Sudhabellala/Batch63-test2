package com.tests;

//Account class
class Account {
 private int accNo;
 private String name;
 private double balance;

 // Constructor
 public Account(int accNo, String name, double balance) {
     this.accNo = accNo;
     this.name = name;
     this.balance = balance;
 }
 

 // Deposit method
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Invalid deposit amount! Amount must be greater than 0.");
     }
     balance += amount;
     System.out.println("Deposited ₹" + amount + " successfully. New balance: ₹" + balance);
 }

 // Withdraw method
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance! Available: ₹" + balance);
     }
     balance -= amount;
     System.out.println("Withdrawn ₹" + amount + " successfully. New balance: ₹" + balance);
 }

 // Display account details
 public void display() {
     System.out.println("\nAccount Details:");
     System.out.println("Account No: " + accNo);
     System.out.println("Name: " + name);
     System.out.println("Balance: ₹" + balance);
 }
}

//Main class
public class BankSystem {
 public static void main(String[] args) {
     // Create an account with initial balance
     Account acc = new Account(1001, "Sudha", 5000);

     acc.display();

     // Valid deposit
     try {
         acc.deposit(2000);
     } catch (InvalidAmountException e) {
         System.out.println(e.getMessage());
     }

     // Valid withdrawal
     try {
         acc.withdraw(3000);
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     }

     // Attempt to withdraw more than balance
     try {
         acc.withdraw(6000);
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     }

     // Attempt to deposit a negative amount
     try {
         acc.deposit(-500);
     } catch (InvalidAmountException e) {
         System.out.println(e.getMessage());
     }
 }
}
