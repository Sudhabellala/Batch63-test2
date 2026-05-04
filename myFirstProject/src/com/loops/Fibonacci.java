package com.loops;

import java.util.Scanner;

//WAP to print Fibonacci series for first 10 numbers?
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print series: ");
		int num=sc.nextInt();
		
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.print(n1+" "+n2+" ");
		for(int i=1;i<=num;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		sc.close();
	}
}
