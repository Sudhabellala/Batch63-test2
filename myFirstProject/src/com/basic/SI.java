package com.basic;

public class SI {
	int P=5000;
	int R=5;
	int T=3;
	float S_Y=(P*R*T)/100;
	float S_M=(P*R*T)/(100*12);

	public static void main(String[] args) {
		SI s=new SI();
		System.out.println("Simple Interest Yearly: "+s.S_Y);
		System.out.println("Simple Interset Monthly "+s.S_M);
		
		
	}

}
