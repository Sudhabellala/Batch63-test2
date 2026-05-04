package com.Java8Features.functions;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestPredicateDemo1 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = (i) -> i % 2 == 0;
		System.out.println(p1.test(10)); // true
		System.out.println(p1.test(15));
		System.out.println(p1.test(21));

		System.out.println("**************");
		Predicate<String> p2 = (s) -> s.contains("Sri");
		System.out.println(p2.test("Srikanth"));

		String[] names = { "Mahendra", "Virat", "Rohit", "Jadeja", "Abhishek", "Harshdeep", "Bhumrah", "Hardik" };
		Predicate<String> p3 = (s) -> s.length() > 5 && s.startsWith("H") && !s.endsWith("a") && s.contains("r") ;
		Consumer<String> c1=(s)-> System.out.println(s); 
		
		for (String name : names) {
			if (p3.test(name)) {
//				System.out.println(name);
				c1.accept(name);
			}
		}

	}

}
