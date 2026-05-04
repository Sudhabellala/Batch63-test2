package com.basic;

public class Demo {
	static int x=20;
	static int y=10;
	
	void sum() {
		int a=x+y;
		System.out.println("Sum: "+a);	
	}
	void sub() {
		int s=x-y;
		System.out.println("Subtraction: "+s);
	}
	static void mul() {
		int m=x*y;
		System.out.println("Multiplication: "+m);
	}
	static void div() {
		int d=x/y;
		System.out.println("Division: "+d);
		
	}
	static {
		Demo d=new Demo();
		d.sum();
		d.sub();
		mul();
		div();
	}
	
	public static void main(String[] args) {
		
	}

}
