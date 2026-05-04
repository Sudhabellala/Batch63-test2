package com.assignments;

public class PersonalLoan extends Loan implements Payable {

	public PersonalLoan(int loanId, String borrowerName, int amount) {
		super(loanId, borrowerName, amount);
	}

	@Override
	public void makePayment(double amount) {
		
	}

	@Override
	double calculateEMI() {
		return 0;
	}
	

}
