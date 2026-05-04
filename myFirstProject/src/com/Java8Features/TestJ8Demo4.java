package com.Java8Features;

@FunctionalInterface
interface In4 {
	int multiplication(int a, int b);
}

public class TestJ8Demo4 {

	public static void main(String[] args) {

		In4 i4 = (a, b) -> {
			return a * b;
		};
		System.out.println(i4.multiplication(10,10));
	}

}
