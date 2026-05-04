package com.Java8Features.functions;

import java.util.function.Supplier;

public class TestFIDemo3 {

	public static void main(String[] args) {
		
		System.out.println((int)(Math.random()*10));
		
		Supplier<String> s = () -> {
			String otp = "";
			
			for(int i=1;i<=6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
	
			return otp;
		};
		System.out.println(s.get());
	}
}
