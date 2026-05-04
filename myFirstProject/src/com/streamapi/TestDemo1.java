package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		List<String> l=new ArrayList<>();
		l.add("Virat");
		l.add("MSD");
		l.add("Rohit");
		l.add("Abhishek");
		l.add("Gill");
		l.add("Rahul");
		l.add("Hardik");
		
		List<String> l2=l.stream()
						.filter(s->s.contains("h"))
						.sorted()
						.collect(Collectors.toList());
		
//		Stream<String> s= l.stream();
//		
//		Stream<String> s2=s.filter(s1->s1.contains("h"));
//		List<String> l2=s2.collect(Collectors.toList());
		
		System.out.println(l);
		System.out.println(l2);
	}

}
