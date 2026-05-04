package com.assignments;

import java.util.Scanner;

public class ConvertTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time as hh:mmAM or hh:mmPM format: ");
		String time = sc.nextLine();

		String[] t = time.split(":");
		// System.out.println(t[1].substring(2));
		int rt = Integer.parseInt(t[0]);
		if (t[1].substring(2).equals("PM") && rt < 12) {
			rt = rt + 12;
			System.out.println(rt + ":" + t[1]);
		}
		else if (t[1].substring(2).equals("AM") && rt == 12) {
			rt = 0;
			System.out.println(rt + ":" + t[1]);
		}else {
			System.out.println(time);
		}
		sc.close();
	}

}
