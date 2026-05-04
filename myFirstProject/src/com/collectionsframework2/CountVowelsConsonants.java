package com.collectionsframework2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();// sudha
		char[] ach = str.toCharArray();

		int vowelCount = 0;
		int consonantCount = 0;

		for (char ch : ach) {
			if (Character.isLetter(ch)) {
				if (vowels.contains(ch)) {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}
		System.out.println("Vowel Count: " + vowelCount);
		System.out.println("Consonants Count: " + consonantCount);

		sc.close();
	}

}
