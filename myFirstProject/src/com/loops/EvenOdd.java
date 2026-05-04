package com.loops;

public class EvenOdd {
//WAP to print even niumbers 0 to 100
//and odd numbers 100 to 0.
	public static void main(String[] args) {
		System.out.println("Even Numbers");
		for(long i=0;i<=100;i++) {
			if(i%2==0 && i!=0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("Odd Numbers");
		for(long i=100;i>=0;i--) {
			if(i%2==1 && i!=0) {
				System.out.print(i+" ");
			}
		}
	}

}
