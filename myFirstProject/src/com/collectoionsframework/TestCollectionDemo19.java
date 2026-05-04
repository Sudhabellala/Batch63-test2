package com.collectoionsframework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestCollectionDemo19 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> ns=new TreeSet<>();
		ns.add(300);
		ns.add(200);
		ns.add(100);
		ns.add(400);
		ns.add(700);
		ns.add(500);
		ns.add(200);
		ns.add(800);
		
		System.out.println(ns.ceiling(300));//300
		System.out.println(ns.floor(200));//200
		System.out.println(ns.higher(500));//700
		System.out.println(ns.lower(300));//200
		System.out.println(ns.first());
		System.out.println(ns.last());
		System.out.println(ns.subSet(100,400));
		System.out.println(ns.headSet(400));
		System.out.println(ns.tailSet(400));
		System.out.println(ns);
		
	}

}
