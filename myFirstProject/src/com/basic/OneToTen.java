package com.basic;

public class OneToTen {
	
	int method1(int a){
		
		if(a>10) {
			System.exit(0);
		}
		if(a<=10) {
			System.out.println(a);
		}
		a++;
		method1(a);
		return a;
	}

	public static void main(String[] args) {
		OneToTen o=new OneToTen();
		o.method1(1);
		
	}

}
