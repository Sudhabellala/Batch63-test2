package com.placementExam;

import java.util.*;

public class MinContainers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of packages
        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] packages = new int[n];

        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            packages[i] = sc.nextInt();
        }

        System.out.print("Enter container capacity: ");
        int capacity = sc.nextInt();

        // Step 1: Sort packages (largest to smallest)
        Arrays.sort(packages);
        
        // Two-pointer greedy method
        int left = 0;           // smallest weight
        int right = n - 1;      // largest weight
        int containers = 0;

        while (left <= right) {
            // Start new container with heaviest remaining package
            int current = packages[right];
            right--;

            // Try to add the smallest packages until capacity is reached
            while (left <= right && current + packages[left] <= capacity) {
                current += packages[left];
                left++;
            }

            containers++;  // one container filled
        }

        System.out.println("Minimum containers required: " + containers);

        sc.close();
    }
}

