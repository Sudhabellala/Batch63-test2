package com.assignments;

import java.util.Scanner;

public class RotateRightArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of Positions you want to move: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 2; j >= 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[0] = temp;
		}
		System.out.println("After rotating: ");
		for (int a : arr) {
			System.out.print(a);
		}
		sc.close();
	}

}
