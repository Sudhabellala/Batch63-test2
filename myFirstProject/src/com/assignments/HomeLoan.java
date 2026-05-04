package com.assignments;

public class HomeLoan extends Loan implements Payable{
int homeValue;

	public HomeLoan(int loanId, String borrowerName, int amount,int homeValue) {
		super(loanId, borrowerName, amount);	
		this.homeValue=homeValue;
	}
	
	public double calculateEMI() {
		double emi=(getAmount()*0.06)/12;
		return emi;
	}

	@Override
	public void makePayment(double amount) {
		
	}

}
