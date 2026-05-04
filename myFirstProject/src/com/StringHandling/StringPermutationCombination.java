package com.StringHandling;

public class StringPermutationCombination {

	public static void main(String[] args) {
		String s="abcd";
		int count=0;
		while(count<s.length()) {
			System.out.println(s.charAt(count));
			count++;
		}
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<i;j++) {
				String e=s.charAt(j)+"";
				e+=s.charAt(i);
				System.out.println(e);
			}
		}
		System.out.println(s);
	}

}
