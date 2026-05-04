package com.StringHandling;

import java.util.ArrayList;

public class EvenNumWithoutIterator {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);

//		for (Integer num : number) {
//			if (num % 2 == 0) {
//				number.remove(number.indexOf(num));
//			}
//		}
//		System.out.println(number);
		for (int i = 0; i < number.size(); i++) {
			if (number.get(i) % 2 == 0) {
				number.remove(number.get(i));
			}
		}
		System.out.println("After removing the even elements: "+number);
	}

}
