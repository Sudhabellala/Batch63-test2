package com.StringHandling;

import java.util.Scanner;

public class ReverseOrderWordOfSentence {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sntence: ");
		String s=sc.nextLine();//i love Vcube
		String[] str=s.split("\\s");
		
		
//		for(int i=0;i<str.length;i++) {
//			System.out.println(str[i]);
//		}
		
		for(int i=0;i<str.length;i++) {
			StringBuffer sb=new StringBuffer(str[i]);
			
			
			
			sb.reverse();
			
			System.out.println(sb);
		}
		
		
	}

}
