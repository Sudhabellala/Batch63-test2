package com.collectionsframework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Java", "Spring", "Hibernate"));
//		will give error if we write the statement as
//		List<String> list =Arrays.asList("Java", "Spring", "Hibernate");
//		Arrays.asList() does NOT return a normal ArrayList
//		It returns a fixed-size List backed by an array.
//		What does “backed by array” mean?
//		The list is directly connected to the array
//		Size is fixed
//		You can:
//			Read elements
//			Update elements (set)
//		You cannot:
//			Add elements
//			Remove elements
		System.out.println(list);
		list.add("Microservices");
		System.out.println(list);
	}
}
