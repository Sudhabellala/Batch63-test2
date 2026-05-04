package com.streamapi;

import java.util.List;

public class TestJ8Demo12 {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
		
//		numbers.stream().forEach(n->System.out.println(n+"-"+Thread.currentThread().getName()));
		
		numbers.parallelStream().forEach(n->System.out.println(n+"-"+Thread.currentThread().getName()));

		
	}

}
