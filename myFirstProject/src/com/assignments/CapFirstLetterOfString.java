package com.assignments;

import java.util.Scanner;

public class CapFirstLetterOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String s = sc.nextLine();
		String[] str = s.split("\\s");

		for (int i = 0; i < str.length; i++) {
			// System.out.println(str[i]+" ");
			if (!Character.isUpperCase(str[i].charAt(0))) {
				char first = Character.toUpperCase(str[i].charAt(0));
				str[i] = first + str[i].substring(1);
			}
		}
		for (String word : str) {
			System.out.print(word + " ");
		}
		sc.close();
	}
}
