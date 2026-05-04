package com.oops.abstraction;

//Abstract class BankAccount demonstrating Abstraction
abstract class BankAccount {
 protected int accountNumber;
 protected double balance;

 public BankAccount(int accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Abstract method
 abstract double calculateInterest();

 // Concrete methods
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance or invalid amount!");
     }
 }

 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
 }
}

