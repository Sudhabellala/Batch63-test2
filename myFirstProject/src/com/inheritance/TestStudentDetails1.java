package com.inheritance;
//Deep Copy
class Student1{
	String name;
	Address1 address1;
	public Student1(String name, Address1 address1) {
		this.name = name;
		this.address1 = address1;
	}
	
	public Student1(Student1 student1) {
		this.name=student1.name;
		this.address1=new Address1(student1.address1);
	}
}

class Address1{
	String city;
	
	public Address1(String city) {
		super();
		this.city=city;
	}
	
	public Address1(Address1 address1) {
		this.city=address1.city;
	}
}

public class TestStudentDetails1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Address1 address1=new Address1("Hyderabad");
		Student1 st1=new Student1("sudha", address1);
		System.out.println(st1.name);
		System.out.println(st1.address1.city);
		System.out.println("******************");
		
		Student1 st2=new Student1(st1);
		System.out.println(st2.name);
		System.out.println(st2.address1.city);
		
		System.out.println("******************");
		st2.address1.city="Banglore";
		
		System.out.println(st2.name);
		System.out.println(st2.address1.city);
		
		System.out.println(st1.name);
		System.out.println(st1.address1.city);
	}
}
