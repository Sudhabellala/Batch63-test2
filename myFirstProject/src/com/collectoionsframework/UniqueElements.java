package com.collectoionsframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);

		List<Integer> s1 = new ArrayList<>();
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);

		Set<Integer> u = new HashSet<>();
		u.addAll(s);
		u.addAll(s1);

		System.out.println(u);

	}

}
