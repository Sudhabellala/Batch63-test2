package com.GUT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Map<Character,Integer> m=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine(); //banana
		
		char[] c=s.toCharArray();
		for(char a:c) {
			if(m.containsKey(a)) {
				m.put(a,m.get(a)+1);
			}else {
				m.put(a,1);
			}
		}
		System.out.println(m);
		sc.close();
	}

}
