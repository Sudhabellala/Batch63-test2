package com.tests;

class C{
	void call() {
		show();
	}
	void show() {
		System.out.println("A-show");
	}
}
class D extends C{
	void show() {
		System.out.println("B-show");
	}
}

public class Main1 {
	public static void main(String[] args) {
		C obj=new D();
		obj.call();
		
	}
}
