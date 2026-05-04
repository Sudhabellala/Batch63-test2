package com.inheritance;

public class PersonalLoan extends Loan {

	void getPersonalLoanInfo() {
		System.out.println("Personal loan documents have been submitted successfully! ");

	}

	private String hello() {
		return "Good Afternoon";
	}

	@Override
	double getLoanROI() {
		return 8.5;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Personal Loan Banking!! ");
		Loan l2 = new PersonalLoan();
		System.out.println("Personal Loan ROI: " + l2.getLoanROI());

		PersonalLoan pl = new PersonalLoan();
		System.out.println(pl.hello());
		double empSalary = pl.getEmpSal();
		double empCibil = pl.getEmpCibilScore();
		double empAge = pl.getEmpAge();

		if (empSalary >= 800000.00 && empCibil >= 750 && empAge >= 22) {
			System.out.println("Your loan got Approved!");
			System.out.println("Your loan ROI is: " + pl.getLoanROI());
			System.out.println("Verify your address details as mentioned by you. ");
			System.out.println("Address info: ");
			System.out.println(pl.getEmpAddressDetails());
			pl.getPersonalLoanDocInfo();
		} else {
			System.out.println("Your loan application got regected");
		}
	}
}
