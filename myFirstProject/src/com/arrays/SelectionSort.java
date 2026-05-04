package com.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {20,50,30,60,40,10};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
	 			}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		System.out.println("After sorting the array: ");
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
