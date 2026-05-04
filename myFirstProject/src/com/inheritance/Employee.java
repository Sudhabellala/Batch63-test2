package com.inheritance;

public class Employee {
	int id=9;
	String name="Sanju Samson";
	int age=28;
	
	@Override
	public String toString() {
		return "Employee Details, Id: "+id+" name: "+name+" age: "+age;
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e);
		System.out.println(e.toString());
	}

}
