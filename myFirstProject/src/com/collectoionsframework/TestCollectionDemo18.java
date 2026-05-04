package com.collectoionsframework;

import java.util.HashSet;
import java.util.Set;

public class TestCollectionDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started!!");

		Set<Integer> s = new HashSet<>();
		s.add(10);// 10 --> 16)10(0 -->10
		s.add(18);// 2 --> 16)18(1 -->2
		s.add(32);// 0 --> 16)32(2 -->0
		s.add(46);// 14 --> 16)46(2 -->14
		s.add(52);// 4 --> 16)52(3 -->4
		s.add(60);// 12 -->16)60(3 -->12

		System.out.println(s);// 32 18 52 10 60 46
		System.out.println("main method ended!!");
	}

}
