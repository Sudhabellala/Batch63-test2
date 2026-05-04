package com.loops;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		fact=findFact(n);
		System.out.println("Fcatorial of a given number: "+fact);
		sc.close();
		
	}
	
	static int findFact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*findFact(n-1);
	}
	
}
