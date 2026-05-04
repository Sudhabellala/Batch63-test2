package com.GUT;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();//swiss

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isRepeated = false;

            // Check if character repeats
            for (int j = 0; j < str.length(); j++) {
                if (i != j && ch == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            // If not repeated, print and break
            if (!isRepeated) {
                System.out.println("First non-repeating character: " + ch);
                System.out.println("Index: " + i);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
        
    }
}
