package com.arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {20,40,30,60,50};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting the Array: ");
		for(int a:arr) {
			System.out.println(a);
		}
	}
}
