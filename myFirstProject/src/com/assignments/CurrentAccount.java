package com.assignments;

public class CurrentAccount extends Account{
	double overdraftField;
	public CurrentAccount(int accountNumber, String accountHolder, double balance,double overdraftField) {
		super(accountNumber, accountHolder, balance);
		this.overdraftField=overdraftField;
	}
	
	void displayOverdraft() {
		System.out.println("Overdraft Limit");
	}
	@Override
	void displayAccountDetails() {
		displayOverdraft();
		super.displayAccountDetails();
	}

}
