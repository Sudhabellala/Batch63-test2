package com.GUT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumInList {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> evenNums=nums.stream().filter(n->n%2==0).sorted().collect(Collectors.toList());
		
//		List<Integer> evenNums = new ArrayList<>();
//		for (int n : nums) {
//			if (n % 2 == 0) {
//				evenNums.add(n);
//			}
//		}
		System.out.println(evenNums);
	}
}
