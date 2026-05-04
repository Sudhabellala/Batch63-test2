package com.Abstraction;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("main method started.");

		System.out.println("Monkey Info*********");
		Animal m = new Monkey();
		m.sleep();
		m.eat();
		m.sound();
		m.walk();
		Animal.breath();

		System.out.println("Dog info**************** ");
		Animal d = new Dog();
		d.sleep();
		d.eat();
		d.sound();
		
		List al=new ArrayList();
		al.add("hello");
		System.out.println();
		

		System.out.println("Cat info*************");
		Animal c = new Cat();
		c.sound();
		c.sleep();
		c.eat();
		

	}

}
