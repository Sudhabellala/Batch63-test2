package com.basic;

public class Student {
	static int id=1234;
	String name;
	int age;
	int marks;
	
	void student1() {
		int sid=id++;
		name="Vedha";
		age=20;
		marks=80;
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student Marks: "+marks);
		System.out.println("------------------------");
		
	}
	void student2() {
		int sid=id++;
		name="Surya";
		age=24;
		marks=75;
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student Marks: "+marks);
		System.out.println("------------------------");
		
		
	}
	void student3() {
		int sid=id++;
		name="Gowtham";
		age=21;
		marks=95;
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student Marks: "+marks);
		System.out.println("------------------------");
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.student1();
		s.student2();
		s.student3();
		
	}

}
