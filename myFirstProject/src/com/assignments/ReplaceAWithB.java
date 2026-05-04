package com.assignments;

import java.util.Scanner;

public class ReplaceAWithB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
//		String[] str=s.split("\\s");
//		
//		for(int i=0;i<str.length;i++) {
//			if()
//		}
		s = s.replaceAll("a", "b");
		System.out.println(s);
		sc.close();
	}

}
