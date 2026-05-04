package com.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PrintSetOfJobs {

	public static void main(String[] args) {
		
		Map<String,Double> IT=new HashMap<>();
		IT.put("Rupa",30000.00);
		IT.put("Varshitha",55000.00);
		IT.put("Sudha",30000.00);
		IT.put("Kalyani",30000.00);
		
		Map<String,Double> analyst=new HashMap<>();
		analyst.put("Kalyani",30000.00);
		analyst.put("Jyothi",30000.00);
		analyst.put("Pavani",25000.00);
		analyst.put("Vedha",40000.00);
		
		Collection<Object> c=new ArrayList<>();
		c.add(IT);
		c.add(analyst);
		
		for(Object c1:c) {
			System.out.println(c1);
		}
		
		
	}
}
