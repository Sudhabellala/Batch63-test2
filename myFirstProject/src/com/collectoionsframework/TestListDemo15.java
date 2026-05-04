package com.collectoionsframework;

import java.util.Stack;

public class TestListDemo15 {

	public static void main(String[] args) {
		Stack<String> ss=new Stack<>();
		ss.push("J2EE");	
		ss.push("J2SE");
		ss.push("Frameworks");
		ss.push("DAO");
		ss.push("React");
		ss.push("Angular");
		
		System.out.println(ss.empty());
		System.out.println(ss.search("DAO"));
		System.out.println(ss.peek());
		System.out.println(ss.pop());
		System.out.println(ss);
	}

}
