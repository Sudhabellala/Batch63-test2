package com.assignments;

public class StudentMarks {

	public static void main(String[] args) {
		int sum=0;
		int avg;
		
		int[] arr= {78,83,92,74,97};

		for(int i=0;i<arr.length;i++) {
			int d=arr[i]%10;
			if(d<=5) {
				arr[i]=arr[i]-d;
			}else {
				d=10-d;
				arr[i]=arr[i]+d;
			}
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println("sum: "+sum);
		avg=sum/arr.length;
		System.out.println("Average: "+avg);
	}

}
