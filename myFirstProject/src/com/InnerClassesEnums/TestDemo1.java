package com.InnerClassesEnums;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
//		new TestDemo1().new TestNestedDemo1().hello();
		TestDemo1 t=new TestDemo1();
		TestDemo1.TestNestedDemo1 t1=t.new TestNestedDemo1();
//		TestDemo1.TestNestedDemo1 t1=new TestDemo1().new TestNestedDemo1();
		t1.hello();
		
		System.out.println("main method ended");
	}
	void show() {
		System.out.println("Show called from outer");
	}
	
	class TestNestedDemo1{
		
		void hello() {
			System.out.println("Hello Nested class method");
		}
		
		public static void main(String[] args) {
			System.out.println("main method started");
			
			TestDemo1 t1=new TestDemo1();
			t1.show();
			
			System.out.println("main method ended");
		
		}
	}

}
