package com.dateAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo1 {

	static final String OLD_FORMAT="dd/MM/yyyy";
	static final String NEW_FORMAT="yyyy-MM-dd";

	
	public static void main(String[] args) throws ParseException {
		String s="123";
		System.out.println(s+10);
		int s1=Integer.parseInt(s);
		System.out.println(s1+10);
		
		long millis=System.currentTimeMillis();
		System.out.println(millis);
		Date date=new Date(1769754335000L);
		System.out.println(date);
		Date date1=new Date();
		System.out.println(date1);
		
		String oldDateString="30/01/2026";
		String newDateString;//2024-01-30
		
		SimpleDateFormat sdf=new SimpleDateFormat(OLD_FORMAT);
		
		//String to Date
		Date d=sdf.parse(oldDateString);
		sdf.applyPattern(NEW_FORMAT);
		newDateString =sdf.format(d);
		
		
		System.out.println("****************");
		System.out.println("od Date: "+oldDateString);
		System.out.println("new date:"+newDateString);
	}

}

