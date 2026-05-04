package com.StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class ReorderStringSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();// am2 I1 to4 going3 town6 home5
		String[] str = s.split("\\s");
		Arrays.sort(str);

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		sc.close();
	}

}
