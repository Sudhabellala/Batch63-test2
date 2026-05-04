package com.placementExam;

import java.util.Scanner;

public class RotateRightArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of positions to move: ");
        int n = sc.nextInt();

        int length = arr.length;
        n = n % length; // normalize
        int[] temp = new int[length];

        // Step 1: copy last n elements into temp at the beginning
        int index = 0;
        for (int i = length - n; i < length; i++) {
            temp[index] = arr[i];
            index++;
        }

        // Step 2: copy remaining elements
        for (int i = 0; i < length - n; i++) {
            temp[index] = arr[i];
            index++;
        }

        // Print result
        System.out.println("After rotating:");
        for (int x : temp) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}

