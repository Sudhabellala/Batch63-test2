package com.StringHandling;

import java.util.Scanner;

public class MaxLenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String s = sc.nextLine();
		String[] str = s.split("\\s");
		int count = 0;
		String maxLength = "";
//		String max="";


		for(int i=0;i<str.length;i++) {
			System.out.println(str[i] + " ");
			count++;
			for(int j=0;j<str.length;j++) {
				if(str[i].length()>str[j].length()) {
					maxLength=str[i];
				}else {
					maxLength=str[j];
				}
			}
			
		}
//		for(int i=0;i<str.length-1;i++) {
//			if(str[i].length()<str[i+1].length()) {
//				max=str[i+1];
//			}
//		}
		System.out.println(count);
		System.out.println("Longest word in the sentence: "+maxLength);
		sc.close();
	}
}