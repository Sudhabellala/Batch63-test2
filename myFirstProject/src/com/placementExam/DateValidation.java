package com.placementExam;

import java.util.Scanner;

public class DateValidation {
	public static boolean isValidDate(String date) {
		String pattern="^[0-3][0-9]-[0-1][0-9]-[0-9]{4}$";
		return date.matches(pattern);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a date: ");
		String input=sc.nextLine();
		boolean result=isValidDate(input);
		System.out.println(result);
		sc.close();
	}

}
