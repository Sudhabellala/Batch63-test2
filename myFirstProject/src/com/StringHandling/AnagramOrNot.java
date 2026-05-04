package com.StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter another string: ");
		String s1 = sc.nextLine();
		char[] ch1 = s.toCharArray();
		char[] ch2 = s1.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (s.length() != s1.length()) {
			System.out.println("Not Anagram");
		} else if (Arrays.equals(ch1,ch2)) {
			System.out.println("Given Strings are Anagram");
		}
		sc.close();
	}
}
