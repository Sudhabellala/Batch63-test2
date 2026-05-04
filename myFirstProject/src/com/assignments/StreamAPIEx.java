package com.assignments;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Stream;

public class StreamAPIEx {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Apple");
		l.add("Banana");
		l.add("Orange");
		l.add("Grape");
		
		char searchChar='A';

		List<String> upperCaseStrings = l.stream().map(String::toUpperCase).toList();
		
		 long count = upperCaseStrings.stream()
	                .filter(s -> s.indexOf(searchChar) != -1)
	                .count();
		 
		 System.out.println("UpperCase strings: "+upperCaseStrings);
		 System.out.println("Number of strings containing 'A': "+count);
	}

}
