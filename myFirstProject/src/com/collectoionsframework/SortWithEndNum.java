package com.collectoionsframework;

public class SortWithEndNum {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 12, 26, 74, 38 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] % 10 > arr[j] % 10) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After sorting: ");
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
