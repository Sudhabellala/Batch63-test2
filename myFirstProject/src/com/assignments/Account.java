package com.assignments;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	int getAccountNumber() {
		return accountNumber;
	}
	
	void setAccountHolder(String accountHolder) {
		this.accountHolder=accountHolder;
	}
	String getAccountHolder() {
		return accountHolder;
	}
	
	void setBalance(double balance) {
		this.balance=balance;
	}
	double getBalance() {
		return balance;
	}
	
	void displayAccountDetails() {
		System.out.println("Account NUmber: "+accountNumber);
		System.out.println("Holder: "+accountHolder);
		System.out.println("Balance: "+balance);
	}

}
