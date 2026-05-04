package com.GUT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsByLengthStreams {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "is", "awesome", "spring");
		List<String> sorted = words.stream()
									.sorted(Comparator.comparingInt(String::length))
									.toList();

		System.out.println(sorted);
	}

}
