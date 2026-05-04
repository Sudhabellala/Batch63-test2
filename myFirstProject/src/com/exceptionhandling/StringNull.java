package com.exceptionhandling;

public class StringNull {

	public static void main(String[] args) {
		System.out.println("main method started! ");
		String s="Srikanth";
		System.out.println(s.length());
		
		String s1="null";
		String s2=null;
		
		try {
			System.out.println(s1.equals(s2));
			System.out.println(s1.length());
			System.out.println(s2.length());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(s2.equals(s1));
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
			
		}
		System.out.println("main method ended! ");
		System.out.println("main method ended! ");
		System.out.println("main method ended! ");
	}

}
