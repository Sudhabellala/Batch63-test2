package com.assignments;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 4, 6, 5, 4, 7, 6 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			// boolean visit=false;
			if (arr[i] == -2) {
				continue;
			}
			temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (temp == arr[j]) {
					count++;
					arr[j] = -2;
					// visit=true;
				}
			}
			System.out.println(arr[i] + ":" + count);
		}
	}

}
