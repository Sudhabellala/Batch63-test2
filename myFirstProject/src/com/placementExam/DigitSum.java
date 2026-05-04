package com.placementExam;

public class DigitSum {
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;  // extract last digit
            n = n / 10;     // remove last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println("Sum of digits: " + sumOfDigits(num)); // Output: 6
    }
}
