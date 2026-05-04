package com.inheritance;

public class HomeLoan extends Loan {
	void getHomeLoanInfo() {
		System.out.println("Home loan documents have been submitted successfully! ");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Home Loan Banking!! ");

		HomeLoan pl = new HomeLoan();
		double empSalary = pl.getEmpSal();
		double empCibil = pl.getEmpCibilScore();
		double empAge = pl.getEmpAge();

		if (empSalary >= 800000.00 && empCibil >= 750 && empAge >= 22) {
			System.out.println("Your loan got Approved!");
			System.out.println("Your loan ROI is: " + pl.getLoanROI());
			System.out.println("Verify your address details as mentioned by you. ");
			System.out.println("Address info: ");
			System.out.println(pl.getEmpAddressDetails());
			pl.getHomeLoanInfo();

		} else {
			System.out.println("Your loan application got rejected");
		}
	}
}
