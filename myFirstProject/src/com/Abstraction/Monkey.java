package com.Abstraction;

public class Monkey implements Animal{
	
	@Override
	public void sound() {
		System.out.println("kich kich kich");
	}
	
	@Override
	public void eat() {
		System.out.println("Monkey can eat banana !!");
	}
	
	@Override
	public void sleep() {
		System.out.println("Monkey can sleep at anytime !");
	}
	
}
