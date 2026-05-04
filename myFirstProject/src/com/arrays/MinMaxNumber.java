package com.arrays;

public class MinMaxNumber {
	public static void main(String[] args) {
		int[] numbers= {-5,-4,3,7,10};
		int min=numbers[0];
		int max=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}else{
				if(numbers[i]>max) {
					max=numbers[i];
				}
			}
		}
		System.out.println("Minimum value is: "+min);
		System.out.println("Maximum value is: "+max);
	}

}
