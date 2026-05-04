package com.DSA;

import java.util.Scanner;

public class TestArraysDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements for Array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
