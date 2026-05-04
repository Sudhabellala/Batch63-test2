package com.GUT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxStream {

	public static void main(String[] args) {
		List<Integer> l= Arrays.asList(10,18,9,6,7,19,26);
	
		Integer firstMin=l.stream().distinct().sorted().findFirst().get();
		System.out.println("firstMin: "+firstMin);
		
		Integer secMin= l.stream().distinct().sorted().skip(1).findFirst().get();
		System.out.println("secMin: "+secMin);
		
		Integer firstMax= l.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println("firstMax: "+firstMax);
		
		Integer secMax= l.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("secMax: "+secMax);
		
	}
}
