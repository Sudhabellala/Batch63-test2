package com.collectionsframework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Map<String,String> states=new HashMap<>();
		
		states.put("AP", "Andhrapradesh");
		states.put("TG", "Telangana");
		states.put("KA", "Karnataka");
		states.put("TN", "Tamil Nadu");
		states.put("KL", "Kerala");
		states.put("MH", "Maharashtra");
		states.put("GJ", "Gujarat");
		states.put("UP", "Uttar Pradesh");
		states.put("MP", "Madhya Pradesh");
		states.put("WB", "West Bengal");
		
		System.out.println(states.containsKey("TG"));
		System.out.println(states.containsValue("Kerala"));
		
		Set<Entry<String,String>> entries =states.entrySet();
		System.out.println(states.get("TN"));
		System.out.println(states.keySet());
		System.out.println(states.values());
		
//		System.out.println(states);
//		System.out.println(entries);
		
		for(Entry<String,String> entry:entries) {
			System.out.println(entry.getKey()+"-->"+ entry.getValue());
		}
		
	}

}
