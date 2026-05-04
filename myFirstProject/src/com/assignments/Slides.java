package com.assignments;

import java.util.Scanner;

public class Slides {

	public static void main(String[] args) {
		int[] arr = { 1, 3, -3, 5, 3, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int slide = sc.nextInt();

		for (int i = 0; i <= arr.length-slide; i++) {
			int max = arr[i];
			for (int j = 1; j < slide; j++) {
				if (arr[i + j] > max) {
					max = arr[i + j];
				}
			}
			System.out.println("Max =" + max);
		}
		sc.close();
	}
}
