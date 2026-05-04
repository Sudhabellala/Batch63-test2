package com.StringHandling;

public class CompareToStrings {

	public static void main(String[] args) {
		String s1="Sudha";
		String s2="Sumedha";
		System.out.println(s1.compareTo(s2));
		
		String s3="Advaith";
		String s4="advaith";
		System.out.println(s3.compareToIgnoreCase(s4));
		
		String s5="Sudha";
		String s6="Sudha Rani";
		System.out.println(s5.compareTo(s6));
	}

}


