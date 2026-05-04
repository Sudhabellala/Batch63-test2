package com.assignments;

import java.util.Scanner;

public class RemoveNthOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();   // e.g. 131313
        
        char target = '1';
        int index = s.indexOf(target);
        int max = 0;

        while (index != -1) {
            // remove the character at 'index'
            String r = s.substring(0, index) + s.substring(index + 1);

            int num = Integer.parseInt(r);

            if (num > max) {
                max = num;
            }

            // find next occurrence
            index = s.indexOf(target, index + 1);
        }

        System.out.println("Max number is: " + max);
        sc.close();
    }
}

