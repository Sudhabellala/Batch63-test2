package com.tests;

class Aa{
	static void show() {
		System.out.println("Static A");
	}
	static void display() {
		System.out.println("Instance A");
	}
}
class Ba extends Aa{
	static void show() {
		System.out.println("Static B");
	}
	static void display() {
		System.out.println("Instance B");
	}
}

public class Demo {
	public static void main(String[] args) {
		Aa obj=new Ba();
		obj.show();
		obj.display();
	}
}
