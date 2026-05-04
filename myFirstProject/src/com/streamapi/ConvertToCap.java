package com.streamapi;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class ConvertToCap {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Java is simple");

		List<String> l2 = l.stream().map(String::toUpperCase).toList();
//		List<String> l2=l.stream().map(s->s.toUpperCase()).toList();
//		List<String> l2=l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());

		System.out.println(l2);
	}

}
