package com.basic;

public class HarshadNumber {
	static int sum;
	static int m;
	
	
	static int add() {
		sum=1+8;
		return sum;
	}
	
	static int mul() {
		m=18%sum;
		return m;
	}

	public static void main(String[] args) {
		if(m==0) {
			System.out.println("The number is Harshad's Number");
		}
		else {
			System.out.println("The number is not a Harshad's Number");
		}
	}

}
