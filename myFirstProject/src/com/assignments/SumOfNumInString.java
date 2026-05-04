package com.assignments;

import java.util.Scanner;

public class SumOfNumInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String which contains numbers in it: ");
		String str = sc.nextLine();// abc12x3y100z

		int sum=0;
		
		String[] numbers=str.replaceAll("^0-9"," ").split("\\s");
		
		for(String num:numbers) {
			if(!num.isEmpty()) {
				sum=sum+Integer.parseInt(num);
			}
		}
		
		System.out.println("Sum Of the Numbers: "+sum);
		sc.close();
		}

}
