package com.collectoionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo10 {

	public static void main(String[] args) {
		List<String> items=new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add(1,"X");
		items.set(2,"Y");
		items.remove(3);
		System.out.println(items.indexOf("Y"));
		
		System.out.println(items);
		
	}

}
