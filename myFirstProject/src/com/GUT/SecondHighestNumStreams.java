package com.GUT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumStreams {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
		Integer secondHighNum= nums.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
		System.out.println(secondHighNum);
	}
}

