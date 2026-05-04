package com.assignments;

public class RemoveDupInArray {

	public static void main(String[] args) {
		int arr[]= {10,40,30,60,50,40,50};
//		int temp=0;
//		-----sorting---------
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					temp=arr[i];
//					arr[i]=arr[i+1];
//					arr[i+1]=temp; 
//				}
//			}
//		}
//		System.out.println("After Sorting");
//		for(int a:arr) {
//			System.out.println(a);
//		}
		
		
//		-----------------remove duplicate---------
		for(int i=0;i<arr.length;i++) {
			boolean isDuplicate=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate=true;
				}
			}
			if(!isDuplicate) {
				System.out.println(arr[i]);
			}
		}
		
//		for(int i=0;i<arr.length;i++) {
//			int count=0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//		
//			if(count==1) {
//				System.out.println(arr[i]);
//			}
//		}
		
	}

}
