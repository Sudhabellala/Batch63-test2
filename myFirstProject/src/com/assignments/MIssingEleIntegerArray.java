package com.assignments;

import java.util.Arrays;

public class MIssingEleIntegerArray {

	public static void main(String[] args) {
		int[] arr= {1,3,4,6,8};
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			int a=arr[i];
			int b=arr[i+1];
			for(int j=a+1;j<b;j++) {
				System.out.println(j);
			}
		}
	}	
}


	