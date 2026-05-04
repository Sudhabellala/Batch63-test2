package com.StringHandling;

import java.util.Scanner;

public class ReverseStringUsingBytes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();//sudha

		byte[] arrBytes = s.getBytes();
		int left = 0;
		int right = arrBytes.length - 1;
		byte temp = 0;

		while (left < right) {
			temp = arrBytes[left];
			arrBytes[left] = arrBytes[right];
			arrBytes[right] = temp;
			left++;
			right--;
		}

		for (byte b : arrBytes) {
			System.out.print((char)b);
		}
		sc.close();
	}

}
