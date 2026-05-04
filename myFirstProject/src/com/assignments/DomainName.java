package com.assignments;

import java.util.Scanner;

public class DomainName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an email: ");
		String mail=sc.nextLine();
		
		if(mail.contains("@")) {
			System.out.println("The entered mail is Valid.");
			String[] astr=mail.split("@");
			System.out.println(astr[1]);
		}
		sc.close();
	}
}
