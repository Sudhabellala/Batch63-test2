package com.arrays;

public class TwoArrInThirdArr {

	public static void main(String[] args) {
		int[] a1= {10,20,30};
		int[] a2= {5,6,7};
		
		int a1Length=a1.length;
		int a2Length=a2.length;
		
//		System.out.println(a1Length);
		
		int[] a3=new int[a1.length+a2.length];
		for(int i=0;i<a1Length;i++) {
			a3[i]=a1[i];
		}
		
		for(int i=0;i<a2Length;i++) {
			a3[a1Length+i]=a2[i];
		}
		
		for(int a:a3) {
			System.out.print(a+" ");
		}
	}

}
