package com.collectoionsframework;

import java.util.ArrayList;

public class RepeatNumInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);

		for (int i = 0; i < numbers.size(); i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (numbers.get(i) == (numbers.get(j))) {
					isDuplicate = true;
				}
			}
			if (!isDuplicate) {
				System.out.print(numbers.get(i)+" ");
			}
		}
	}

}
