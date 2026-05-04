package com.tests;

public class SubarraySum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 };
		int target = 12;

		int start = 0, currSum = 0;

		for (int end = 0; end < arr.length; end++) {
			currSum += arr[end];

			// Shrink the window if current sum is larger than target
			while (currSum > target && start <= end) {
				currSum -= arr[start];
				start++;
			}

			// Check if sum matches
			if (currSum == target) {
				System.out.println("Subarray found from index " + start + " to " + end);

				// Print elements
				System.out.print("Elements: [");
				for (int i = start; i <= end; i++) {
					System.out.print(arr[i]);
				}
				System.out.println("]");
				return;
			}
		}

		System.out.println("No subarray found with target sum.");
	}
}
