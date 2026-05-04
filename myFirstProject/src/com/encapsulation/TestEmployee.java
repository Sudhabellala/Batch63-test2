package com.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(10);
		e.setFirstName("Sudha");
		System.out.println(e.getEid());
		System.out.println(e.getFirstName());
	}
}
