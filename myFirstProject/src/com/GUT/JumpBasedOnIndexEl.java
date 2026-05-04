package com.GUT;

import java.util.Scanner;

public class JumpBasedOnIndexEl {

    public static void main(String[] args) {

        int[] a = { 1, 4, 3, -1, 0, 2, 5 };
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting index: ");
        int index = sc.nextInt();

        int count = 0;
        boolean[] visited = new boolean[a.length];

        while (index >= 0 && index < a.length) {

            // If already visited → infinite loop
            if (visited[index]) {
                System.out.println("Infinity");
                return;
            }

            visited[index] = true;

            // If element is 0
            if (a[index] == 0) {
                System.out.println("I am stuck");
                return;
            }

            // Jump
            index = index + a[index];
            count++;
        }

        System.out.println("No.of Jumps: " + count);
    }
}
