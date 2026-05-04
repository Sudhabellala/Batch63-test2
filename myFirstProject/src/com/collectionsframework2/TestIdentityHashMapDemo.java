package com.collectionsframework2;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TestIdentityHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		String s1 = "Java";
		String s2 = "Java";
		map.put(s1, "James");
		map.put(s2, "Srikanth");

		System.out.println(map);

		Map<String, String> map1 = new IdentityHashMap<>();

		String s3 = new String("Java");
		String s4 = new String("Java");
		map1.put(s3, "James");
		map1.put(s4, "Srikanth");

		System.out.println(map1);
	}

}
