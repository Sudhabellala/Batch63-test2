package com.Java8Features;

interface In3{
	void addition(int a, int b);
}

public class TestJ8Demo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		In3 i3=(x,y)->System.out.println(x+y);
		i3.addition(100, 200);
	}

}
