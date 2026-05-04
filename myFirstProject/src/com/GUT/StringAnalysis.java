package com.GUT;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (input == null || input.length() == 0) {
            System.out.println("Invalid Input");
            return;
        }

        char[] arr=input.toCharArray();	
        
        // Using LinkedHashMap to maintain insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();
      
        // Count frequency
        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char firstNonRepeating = '\0';
        boolean foundNonRepeating = false;

        char mostRepeated = '\0';
        int maxCount = 0;

        System.out.println("\nCharacter Details:");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            int index = input.indexOf(ch);

            System.out.println(ch + " -> " + count + 
                    (count == 1 ? " time" : " times") + 
                    ", first occurrence at index " + index);

            // Find first non-repeating character
            if (!foundNonRepeating && count == 1) {
                firstNonRepeating = ch;
                foundNonRepeating = true;
            }

            // Find most repeated character
            if (count > maxCount) {
                maxCount = count;
                mostRepeated = ch;
            }
        }

        System.out.println();

        // If all characters are repeating
        if (!foundNonRepeating) {
            System.out.println("First Non-Repeating Character: None");
        } else {
            System.out.println("First Non-Repeating Character: " + firstNonRepeating);
        }

        System.out.println("Most Repeated Character: " + mostRepeated + 
                           " (appears " + maxCount + " times)");

        sc.close();
    }
}
