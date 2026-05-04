package com.Java8Features.functions;

import java.util.function.BiPredicate;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;


public class TestBiDemo1 {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bp = (i1, i2) -> i1 * i2 % 2 == 0;	
		System.out.println(bp.test(10, 5));
		
		BiFunction<String, String, Integer> bfun=(s1,s2)->s1.concat(s2).length();
		System.out.println(bfun.apply("Srikanth", "java"));
		
		BiFunction<String, String, String> bfun1=(s1,s2)->s1.concat(s2).toUpperCase();
		System.out.println(bfun1.apply("Srikanth", "java"));
		
		BiConsumer<String,String> bc=(s1,s2)->{
			System.out.println(s1.concat(s2));
			System.out.println(s1.toLowerCase());
			System.out.println(s1.toUpperCase());
		};
		bc.accept("Srikanth", "Java");
	}

}
