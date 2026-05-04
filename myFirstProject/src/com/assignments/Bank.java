package com.assignments;

public class Bank {

	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount(12345,"Sudha",5000.0,12.5);
		s.displayAccountDetails();
		
		CurrentAccount c=new CurrentAccount(34567,"Jyothi",10000.0,25.0);
		c.displayAccountDetails();
	}
}
