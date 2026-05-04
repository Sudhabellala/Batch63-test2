package com.Java8Features;

interface In8{
	void method1();
	
	void method2();
}

interface In9{
	void method3();
}

public class TestJ8Demo8 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		
		In9 i9=()->{
			System.out.println("Hello method 3!!");
		};
		
		i9.method3();
		
		System.out.println("*******************");
		In8 i8=new In8() {

			@Override
			public void method1() {
				System.out.println("method1 called");
			}

			@Override
			public void method2() {
				System.out.println("method2 called");
			}
			
		};
		i8.method1();
		i8.method2();
	}

}
