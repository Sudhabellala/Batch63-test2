package com.StringHandling;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuffer result = new StringBuffer();

        for (String w : words) {
            StringBuffer sb = new StringBuffer(w);
            result.append(sb.reverse().toString()).append(" ");
        }

        System.out.println(result.toString().trim());
        sc.close();
    }
}
