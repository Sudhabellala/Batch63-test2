package com.GUT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharOfEachWord {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "spring");
		
		List<Character> characters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());

        System.out.println(characters);
				
	}

}
