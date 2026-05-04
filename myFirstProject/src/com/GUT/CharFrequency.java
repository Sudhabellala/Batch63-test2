package com.GUT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		Map<Character, Long> m = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine(); // JavaStream
		String s=str.toLowerCase();
		char[] ch = s.toCharArray();

	
		for (Character c : ch) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, (long) 1);
			}
		}
		sc.close();
		System.out.println(m);
	}

}
