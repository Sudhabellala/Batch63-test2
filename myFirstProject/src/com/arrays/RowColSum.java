package com.arrays;

import java.util.Scanner;

public class RowColSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take matrix size from user
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];

		// Input matrix elements
		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// Print matrix
		System.out.println("\nMatrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// Calculate and print row sums
		System.out.println("\n--- Row Sums ---");
		for (int i = 0; i < rows; i++) {
			int rowSum = 0;
			for (int j = 0; j < cols; j++) {
				rowSum += arr[i][j];
			}
			System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
		}

		// Calculate and print column sums
		System.out.println("\n--- Column Sums ---");
		for (int j = 0; j < cols; j++) {
			int colSum = 0;
			for (int i = 0; i < rows; i++) {
				colSum += arr[i][j];
			}
			System.out.println("Sum of column " + (j + 1) + ": " + colSum);
		}

		// Find min and max
		int min = arr[0][0];
		int max = arr[0][0];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		System.out.println("\n--- Min and Max ---");
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);

		sc.close();
	}
}
