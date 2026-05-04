package com.basic;

public class Input {
	static int x=270;
	static int y=x%100;
	static int z=y%50;
	
	void hundred() {
		int h= x/100;
		System.out.println("No.of Hundreds in the given input(270): "+h);
		
	}
	void fifty() {
		int f=y/50;
		System.out.println("No.of Fifty in the remaining input(70): "+f);
		
	}
	void ten() {
		int t=z/10;
		System.out.println("No.of Ten in the remaining input(20): "+t);
		
	}

	public static void main(String[] args) {
		Input i=new Input();
		i.hundred();
		i.fifty();
		i.ten();
	}

}
