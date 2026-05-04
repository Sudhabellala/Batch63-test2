package com.GUT;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	
	public static int lengthOfLongestSubstring(String str) {
		Set<Character> s=new HashSet<>();
		int left=0;
		int maxLength=0;
		
		for(int right=0;right<str.length();right++) {
			while(s.contains(str.charAt(right))) {
				s.remove(str.charAt(left));
				left++;
			}
			s.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
		}		
		return maxLength;
	}

	public static void main(String[] args) {
		String str="abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));
		
	}

}
