package com.assignments;

abstract class Loan {
	private int loanId;
	private String borrowerName;
	private int amount;
	
	public Loan(int loanId, String borrowerName, int amount) {
		super();
		this.loanId = loanId;
		this.borrowerName = borrowerName;
		this.amount = amount;
	}
	void setLoanId(int loanId) {
		this.loanId=loanId;
	}
	int getLoanId() {
		return loanId;
	}
	
	void setBrrowerName(String borrowerName) {
		this.borrowerName=borrowerName;
	}
	String getBrrowerName() {
		return borrowerName;
	}
	
	void setAmount(int amount) {
		this.amount=amount;
	}
	int getAmount() {
		return amount;
	}
	
	abstract double calculateEMI();
	
	public void showLoanDetails() {
		System.out.println("loanId: "+loanId);
		System.out.println("borrowerName: "+borrowerName);
		System.out.println("amount: "+amount);
	}	
}
