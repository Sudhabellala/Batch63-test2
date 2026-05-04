package com.collectoionsframework;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListDemo12 {

	public static void main(String[] args) {
		System.out.println("Main metod started");
		List<String> items = new ArrayList<>();
		items.add("Kohli");
		items.add("Rohit");
		items.add("Rahul");
		items.add("Gaikward");
		items.add("Dhoni");
		items.set(1, "Sharma");
		items.add(2, "Virat");
		items.remove("Dhoni");

		System.out.println(items);

/*		System.out.println("**********************");
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i));
		}

		System.out.println("***********************");
		for (String name : items) {
			System.out.println(name);
		}
*/

//		System.out.println("***********************");
//		//using iterator
//		Iterator<String> itr = items.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println("************************");
		//using ListIterator
		ListIterator<String> litr=items.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("************************");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		System.out.println("Main metod Ended");
	
	}

}
