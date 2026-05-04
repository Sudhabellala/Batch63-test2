package com.oops.abstraction;

//Main class
public class BankingSystem {
 public static void main(String[] args) {
     // Create SavingsAccount object
     SavingsAccount sa = new SavingsAccount(101, 10000);
     sa.deposit(2000);
     sa.withdraw(1500);
     sa.displayBalance();
     System.out.println("Interest (Savings): " + sa.calculateInterest());

     System.out.println("--------------------------------");

     // Create CurrentAccount object
     CurrentAccount ca = new CurrentAccount(102, 15000);
     ca.deposit(3000);
     ca.withdraw(5000);
     ca.displayBalance();
     System.out.println("Interest (Current): " + ca.calculateInterest());
 }
}