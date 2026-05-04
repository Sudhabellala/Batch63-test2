package com.DSA;

public class TestDSADemo03 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};//must be sorted array
		int key=40;
		
		System.out.println("Element found at index: "+binarysearch(arr,key));
	}

	private static int binarysearch(int[] arr, int key) {
		
		int low=0;//lowest possible index
		int high=arr.length-1;//highest posiible index
		
		while(low<=high) {
			
			int mid=low+(high-low)/2;
			
			if(arr[mid]==key) {
				return mid;//Best case-> Omega(1)
			}else if(key < arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return -1;
	}
}
