package com.collectionsframework2;

import java.util.Scanner;

public class ZeroMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];

        // Step 1: Read matrix
        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean[] row = new boolean[3];
        boolean[] col = new boolean[3];

        // Step 2: Identify rows & columns containing zero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 3: Set rows and columns to zero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (row[i] || col[j]) {
                    a[i][j] = 0;
                }
            }
        }

        // Step 4: Print result
        System.out.println("Final Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

