package com.exceptionhandling;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("in try!");
			int a=10/5;
			
			String s="Srikanth";
			System.out.println(s.charAt(a));
		}catch(ArithmeticException ae) {
			System.out.println("in catch of AE");
			System.out.println(ae.getMessage());
		}catch(NullPointerException ae) {
			System.out.println("in catch of NE");
		}catch(Exception ae) {
			System.out.println("in catch of E");
		}
		System.out.println("main method ended");
	}

}
