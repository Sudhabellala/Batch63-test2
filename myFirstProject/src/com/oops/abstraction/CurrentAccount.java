package com.oops.abstraction;

//Subclass: CurrentAccount
class CurrentAccount extends BankAccount {
 private static final double INTEREST_RATE = 0.02; // 2%

 public CurrentAccount(int accountNumber, double balance) {
     super(accountNumber, balance);
 }

 @Override
 double calculateInterest() {
     return balance * INTEREST_RATE;
 }
}
