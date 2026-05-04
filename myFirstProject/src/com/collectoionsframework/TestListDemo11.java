package com.collectoionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo11 {

	public static void main(String[] args) {
		List<Integer> items1=new ArrayList<>();
		items1.add(10);
		items1.add(20);
		items1.add(30);
		items1.add(40);
		
	
		items1.remove(items1.indexOf(30));
		System.out.println(items1);
		items1.get(2);
		
		
		List<String> items=new ArrayList<>();
		
		items.add("Kohli");
		items.add("Rohit");
		items.add("Rahul");
		items.add("Gaikward");
		items.add("Dhoni");
		
		items.set(1,"Sharma");
		items.add(2,"Virat");
		
		items.remove("Dhoni");
		
		System.out.println(items);
	}

}
