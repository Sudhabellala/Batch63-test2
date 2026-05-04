package com.basic;

public class Methods {
	static Methods m=new Methods();
	static void method1() {
		System.out.println("This is method1");
		m.method3();
	}
	static void method2() {
		System.out.println("This is method2");
		m.method4();
	}
	void method3() {
		method2();
		System.out.println("This is method3");
	}
	void method4() {
		System.out.println("This is method4");
	}

	public static void main(String[] args) {
		method1();
		
	}

}