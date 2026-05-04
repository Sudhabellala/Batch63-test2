package com.streamapi;

import java.util.stream.IntStream;

public class PrimeOrNot {

	public static void main(String[] args) {
		int start = 1;
		int end = 50;

		IntStream.rangeClosed(start, end).filter(num -> num > 1)
				.filter(num -> IntStream.range(2, num).allMatch(i -> num % i != 0)).forEach(System.out::println);
	}
}
