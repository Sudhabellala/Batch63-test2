package com.StringHandling;

import java.util.Scanner;

public class StartingLetterOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String s = sc.nextLine();
		String[] str = s.split(" ");
	
		for(String s1:str) {
			char c = s1.charAt(0);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
				||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				System.out.println(s1);
			}
		}
		sc.close();
	}

}
