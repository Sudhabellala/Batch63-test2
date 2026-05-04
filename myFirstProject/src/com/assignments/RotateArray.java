package com.assignments;

public class RotateArray {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int size=arr.length;
		int[][] transpose= new int[size][size];
		int[][] rotate=new int[size][size];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
				transpose[i][j]=arr[j][i];
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------");
		
		for(int i=0;i<transpose.length;i++) {
			for(int j=transpose.length-1;j>=0;j--) {
				rotate[i][j]=transpose[i][j];
				System.out.print(rotate[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
