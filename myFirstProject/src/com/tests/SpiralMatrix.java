package com.tests;

//public class SpiralMatrix {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];

        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                arr[top][i] = value++;
            top++;

            for (int i = top; i <= bottom; i++)
                arr[i][right] = value++;
            right--;

            for (int i = right; i >= left; i--)
                arr[bottom][i] = value++;
            bottom--;

            for (int i = bottom; i >= top; i--)
                arr[i][left] = value++;
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
