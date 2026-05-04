package com.StringHandling;

import java.util.Scanner;

public class AlternateTwoCharInOneString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		s = s.replaceAll("\\s", "");// hello world

		String s1 = "";
		String s2 = "";
		int l = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				int k = 0;
				while (k < 2 && l < s.length()) {
					s1 += s.charAt(l);
					k++;
					l++;
				}
			} else {
				int j = 0;
				while (j < 2 && l < s.length()) {
					s2 += s.charAt(l);
					j++;
					l++;
				}

			}
		}
		System.out.println(s1);
		System.out.println(s2);
		
		sc.close();
	}

}
