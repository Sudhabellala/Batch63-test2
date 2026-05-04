package com.collectoionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo2 {

	public static void main(String[] args) {
		Collection<String> boys=new ArrayList<>();
		boys.add("Shafi");
		boys.add("Shankar");
		boys.add("Deepak");
		boys.add("Narasimha");
		boys.add("Karunakar");
		boys.add("Anudeep");
		
		//System.out.println(boys);
		
		Collection<String> girls=new ArrayList<>();
		girls.add("Sudha");
		girls.add("Kalyani");
		girls.add("Jyothi");
		girls.add("Roopa");
		girls.add("Varshita");
		girls.add("Nandini");
		
		//System.out.println(girls);
		//boys.clear();
		Collection<String> students=new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);
		
//		System.out.println(students);
		boys.clear();
//		System.out.println(boys);
		System.out.println(boys.contains("Deepak"));
		System.out.println(students.containsAll(boys));
		
		for(String student:students) {
			System.out.println(student);
		}
	}

}
