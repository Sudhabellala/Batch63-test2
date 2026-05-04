package com.collectoionsframework;

import java.util.ArrayList;

public class CommonEleInList {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Sudha");
		names.add("Roopa");
		names.add("Varshita");
		names.add("Kalyani");
		names.add("Jyothi");
		
		ArrayList<String> names1=new ArrayList<>();
		names1.add("Sudha");
		names1.add("Vedha");
		names1.add("Gowtham");
		names1.add("Roopa");
		names1.add("Varshita");
		
		names.retainAll(names1);
		System.out.println(names);
		
	}

}
