package com.StringHandling;

import java.util.Scanner;

public class NoOfStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String s = sc.nextLine();
		String[] str = s.split("\\s");
		int count = 0;

		for (String st : str) {
			System.out.println(st + " ");
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}
