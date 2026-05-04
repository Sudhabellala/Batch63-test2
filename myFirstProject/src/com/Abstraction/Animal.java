package com.Abstraction;

public interface Animal {
	
	public static final String orgName="Sudha";
	
	public static void main(String[] args) {
		System.out.println("main method strated");
		hello();
	}
	
	public abstract void sound();
	public abstract void eat();
	public abstract void sleep();
	
	default void walk() {
		System.out.println("Every anomal can walk");
		hello();
	}
	static void breath() {
		System.out.println("Every animal must breath");
		hello();
	}
	
	private static void hello() {
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}
	
}
