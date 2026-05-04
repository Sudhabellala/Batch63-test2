package com.StringHandling;

public class CodePoint {

	public static void main(String[] args) {
		String s1="Good Morning";
		System.out.println(s1.codePointAt(3));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.codePointBefore(3));
		System.out.println(s1.codePointCount(0,3));
	}

}
