package com.GUT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeadersOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements for array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int maxFromRight = arr[n - 1];

		List<Integer> leaders = new ArrayList<>();
		leaders.add(maxFromRight);
		
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>maxFromRight) {
				maxFromRight=arr[i];
				leaders.add(maxFromRight);
			}
		}
		
		Collections.reverse(leaders);
		
		for(int ch:leaders) {
			System.out.print(ch+" ");
		}
		sc.close();
	}

}
