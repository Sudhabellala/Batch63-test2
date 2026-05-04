package com.StringHandling;

public class TestStrDemo23 {

	public static void main(String[] args) {
		String s="100";
		int i6=Integer.parseInt(s);
		
		int i5=200;
		System.out.println(i6+i5);
		
		
		int i = 10;
		String istr = String.valueOf(i);
		System.out.println(istr + 100);
		
		double d=5.9;
		String dstr=String.valueOf(d);
		System.out.println(dstr + 10.5);
		
//		Integer i1=10;
		Integer i1=Integer.valueOf(i);
		
		int i2=i1.intValue();
		
		
	}

}
