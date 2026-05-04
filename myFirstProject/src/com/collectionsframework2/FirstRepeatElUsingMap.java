package com.collectionsframework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeatElUsingMap {

	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();// Programmer
		char[] ach = str.toCharArray();
		int count = 1;
		char repeat = 0;

		for (Character ch : ach) {
			if (m.containsKey(ch)) {
				count++;
				m.put(ch, m.get(ch) + 1);
				if (count == 2) {
					repeat = ch;
					break;
				}

			} else {
				m.put(ch, 1);
			}
		}
		System.out.println(repeat);
		sc.close();
	}

}
