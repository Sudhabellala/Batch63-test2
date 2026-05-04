package com.StringHandling;

public class TestStrDemo24 {
	String s1;
	public static void main(String[] args) {
		System.out.println("main method started ");
		
		String s=new String();
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer();//16
		System.out.println(sb);//empty space
		System.out.println(sb.length());//0
		System.out.println(sb.capacity());//16
		
		StringBuffer sb1=new StringBuffer("Java");//4
		System.out.println(sb1);//Java
		System.out.println(sb1.capacity());//20
		
//		StringBuffer sb8="Java"; //To stringBuffers can't assign String ,literals
//		System.out.println(sb8+"Sudha");
		System.out.println("main method ended ");
		
	}

}
