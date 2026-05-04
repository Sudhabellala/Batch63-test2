package com.Abstraction;

interface In1{
	void method1();
	void method2();
}

interface In2{
	void method2();
	void method3();
}

interface In3 extends In1,In2{
	
}

class TestA implements In3{

	@Override
	public void method1() {
		System.out.println("method1 called");
	}

	@Override
	public void method2() {
		System.out.println("method2 called");
	}

	@Override
	public void method3() {
		System.out.println("method3 called");
	}
	
}

public class TestDemo2 {
	
	public static void main(String[] args) {
		//TestA t1=new TestA();
		In3 t1=new TestA();//up-casting
		t1.method1();
		t1.method2();
		t1.method3();
		
	}

}
