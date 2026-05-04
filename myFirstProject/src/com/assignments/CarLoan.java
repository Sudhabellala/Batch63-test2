package com.assignments;

public class CarLoan extends Loan implements Payable{
	String carModel;

	public CarLoan(int loanId, String borrowerName, int amount,String carModel) {
		super(loanId, borrowerName, amount);
		this.carModel=carModel;
	}

	@Override
	public void makePayment(double amount) {
		
	}

	@Override
	double calculateEMI() {
		return 0;
	}
	

}
