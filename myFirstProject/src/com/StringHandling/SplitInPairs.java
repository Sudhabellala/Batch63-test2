package com.StringHandling;

import java.util.Scanner;

public class SplitInPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();// hello world

		// Remove spaces
		s = s.replace(" ", "");

		String s1 = "";
		String s2 = "";

		int count = 0; // to switch between S1 and S2

		for (int i = 0; i < s.length(); i += 2) {
			String temp = "";

			// safely take 2 characters
			if (i + 1 < s.length()) {
				temp = "" + s.charAt(i) + s.charAt(i + 1);
			} else {
				temp = "" + s.charAt(i); // if only 1 char left
			}

			// even cycle → S1, odd cycle → S2
			if (count % 2 == 0) {
				s1 = s1 + temp;
			} else {
				s2 = s2 + temp;
			}

			count++;
		}

		System.out.println("S1 = " + s1);
		System.out.println("S2 = " + s2);
		sc.close();
	}
}
