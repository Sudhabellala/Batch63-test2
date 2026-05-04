package com.tests;

import java.util.Scanner;

public class CharAndNum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string which contains both Characters and numbers: ");
		String str = sc.nextLine();

		int sum = 0;
		String new_string = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
//				sum = sum + Integer.ParseInt(str.charAt(i));
				sum = sum + Character.getNumericValue(str.charAt(i));

			} else {
				new_string = new_string + str.charAt(i);

			}
		}
		String s = new_string + sum;
		System.out.println(s);
		sc.close();
	}

}
