package com.loops;

import java.util.Scanner;

public class ReverseNumber {
	static int findReverseNumber(int n) {
		int rev=0;
		int r=0;
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			
			rev=rev*10+r;
		}
		
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int reverseNumber=findReverseNumber(num);
		
		System.out.println("Reverse number of a given number: "+reverseNumber);
		
		if(num==reverseNumber) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not a Palindrome");
		}
		
		sc.close();
	}

}
