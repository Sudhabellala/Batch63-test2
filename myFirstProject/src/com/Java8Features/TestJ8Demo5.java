package com.Java8Features;

@FunctionalInterface
interface In5{
	void method1();
}

//Invalid '@FunctionalInterface' annotation; In6 is not a functional interface
@FunctionalInterface
interface In6 extends In5{
//	void method2();
}


public class TestJ8Demo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		In6 i6=()->System.out.println("hello method1 ");
		i6.method1();
	}

}
