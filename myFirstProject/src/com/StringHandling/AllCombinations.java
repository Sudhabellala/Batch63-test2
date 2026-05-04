package com.StringHandling;

import java.util.Scanner;

public class AllCombinations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		int n = str.length();

		System.out.println("All combinations:");

		// Total combinations = 2^n
		int total = 1 << n; // same as 2^n

		// Start from 1 to skip empty combination
		for (int i = 1; i < total; i++) {
			String combo = "";

			for (int j = 0; j < n; j++) {
				// Check if j-th bit is set
				if ((i & (1 << j)) != 0) {
					combo += str.charAt(j);
				}
			}

			System.out.println(combo);
		}
		sc.close();
	}
}
