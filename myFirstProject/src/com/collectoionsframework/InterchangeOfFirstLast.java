package com.collectoionsframework;

//import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class InterchangeOfFirstLast {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
	
		System.out.println(l);
		
		Integer o1=l.getFirst();
		Integer o2=l.getLast();
		l.set(0, o2);
		l.set(l.size()-1, o1);
		
		System.out.println("After Swapping the First Element with Last Element: "+l);	
	}

}
