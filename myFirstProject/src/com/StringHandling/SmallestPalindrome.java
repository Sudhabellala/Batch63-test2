package com.StringHandling;

import java.util.Scanner;

public class SmallestPalindrome {

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		// String str = "abacdfgdcaba";
		String smallest = null;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 2; j <= str.length(); j++) { // j starts from i+2 → ensures length ≥ 2
				String sub = str.substring(i, j);

				if (isPalindrome(sub)) {
					if (smallest == null || sub.length() < smallest.length()) {
						smallest = sub;
					}
				}
			}
		}

		System.out.println("Smallest palindrome: " + smallest); //len>=2
		sc.close();
	}
}
