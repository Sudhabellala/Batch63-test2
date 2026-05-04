package com.StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAlphaNumeric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();// A1B16FDC5R99
		String s1 = "";
		String s2 = "";
		char[] str = s.toCharArray();
		Arrays.sort(str);
		//System.out.println(str);

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(str[i])) {
				s1 += str[i];
			} else {
				s2 += str[i];
			}
		}
		System.out.println(s2 + s1);
		sc.close();
	}

}
