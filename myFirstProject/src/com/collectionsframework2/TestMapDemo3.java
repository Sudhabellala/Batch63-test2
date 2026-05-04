package com.collectionsframework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMapDemo3 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println(map);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		String[] ach=str.split("\\s");


		//char[] ach = str.toCharArray();

		for (String ch : ach) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
//		Set<Entry<Character,Integer>> entries=map.entrySet();
//		for(Entry<Character,Integer> entry:entries) {
//			System.out.println(entry.getKey()+"-->"+entry.getValue());
//		}
		System.out.println(map);
		sc.close();
	}

}
