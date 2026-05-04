package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class AvgOfCubesOfAllEle {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5,6);

		Double average=l.stream().mapToInt(n->n*n*n)
							.average()
							.getAsDouble();
							
		
		System.out.println("Average: "+average);
	}
}
