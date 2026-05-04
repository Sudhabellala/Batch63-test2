package com.Java8Features.functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

}

public class TestFIDemo1 {
	public static void main(String[] args) {
		Function<Student, String> f = (s) -> {
			String grade = "";
			if (s.marks >= 90) {
				grade = "A";
			} else if (s.marks > 80) {
				grade = "B";
			} else if (s.marks >= 70) {
				grade = "C";
			}
			return grade;
		};

		Consumer<Student> c = (s) -> {
			System.out.println("Name of the student: " + s.name);
			System.out.println("Name of the student: " + s.marks);
			System.out.println("Name of the student: " + f.apply(s));
			System.out.println("********************");
		};

		Predicate<Student> p = s -> s.marks > 70;

		Student s1 = new Student("Gowtham", 95);
		Student s2 = new Student("Sudha", 85);
		Student s3 = new Student("Vedha", 75);
		Student s4 = new Student("Jyothi", 65);
		Student s5 = new Student("Rupa", 55);

		Student[] studentList = { s1, s2, s3, s4, s5 };
		for (Student s : studentList) {
			if (p.test(s)) {
				c.accept(s);
			}
		}
	}
}
