package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDemo2 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(18, 45, 4, 9, 10, 7, 33, 35);

		List<Integer> l1=l.stream()
						.filter(i -> i % 2 == 0)
						.sorted()
						.collect(Collectors.toList());
		
		l1.forEach(i->System.out.print(i+" "));
	}
}
