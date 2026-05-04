package com.collectoionsframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("sudha");
		names.add("varshitha");
		names.add("rupa");
		names.add("kalyani");
		names.add("jyothi");
		names.add("sudha");
		names.add("rupa");
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
