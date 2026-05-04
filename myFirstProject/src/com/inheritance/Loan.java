package com.inheritance;

import java.util.Scanner;

public class Loan {
	Scanner sc = new Scanner(System.in);

	void getPersonalLoanDocInfo() {
		System.out.println("Successfully all documents have been submitted! ");

	}

	String getEmpAddressDetails() {
		String address = "";
		System.out.println("Enter your flat number: ");
		String flat = sc.next();

		System.out.println("Enter your Plot Details: ");
		String plot = sc.next();

		System.out.println("Enter your Street ");
		String street = sc.next();

		System.out.println("Enter your City: ");
		String city = sc.next();

		System.out.println("Enter your Pincode: ");
		long pin = sc.nextLong();

		address = "Flat No: " + flat + ", " + "Plot Details: " + plot + ", " + "City: " + city + ", " + "Street Name: "
				+ street + ", " + "Pincode: " + pin;

		return address;
	}

	@SuppressWarnings("unused")
	private String hello() {
		return "Good Morning";
	}

	double getLoanROI() {
		return 9.5;
	}

	public int getEmpCibilScore() {
		System.out.println("Enter your Cibil Score: ");
		int cibil = sc.nextInt();
		return cibil;
	}

	public int getEmpAge() {
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		return age;
	}

	public double getEmpSal() {
		System.out.println("Enter your salary Info: ");
		double salary = sc.nextDouble();
		return salary;
	}
}
