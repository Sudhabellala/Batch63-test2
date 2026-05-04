package com.exceptionhandling;

class A{
	void method1() {
		System.out.println("method1 called");
	}
}

class B extends A{
	void method2() {
		System.out.println("method2 called");
		
	}
}
public class ClassCast {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		B b=new B();
		b.method1();
		b.method2();
		
		A a=new B();
		a.method1();
		
		B b1=(B) new A();
		b1.method1();
		b1.method2();
	}

}
