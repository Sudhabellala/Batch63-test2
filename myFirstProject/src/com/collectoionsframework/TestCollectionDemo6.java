package com.collectoionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo6 {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Apple");

		// Converting collections to Array
		Object[] objs = fruits.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
		
		System.out.println("*********************");
		Collection<String> veggies = new ArrayList<>();
		veggies.add("Tomato");
		veggies.add("Brinjal");
		veggies.add("Potato");
		veggies.add("Banana");

		System.out.println(fruits.size());
		fruits.retainAll(veggies);
		System.out.println(fruits.retainAll(veggies));
		System.out.println(fruits);
		System.out.println(fruits.size());
	}

}
