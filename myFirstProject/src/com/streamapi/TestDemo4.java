package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		List<String> sentences=Arrays.asList("hello world", "java stream flatmap");
		List<String> words=sentences.stream()
				.flatMap(sentence->Arrays.stream(sentence.split(" ")))
				.collect(Collectors.toList());
		System.out.println(words);
		System.out.println("**********************");
		
		List<List<String>> nestedList=Arrays.asList(Arrays.asList("a","b"), Arrays.asList("c","d"), Arrays.asList("e"));
		List<String> flatList=nestedList.stream()
										.flatMap(List::stream)
										.collect(Collectors.toList());
		System.out.println(flatList);
		
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		int s=numbers.stream()
				.filter(n->n%2==0)
				.map(n->n*n)
				.reduce(0, Integer::sum);
		System.out.println(s);
		
		List<String> l=Arrays.asList("abhishek", "abhishek", "abhishek", "sanju", "sky", "sky", "sky", "Hardik");
		List<String> l1=l.stream()
						.distinct()
						.map(String::toUpperCase)
						.sorted()
						.limit(2)
						.collect(Collectors.toList());
		System.out.println(l1);
		
		long count=l1.stream().count();
		System.out.println("Count: "+count);
	}

}
