package com.Abstraction;

public class TestDemoAbs1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		TestIn1 a=new TestsA();
		a.method5();
		a.method6();
		a.method7();
		a.method8();
		a.method9();
		
		System.out.println("***************");
		TestAbs b=new TestsB();
		b.method5();
		b.method6();
		b.method7();
		b.method8();
		b.method9();
		
		System.out.println("***************");
		TestAbs c=new TestsB();
		c.method5();
		c.method6();
		c.method7();
		c.method8();
		c.method9();
		c.method10();
		
	
	}

}
