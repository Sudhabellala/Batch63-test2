package com.basic;

public class Individual {
    public static void main(String[] args) {
        int num = 673;

        while(num > 0) {
            int digit = num % 10;   // get last digit
            System.out.println(digit);
            num = num / 10;         // remove last digit
        }
    }
}
