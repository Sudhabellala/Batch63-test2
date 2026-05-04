package com.assignments;

import java.util.Scanner;

public class PairOfNumPrime {
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for (int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number upto you want series: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=n;j++) {
				int x=i+j;
				if(isPrime(x)) {
					System.out.println("num1: "+i+" num2: "+j);
				}
			}
			
		}
		sc.close();
	}

}
