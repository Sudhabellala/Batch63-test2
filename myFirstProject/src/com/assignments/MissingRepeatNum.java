package com.assignments;

public class MissingRepeatNum {

	public static void main(String[] args) {
		int[] arr= {1,2,4,4,5,6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+1==arr[j]) {
					System.out.println(arr[i]);
				}
			}
			
		}
	}

}
