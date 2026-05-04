package com.inheritance;

public class TestInDem01 implements Cloneable{
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		TestInDem01 t1 = new TestInDem01();
		//5ca881b5
		System.out.println(t1);
		Object obj=t1.clone();
		System.out.println("getClass(): "+t1.getClass());
		//24d46ca6
		System.out.println(obj);
		System.out.println(t1.equals(obj));
		
		int a=0x5ca881b5;
		int b=0x24d46ca6;
		
		System.out.println("A value: "+a);
		System.out.println("B value: "+b);
		System.out.println("--------------");
		System.out.println(t1.hashCode());
		System.out.println(obj.hashCode());
		
		System.out.println("*************");
		t1=null;
		TestInDem01 t2 = new TestInDem01();
		TestInDem01 t4 = t2;
		System.out.println(t2.equals(t4));
		System.out.println(t2);
		System.out.println("*************");
		
		System.gc();
	}
}
