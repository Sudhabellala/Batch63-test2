package com.StringHandling;

import java.util.Scanner;

public class TestStrDemo22 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		
		int[] arr=new int[127];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		int max=-1;
		char ch=' ';
		for(int i=0;i<str.length();i++) {
			if(max<arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		System.out.println("Maximum occurence is: "+ch);
		
	}
	

}
