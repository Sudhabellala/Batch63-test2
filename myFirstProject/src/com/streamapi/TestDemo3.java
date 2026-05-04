package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDemo3 {

	public static void main(String[] args) {
		List<Double> salaries = Arrays.asList(600000.00, 800000.00, 400000.00, 600000.00);

		List<Double> updatedsalaries = salaries.stream()
												.filter(s->s>600000.00)
												.map(d -> d + 50000.00)
												.collect(Collectors.toList());
		updatedsalaries.forEach(d1->System.out.println(d1+" "));
	}
}
