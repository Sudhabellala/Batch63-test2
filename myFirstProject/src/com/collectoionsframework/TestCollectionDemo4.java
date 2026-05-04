package com.collectoionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo4 {

	public static void main(String[] args) {
		
		Collection<Integer> c=new ArrayList<>();
		c.add(10);
		
		if(c.isEmpty()) {
			c.add(101);
			c.add(102);
		}
		System.out.println(c);
		
		Collection<Integer> c1=new ArrayList<>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		System.out.println(c1.hashCode());
		
		Collection<Integer> c2=new ArrayList<>();
		c2.add(10);
		c2.add(20);
		c2.add(30);
		System.out.println(c2.hashCode());
		
		//System.out.println(c1);
		System.out.println(c1.equals(c2));
	}

}
