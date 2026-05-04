package com.GUT;

import java.util.Arrays;
import java.util.List;

public class SumOfLengthOfEachWord {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "spring", "boot");
		int totalChars=words.stream().mapToInt(String::length).sum();
		System.out.println(totalChars);
	}

}
