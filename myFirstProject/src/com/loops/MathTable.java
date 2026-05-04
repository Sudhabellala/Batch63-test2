package com.loops;

import java.util.Scanner;

//WAP to print Math Table.
//input is 5 and 20
//5*10=50
public class MathTable {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print math table: ");
		int n=sc.nextInt();
		System.out.println("Enter a number upto where you want to print: ");
		int x=sc.nextInt();

		
		for(int i=1;i<=x;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		sc.close();
	}

}
