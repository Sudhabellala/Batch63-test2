package com.collectionsframework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(105, "Abhishek", 78.5, 23);
		Student s2 = new Student(101, "Surya", 88.5, 22);
		Student s3 = new Student(102, "Tilak", 98.5, 21);
		Student s4 = new Student(104, "Jaiswal", 68.5, 22);
		Student s5 = new Student(103, "Samson", 82.5, 24);

		List<Student> list = new ArrayList<>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		Comparator<Student> c = new Comparator<>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getMarksp() < o2.getMarksp()) {
					return -1;
				} else if (o1.getMarksp() > o2.getMarksp()) {
					return 1;
				} else {
					return 0;
				}
			}

		};

		Collections.sort(list, c);

		for (Student s : list) {
			System.out.println(s);
		}

	}

}
