package com.StringHandling;

import java.util.Scanner;

public class TestStrDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		int vowelsCount = 0;
		int consonantsCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.toLowerCase().charAt(i);

			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U')
					;
				vowelsCount++;
			} else {
				consonantsCount++;
			}
		}
		System.out.println("Consonants Count: " + consonantsCount + " \nVowels count: " + vowelsCount);
	}

}
