package com.Java8Features.functions;

import java.util.function.Consumer;

public class TestConsumerDemo1 {

	public static void main(String[] args) {
		Consumer<Integer> c1=(i)-> System.out.println(i*i*i);
		c1.accept(10);
		
		
	}

}
