package com.assignments;

public class SavingsAccount extends Account {
	double interestRate;
	public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
		super(accountNumber, accountHolder, balance);
		this.interestRate=interestRate;
	}
	
	void calculateInterset() {
		interestRate=getBalance()*interestRate/100;
		System.out.println("InterestRate: "+interestRate);
	}
	@Override
	void displayAccountDetails() {
		calculateInterset();
		super.displayAccountDetails();
	}
}
