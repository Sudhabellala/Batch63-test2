package com.StringHandling;

public class TestStrDemo25 {

	public static void main(String[] args) {
		StringBuffer sb10=new StringBuffer();
		sb10.ensureCapacity(10);
		System.out.println(sb10.capacity());
		
		
		StringBuffer sb1=new StringBuffer("Srikanth");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		//sb1.getChars(0, 3, , 1);
		
		System.out.println(sb1.delete(0,3));
		
		System.out.println("******************");
		StringBuffer sb2=new StringBuffer();//16
		sb2.append("SrikanthSrikanthSrikanthSrikanthSrikanthSrikanthSrukanth");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		System.out.println("*****************");
		StringBuffer sb3=new StringBuffer("Java");
		System.out.println(sb3);
		sb3.append("SrikanthSrikanthSrikanthSrikanthSrikanth");
		System.out.println(sb3.capacity());
		
		StringBuffer sb4=new StringBuffer();//16
		System.out.println(sb4);
		sb4.append("SrikanthSrikanth");//34
		sb4.append("SrikanthSrikanthSri");//70
		sb4.append("i");//72
		System.out.println(sb4);
		System.out.println(sb4.capacity());
		
		System.out.println("********************");
		StringBuffer sb5=new StringBuffer();
		sb5.ensureCapacity(100);
//		sb5.append("Hello");
		System.out.println(sb5.capacity());
	}

}
