package com.Java8Features.functions;

import java.util.Date;
import java.util.function.Supplier;

public class TestSupplierDemo1 {

	public static void main(String[] args) {
		
		Supplier<Date> s1=()-> new Date();
		System.out.println(s1.get());
		
		Supplier<Integer> s2=()->{
			int sum=10+20;
			return sum;
		};
		
		System.out.println(s2.get());
	}

}
