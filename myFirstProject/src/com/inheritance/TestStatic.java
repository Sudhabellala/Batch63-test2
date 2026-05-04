package com.inheritance;

public class TestStatic {
	public static void method1(int i) {
		System.out.println("method1 from parent");
		System.out.println("i value: "+i);
	}
	
	public void method2(int i) {
		System.out.println("method1 from parent");
		System.out.println("i value: "+i);
	}
	
	public static void main(String[] args) {
		System.out.println("method1 from parent");
		System.out.println("main method called from TestStatic");
	}

}
class TestStatic1 extends TestStatic {
	public static void method1(int i) {
		System.out.println("method1 from child");
		System.out.println("i value: "+i);
	}
	
	public void method2(int i) {
		System.out.println("method1 from parent");
		System.out.println("i value: "+i);
	}

	public static void main(String[] args) {
		System.out.println("main method called from TestStatic1");
		method1(10);
		TestStatic1 t=new TestStatic1();
		t.method2(20);
	}

}

