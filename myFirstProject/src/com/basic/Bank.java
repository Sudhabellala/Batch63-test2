package com.basic;

public class Bank {
	double account_no;
	double amount;
	String name;
	long pin=23415;
	
	void name() {
		name="Sudha";
		System.out.println("Name: "+name);
	}
	
	
	void checkBalance() {
		amount=30000;
		System.out.println("The amount is :"+amount);
	}
	void withdraw() {
		int w=5000;
		amount=amount-w;
		System.out.println("After withdraw the amount is: "+amount);
		
	}
	void deposite() {
		int d=1000;
		amount=amount+d;
		System.out.println("After deposite the amount is: "+amount);
	}
	void changePin() {
		long pin=12345;
		System.out.println("After changing pin,the new pin is: "+pin);
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		b.name();
		
		b.checkBalance();
		
		b.withdraw();
		
		b.deposite();
		
		b.changePin();
		
	}

}
