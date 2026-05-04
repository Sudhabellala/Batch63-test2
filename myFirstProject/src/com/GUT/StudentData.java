package com.GUT;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name: ");
		String name = sc.nextLine(); // sudha

		System.out.println("Enter number of Subjects: ");
		int num_sub = sc.nextInt(); // 5

		int total_marks_secured = 0;
		for (int i = 1; i <= num_sub; i++) {
			System.out.println("Enter subject "+i+" Marks: ");
			int marks = sc.nextInt();
			total_marks_secured = marks + total_marks_secured;
		}

		int out_of_marks = num_sub * 100;
		int avg = total_marks_secured / num_sub;
		int percentage = (total_marks_secured * 100 / out_of_marks);

		System.out.println("Name Of The Student: " + name);
		System.out.println("Total Marks: " + total_marks_secured);
		System.out.println("Average: " + avg);
		System.out.println("Percentage: " + percentage);

		if (percentage < 50) {
			System.out.println("Fail");
		} else if (percentage == 50 || percentage < 59) {
			System.out.println("D");
		} else if (percentage == 60 || percentage < 75) {
			System.out.println("C");
		} else if (percentage == 75 || percentage < 89) {
			System.out.println("B");
		} else if (percentage == 90 || percentage <= 100) {
			System.out.println("A");
		}

		sc.close();
	}
}
