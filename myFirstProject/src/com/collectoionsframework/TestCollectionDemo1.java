package com.collectoionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo1 {

	public static void main(String[] args) {
		// Cannot instantiate the type Collection
//		Collection c=new Collection();

		Object[] n = new Object[2];
		n[0] = "Sudha";
		n[1] = 100;
		
		for(Object n1:n) {
			System.out.println(n1);
		}

//		Collection is a raw type. References to generic type Collection<E> should be parameterized
		Collection<Object> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(30);
		c1.add(20);
		c1.add(50);
		c1.add(40);
		c1.add(10);
		c1.add(20);
		c1.add("Sudha");
		c1.add("Surya");
		c1.add("Vedha");

		System.out.println(c1);

	}

}
