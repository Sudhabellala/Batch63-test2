package com.collectionsframework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedElUsingSet {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
//		List<Integer> l=new ArrayList<>();
//		l.add(2);
//		l.add(4);
//		l.add(5);
//		l.add(3);
//		l.add(2);
//		l.add(4);
//		l.add(5);
		List<Integer> l=new ArrayList<>(Arrays.asList(2,4,5,3,2,4,5));
		
		for(Integer li:l) {
			if(!s.add(li)) {
				System.out.println(li);
			}
		}
	}

}
