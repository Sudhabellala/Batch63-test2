package com.GUT;

import java.util.Scanner;

public class ReplaceOfChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();   // Example: vc$123@JRE56#

        char[] astr = str.toCharArray();

        int l = 0;
        int r = astr.length - 1;

        while (l < r) {
            while (!Character.isLetterOrDigit(astr[l])) {
                l++;
            }

            while (!Character.isLetterOrDigit(astr[r])) {
                r--;
            }

            char temp = astr[l];
            astr[l] = astr[r];
            astr[r] = temp;

            l++;
            r--;
        }

        System.out.println("Result: " + new String(astr));
        sc.close();
    }
}