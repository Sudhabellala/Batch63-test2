package com.GUT;

public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		String s="abecedabcbbe";
		int max=0;
		String res="";
		String ss="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ss.contains(ch+"")) {
				ss=ss.substring(ss.indexOf(ch)+1,ss.length());
			}
			ss=ss+ch;
			if(ss.length()>max) {
				max=ss.length();
				res=ss;
			}
		}
		System.out.println(res);
	}
}
