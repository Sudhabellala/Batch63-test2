package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("Enter b number: ");
		int b=sc.nextInt();
		
		if(b !=0) {
			System.out.println(a/b);
		}else {
			//System.err.println("b is Zero ");
			throw new ArithmeticException("Don't enter Zeros");
		}
	}

}
