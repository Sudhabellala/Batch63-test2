package com.collectoionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo3 {

	public static void main(String[] args) {
		Collection<String> boys=new ArrayList<>();
		boys.add("Shafi");
		boys.add("Shankar");
		boys.add("Deepak");
		boys.add("Narasimha");
		boys.add("Karunakar");
		boys.add("Anudeep");
		
		
		Collection<String> girls=new ArrayList<>();
		girls.add("Sudha");
		girls.add("Kalyani");
		girls.add("Jyothi");
		girls.add("Roopa");
		girls.add("Varshita");
		girls.add("Nandini");
		
		Collection<String> students=new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);
//		boys.clear();
		System.out.println(boys);
		boys.add("Sachin");
		
		System.out.println(students.containsAll(boys));
		students.removeAll(girls);
		System.out.println(students);
	
	}

}
