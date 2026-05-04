package com.GUT;

import java.util.Scanner;

public class ValidatePassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fname=sc.nextLine();
		System.out.println("Enter Your Last Name: ");
		String lname=sc.nextLine();
		System.out.println("Enter your password: ");
		String password=sc.nextLine();
		
		String regix="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{8,20}$";
		if(password.matches(regix)) {
			System.out.println("Valid Password");
		}else {
			System.out.println("Not a valid password");
		}	
	}
}
