package com.StringHandling;

import java.util.Scanner;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine();
		String[] astr=str.split("\\s");
		
		for(int i=0;i<astr.length;i++) {
			String word=astr[i];
			String rev="";
			for(int j=0;j<word.length();j++) {
				rev=word.charAt(j)+rev;
			}
			System.out.print(rev+" ");
			sc.close();
		}
		//System.out.println(rev);
	}

}
