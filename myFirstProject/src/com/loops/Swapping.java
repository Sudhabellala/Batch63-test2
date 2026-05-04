package com.loops;

public class Swapping {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A value: "+a);
		System.out.println("B value: "+b);
		
		int x=10;
		int y=20;
		int temp=0;
		
		temp=x;
		x=y;
		y=temp;
		
		
		System.out.println("X value: "+x);
		System.out.println("y value: "+y);
	}
	

}
