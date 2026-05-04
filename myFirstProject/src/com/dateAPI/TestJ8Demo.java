package com.dateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestJ8Demo {

	public static void main(String[] args) {
		LocalDateTime lt1 = LocalDateTime.of(1991, 3, 9, 10, 30);
		System.out.println("Birthdate: " + lt1);
		System.out.println("Birthday after 6 months: " + lt1.plusMonths(6));
		System.out.println("Birthday before 6 months: " + lt1.minusMonths(6));
		LocalDateTime lt = LocalDateTime.now();
		System.out.println(lt);

		int m1 = lt.getMonthValue();
		int d1 = lt.getDayOfMonth();
		int yy = lt.getYear();

		int hr1 = lt.getHour();
		int m2 = lt.getMinute();
		int ss = lt.getSecond();

		System.out.printf("%d/%d/%d:%d-%d-%d", d1, m1, yy, hr1, m2, ss);

		System.out.println("**************");
		System.out.println();
		LocalDate d = LocalDate.now();

		System.out.println("Current Date: " + d);

		int mm = d.getMonthValue();
		int yyyy = d.getYear();
		int dd = d.getDayOfMonth();
		System.out.printf("Current date: %d/%d/%d", dd, mm, yyyy);

		LocalTime t = LocalTime.now();
		System.out.printf("\nCurrent time: " + t);
		int hr = t.getHour();
		int min = t.getMinute();
		int sec = t.getSecond();
		System.out.printf("Current Time: %d:%d:%d" , hr, min, sec);

	}

}
