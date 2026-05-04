package com.tests;

public class Test1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]=a;
		b=new int[] {4,1,2,3,5};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[0]+" "+b[0]);
		}
	}

}
