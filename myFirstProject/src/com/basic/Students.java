package com.basic;

public class Students {
	static int id=101;
	String studentName;
	int studentAge;
	int studentMarks;
	
	void student1(String name,int age,int marks) {
		id++;
		studentName=name;
		studentAge=age;
		studentMarks=marks;
		display();
	}
	void student2(String name,int age,int marks) {
		id++;
		studentName=name;
		studentAge=age;
		studentMarks=marks;
		display();
	}
	void student3(String name,int age,int marks) {
		id++;
		studentName=name;
		studentAge=age;
		studentMarks=marks;
		display();
	}
	void display() {
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Age: "+studentAge);
		System.out.println("Student Marks: "+studentMarks);
		System.out.println("-------------------------------");
		
		
	}
	public static void main(String[] args) {
		Students s=new Students();
		s.student1("Vedha",20,80);
		s.student2("Surya",24,75);
		s.student3("Gowtham",21,95);
		
		
	}

}
