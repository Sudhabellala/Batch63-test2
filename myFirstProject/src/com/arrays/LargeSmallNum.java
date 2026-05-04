package com.arrays;

public class LargeSmallNum {

	public static void main(String[] args) {
		int[] numbers= {13,12,6,19,17,15};
		int min=numbers[0];
		int max=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}else if(numbers[i]>max) {
					max=numbers[i];
			}
		}
		int secondMax=0;
		int secondMin=max;
		for(int i1=0;i1<numbers.length;i1++) {
			if(numbers[i1]>secondMax && numbers[i1]!=max) {
				secondMax=numbers[i1];
			}
			if(numbers[i1]<secondMin && numbers[i1]!=min) {
					secondMin=numbers[i1];
				}
			}
		System.out.println("Minimum value is: "+secondMin);
		System.out.println("Maximum value is: "+secondMax);
	}
}
