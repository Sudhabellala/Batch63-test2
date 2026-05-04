package com.GUT;

import java.util.Arrays;

public class GreatestRightEl {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 6, 9, 1, 7 };
		int n = arr.length;

		int[] result = new int[n];

		int max = -1; // No element to the right
		int i = n - 1; // Start from last index

		while (i >= 0) {
			result[i] = max;

			if (arr[i] > max) {
				max = arr[i];
			}
			i--;
		}

		System.out.println(Arrays.toString(result));
	}
}
