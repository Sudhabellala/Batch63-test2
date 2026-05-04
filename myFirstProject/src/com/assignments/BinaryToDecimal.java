package com.assignments;

public class BinaryToDecimal {

	public static void main(String[] args) {
	int n=1001;
	
	int power=1;
	int decimal=0;
	while(n>0) {
		int r=n%10;
		decimal=decimal+r*power;
		power=power*2;
		n=n/10;
	}
	System.out.println("decimal: "+decimal );
	}
}
