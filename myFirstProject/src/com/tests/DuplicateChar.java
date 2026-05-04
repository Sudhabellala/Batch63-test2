package com.tests;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		Set<Character> s = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		//char[] astr = str.toCharArray();
		System.out.println("Duplicate Characters: ");
		for (int i = 0; i < str.length(); i++) {
			if (!s.add(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
		sc.close();
	}

}
