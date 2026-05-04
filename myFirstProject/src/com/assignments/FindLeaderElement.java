package com.assignments;

public class FindLeaderElement {

	public static void main(String[] args) {
		int[] arr= {1,13,1,15,14,13,17,18,17};
		for(int i=0;i<arr.length-2;i++) {
			int leader=0;
			if(arr[i]>arr[i+1]) {
				leader=arr[i];
			}
			System.out.println(leader);
		}
//		System.out.println(arr[i]);
	}

}
