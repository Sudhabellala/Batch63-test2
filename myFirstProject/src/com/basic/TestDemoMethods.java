package com.basic;

public class TestDemoMethods {
	int a=20;
	int b=10;
	
	void sub(int a,int b) {
		int s=a-b;
		System.out.println("Subtraction: "+s);
		mul(s,30);
		
	}

	void mul(int s,int c) {
		int m=s*c;
		System.out.println("Multiplication: "+m);
		add(m,40);
		
	}
	
	void add(int m,int d) {
		int x=m+d;
		System.out.println("Addition: "+x);
		div(x,50);
		
		
	}
	
	void div(int x,int e) {
		int y=x/e;
		System.out.println("Division: "+y);
		
	}
	
	public static void main(String[] args) {
		
		TestDemoMethods t=new TestDemoMethods();
		t.sub(20,10);

		
	}

}
