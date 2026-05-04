package com.collectoionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo13 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);

		System.out.println(l);

		List<Integer> l1 = l.subList(0, 4);
		System.out.println(l1);

	}

}
