package com.collectoionsframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDupInList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(5);
		numbers.add(6);
		numbers.add(6);

		Set<Integer> numbers1 = new HashSet<>();

		Iterator<Integer> itr = numbers.iterator();
		while (itr.hasNext()) {
			numbers1.add(itr.next());
		}
		System.out.println(numbers1);
	}

}
