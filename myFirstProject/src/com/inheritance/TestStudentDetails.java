package com.inheritance;

class Student implements Cloneable{
	String name;
	Address address;
	
	public Student(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class Address{
	String city;

	public Address(String city) {
		this.city = city;
	}
}

public class TestStudentDetails {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started");
		Address address=new Address("Hyderabad");
		Student s1=new Student("Sudha",address);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		
		Student s2=(Student)s1.clone();
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		
		System.out.println("************************");
		s2.address.city="Banglore";
		s2.name="Jyothi";
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		
	}

}
