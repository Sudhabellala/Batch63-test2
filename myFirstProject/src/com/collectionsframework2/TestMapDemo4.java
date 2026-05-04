package com.collectionsframework2;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo4 {

	public static void main(String[] args) {
		Map<String,Integer> marks=new HashMap<>();
		
		marks.put("Maths", 90);
		marks.put("Science", 85);
		marks.put("Java", 100);
		
		int mathsMarks=marks.getOrDefault("Maths", 0);
		int englishMarks=marks.getOrDefault("English", 0);
		int javaMarks=marks.getOrDefault("Java", 0);
		int pythonMarks=marks.getOrDefault("Python", 0);
		
		System.out.println("Maths: "+mathsMarks);
		System.out.println("English: "+englishMarks);
		System.out.println("Java: "+javaMarks);
		System.out.println("Python: "+pythonMarks);
	}

}
