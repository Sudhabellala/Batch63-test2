package com.StringHandling;

public class TestStrDemo20 {

	public static void main(String[] args) {
		String s3 = "Good morning have a nice day";
		System.out.println(s3.substring(5));

		String s4 = "Sudha Rani";
		System.out.println(s4.substring(2, 7));

		String s2 = "abc";
		System.out.println(s2.replaceAll("\\D", "1"));

		String s6 = "All the best for collections and will start from next monday -500090";
		char[] ch = s6.toCharArray();
		int count = 0;
//		for (char c : ch) {
//			System.out.print(c + " ");
//			count++;
//		}
		for(char c:ch) {
			if(Character.isLetter(c)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
