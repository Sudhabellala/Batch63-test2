package com.assignments;

import java.util.Scanner;

public class RemoveNumbersInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();

		if (s.matches(".*\\d*.")) {
			s = s.replaceAll("\\d", "");
			System.out.println(s);
		}
		sc.close();
	}

}
