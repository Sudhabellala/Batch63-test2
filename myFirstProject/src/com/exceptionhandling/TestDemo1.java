package com.exceptionhandling;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter b number: ");
		int b=sc.nextInt();
		
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println("Don't enter Zeroes to proceed ");
			e.printStackTrace();
		}
		
		System.out.println("Hello guys, welcome to exception Handling !");
		System.out.println("Main method ended");
		sc.close();
	}
}
