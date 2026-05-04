package com.collectionsframework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLettersHashMap {

	public static void main(String[] args) {
		Map<Character,Integer> m=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		char[] ach=s.toCharArray();
		
		
		for(Character ch:ach) {
			if(m.containsKey(ch)) {
				m.put(ch, m.get(ch)+1);
			}
			else {
				m.put(ch, 1);
			}
		}
		System.out.println(m);
		sc.close();
	}

}
