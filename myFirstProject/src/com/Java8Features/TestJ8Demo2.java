package com.Java8Features;

@FunctionalInterface
interface In2{
	void hello();
}

public class TestJ8Demo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		In2 i2=()->System.out.println("Hello Good evening !!");
		System.out.println("Hello Good evening !!");
		System.out.println("Hello Good evening !!");
		
		i2.hello();
	}

}
