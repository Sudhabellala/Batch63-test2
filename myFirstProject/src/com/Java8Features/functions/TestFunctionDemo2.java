package com.Java8Features.functions;

import java.util.function.Function;

public class TestFunctionDemo2 {

	public static void main(String[] args) {
		Function<Integer,Integer> f1=(i)->i*i;
		System.out.println(f1.apply(10));
		
		Function<String,Integer> f2=(s)->s.length();
		System.out.println(f2.apply("Sudha"));
		
		Function<String,String> f3=(s) -> s.substring(2);
		System.out.println(f3.apply("VasudhaRani"));
	}

}
