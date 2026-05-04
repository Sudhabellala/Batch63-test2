package com.Abstraction;

public class Dog implements Animal{
	
	@Override
	public void sound() {
		System.out.println("Bow Bow !!");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog can eat meat !");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog can sleep in the morning, woke up at night !");
	}

	
	
}
