package com.assignments;

public class ShiftZeros {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 5, 2, 0, 4, 8};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				int temp = 0;
				if (arr[j] == 0) {
					temp = arr[j];
					//arr[arr.length - 1] = temp;
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		for (int a : arr) {
			System.out.print(a);
		}
	}

}
