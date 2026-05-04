package com.tests;

import java.util.Scanner;

//import java.util.*;

public class ProcessMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your message: ");
		String message = sc.nextLine();

		// 1. Clean message
		message = message.trim().replaceAll("\\s+", " ");

		// Count number of words
		String[] words = message.split(" ");
		int wordCount = words.length;

		// Find longest and shortest word
		String longest = words[0];
		String shortest = words[0];
		for (String w : words) {
			if (w.length() > longest.length()) {
				longest = w;
			}
			if (w.length() < shortest.length()) {
				shortest = w;
			}
		}

		// Restricted words
		String[] restrictedWords = { "hack", "attack", "shutdown", "breach" };
		boolean foundRestricted = false;
		String maskedMessage = message;

		for (String restricted : restrictedWords) {
			if (maskedMessage.toLowerCase().contains(restricted)) {
				foundRestricted = true;
				maskedMessage = maskedMessage.replaceAll("(?i)" +restricted, "***");
			}
		}
 
		// Output
		System.out.println("Cleaned Message: " + message);
		System.out.println("Word Count: " + wordCount);
		System.out.println("Longest Word: " + longest);
		System.out.println("Shortest Word: " + shortest);

		System.out.println("Restricted Words Found: " + (foundRestricted ? "Yes" : "No"));
		System.out.println("Masked Message: " + maskedMessage);

		sc.close();
	}
}
