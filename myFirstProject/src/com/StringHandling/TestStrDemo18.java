package com.StringHandling;

public class TestStrDemo18 {

	public static void main(String[] args) {
		System.out.println("main method strted!");
		String str=String.join("-","java","is","simple");
		System.out.println(str);
		
		String[] arrStr=str.split("-");
		int count=0;
		
		for(String s:arrStr) {
			System.out.println(s);
			count++;
		}
		System.out.println("Count: "+count);
	}

}
