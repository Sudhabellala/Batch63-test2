package com.StringHandling;

import java.util.Scanner;

public class WithoutSplitCountWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();// java is simple
		sc.close();
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;
			}
		}
		System.out.println("no.of words: " + (count+1));

	}

}
