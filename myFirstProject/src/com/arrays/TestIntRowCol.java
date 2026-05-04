package com.arrays;

public class TestIntRowCol {

	public static void main(String[] args) {
		System.out.println("main method started! ");
		
		int[][] arr=new int[3][2];
		//0 1 2  //0 1
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		arr[2][0]=50;
		arr[2][1]=60;
		
		
	}

}
