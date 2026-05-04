package com.GUT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumStreams {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> evenNums=nums.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNums);
	}
}
