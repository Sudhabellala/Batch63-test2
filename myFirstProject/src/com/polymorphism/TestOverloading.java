package com.polymorphism;

public class TestOverloading {
	void addition() {
		System.out.println("addition with no args");
	}
	void addition(int a) {
		System.out.println("addition with args");
	}
	void addition(float a) {
		System.out.println("addition with args");
	}
	void addition(double a) {
		System.out.println("addition with args");
	}

	public static void main(String[] args) {
		TestOverloading t=new TestOverloading();
		t.addition();
		t.addition(10);
		
	}

}
