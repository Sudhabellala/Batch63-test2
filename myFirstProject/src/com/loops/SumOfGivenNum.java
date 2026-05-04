package com.loops;

import java.util.Scanner;

public class SumOfGivenNum {
	
	static int findDigitSum(int n) {
		int sum=0;
		int r=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int sumOfDigits=findDigitSum(num);
		System.out.println("Sum of all the digits from a given number is :"+sumOfDigits);
		
		sc.close();
	}

}
