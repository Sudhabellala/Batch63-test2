package com.collectoionsframework;

import java.util.ArrayList;
import java.util.List;

public class RemoveStringStartsWithS {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("sudha");
		names.add("Roopa");
		names.add("sushma");
		names.add("Varshita");
		names.add("sahasra");
		names.add("surya");
		System.out.println(names);
		
		for(int i=0;i<names.size();i++) {
			int n=i;
			 if(names.get(n).startsWith("s")) {
				 System.out.println(names.get(n));
				 //names.remove(indexOf(names.get(n)));
				 System.out.println(names.remove(names.get(n)));
			 }
			
		}
		System.out.println(names);
	}

}
