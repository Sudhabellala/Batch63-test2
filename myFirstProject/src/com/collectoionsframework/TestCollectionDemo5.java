package com.collectoionsframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo5 {

	public static void main(String[] args) {
		Collection<String> cricketers = new ArrayList<>();
		cricketers.add("Rohit");
		cricketers.add("virat");
		cricketers.add("K L Rahul");
		cricketers.add("Siraj");
		cricketers.add("Bumrah");
		cricketers.add("Jadeja");

//		System.out.println(cricketers);
		cricketers.remove("Siraj");
		Iterator<String> itr=cricketers.iterator();
		
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			if(itr.next().equals("Jadeja")) {
				itr.remove();
			}
		
		}
		System.out.println(cricketers);
		
//		System.out.println("******************");
//		for(String cricketer:cricketers) {
//			System.out.println(cricketer);
//		}
	
	}

}
