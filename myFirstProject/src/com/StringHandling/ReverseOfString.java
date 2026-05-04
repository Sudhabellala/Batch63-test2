package com.StringHandling;

import java.util.Scanner;

public class ReverseOfString {
	
	static String reverseString(String s1) {
		String rs="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			rs=c+rs;
		}
		return rs;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to print Reverse: ");
		
		String str=sc.nextLine();
		
		String rstr=reverseString(str);
		System.out.println("Reverse String: "+rstr);
		
		if(str.equalsIgnoreCase(rstr)) {
			System.out.println("Given String is Palindrome.");
		}
		else {
			System.out.println("Given String is not Palindrome. ");
		}
		
		sc.close();
	}
}
