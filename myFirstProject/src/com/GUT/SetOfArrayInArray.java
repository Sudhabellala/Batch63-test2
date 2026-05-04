package com.GUT;

public class SetOfArrayInArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 1, 9 }, { 5, 6 }, { 4, 8 } };

		for (int i = 0; i <arr.length; i++) {
			int[] a = arr[i];
			for (int j = 0; j < a.length; j++) {
				if ((a[j] < arr[i][j]))  {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}

		}
	}

} 