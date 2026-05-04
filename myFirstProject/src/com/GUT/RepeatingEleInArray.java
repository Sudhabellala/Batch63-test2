package com.GUT;

import java.util.HashSet;
import java.util.Set;

public class RepeatingEleInArray {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		int[] arr = { 1, 2, 3, 2, 4 };

		for (int num : arr) {
			if (!s.add(num)) {
				System.out.println(num);
			}
		}
	}
}
