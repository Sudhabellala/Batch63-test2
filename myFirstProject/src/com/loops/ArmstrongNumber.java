package com.loops;

import java.util.Scanner;

public class ArmstrongNumber {
	static boolean isArmstrong(int num) {
		int mul=0;
		int r=0;
		int count=0;
		
		
		while(num!=0) {
			r=num%10;
			num=num/10;
			count++;
			
			//mul=mul+(r*count);
		}
		mul=mul+(r*count);
		System.out.println(mul);
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		isArmstrong(num);
	}
}
		