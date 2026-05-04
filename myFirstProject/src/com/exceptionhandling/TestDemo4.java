package com.exceptionhandling;

public class TestDemo4 {
	void method1() {
		return;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try");
			System.out.println(10/2);
			return;
		}catch(Exception e) {
			System.out.println("in catch");
			System.out.println(10/2);
			return;
		}
		finally {
			System.out.println("in finally1");
			System.out.println(10/2);
			
		}
		
	}

}
