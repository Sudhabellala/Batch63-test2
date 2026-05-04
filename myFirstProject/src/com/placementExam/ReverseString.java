package com.placementExam;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseOfString(String s) {
		String reverse="";
		
		char[] str=s.toCharArray();
		for(int i=0;i<str.length;i++) {
			reverse=str[i]+reverse;//olleh
		}
		System.out.println(reverse);
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String c=sc.nextLine();//hello
		//System.out.println("reverse Of String: "+reverseOfString(c));
		reverseOfString(c);
		sc.close();
	}
}
