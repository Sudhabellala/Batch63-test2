package com.Java8Features;

@FunctionalInterface
interface In1 {
	public abstract void addition();

}

public class TestJ8Demo1 {

	public static void main(String[] args) {
		System.out.println("main method started! ");
		In1 i1=() -> {
			int a=10;
			int b=10;
			System.out.println(a+b);
		};
	}

}
