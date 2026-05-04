package com.Abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Meow Meow !!!");
	}

	@Override
	public void eat() {
		System.out.println("cat can eat rat !!");
	}

	@Override
	public void sleep() {
		System.out.println("Cat can sleep at anytime !");
	}
	
	public static void breath() {
		System.out.println("Cat will breath digfferently");
	}

}
