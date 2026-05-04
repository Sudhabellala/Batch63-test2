package com.placementExam;

import java.util.Scanner;

public class PowerOfNumber {
	
	public static int multiply(int a,int b) {
		int result=0;
		for(int i=0;i<b;i++) {
			result+=a;
		}
		return result;
	}
	
	public static int power(int base,int exp) {
		int result=1;
		for(int i=0;i<exp;i++) {
			result=multiply(result,base);
			
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("Enter Another number: ");
		int m=sc.nextInt();
//		power(n,m);
		System.out.println(power(n,m));
		
//		int power=0;
//		for(int i=0;i<m;i++) {
//			power+=n;
//		}
//		System.out.println(power);
		sc.close();
	}

}
