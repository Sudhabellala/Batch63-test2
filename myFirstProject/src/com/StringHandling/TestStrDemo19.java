package com.StringHandling;

public class TestStrDemo19 {

	public static void main(String[] args) {
		String s="Java is Simple and flexible 123";
		System.out.println(s.replace('a','A'));
		System.out.println(s.replace("le","Leeee"));
		System.out.println(s.replaceAll("\\d","a"));
		
		String s1="        Hello    Good      Morning       ";
		System.out.println(s1.trim());
		System.out.println(s1.replaceAll("\\s",""));
	}

}
