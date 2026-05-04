package com.oops.abstraction;

//Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
 private static final double INTEREST_RATE = 0.05; // 5%

 public SavingsAccount(int accountNumber, double balance) {
     super(accountNumber, balance);
 }

 @Override
 double calculateInterest() {
     return balance * INTEREST_RATE;
 }
}
