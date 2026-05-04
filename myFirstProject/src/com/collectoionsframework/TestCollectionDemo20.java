package com.collectoionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionDemo20 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(8);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(15);
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}

}
