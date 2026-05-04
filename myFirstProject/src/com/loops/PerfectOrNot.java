package com.loops;

import java.util.Scanner;

//WAP to print the goiven number is Pefect or not?
public class PerfectOrNot {
	static boolean isPerfect(int n) {
		boolean status=false;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			status=true;
		}
				
		return status;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		sc.close();
		
		boolean status=isPerfect(num);
		
		if(status) {
			System.out.println("The given number is Perfect ");
		}else {
			System.out.println("The given number is not perfect ");
		}


	}

}
