package com.arrays;

public class MinMaxStrg {

	public static void main(String[] args) {
		String[] words= {"sudha","kalyani","jyothi","vedha"};
		String min=words[0];
		int minLen=min.length();
		String max=words[0];
		int maxLen=max.length();
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			int wordLen=word.length();
			if(wordLen<minLen) {
				minLen=wordLen;
			}else{
				if(wordLen>maxLen) {
					maxLen=wordLen;
				}
			}
		}
		System.out.println("Minimum value is: "+minLen);
		System.out.println("Maximum value is: "+maxLen);
	}
}

