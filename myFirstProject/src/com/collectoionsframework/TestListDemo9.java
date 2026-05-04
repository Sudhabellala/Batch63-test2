package com.collectoionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo9 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(0,45);
		l.add(1,18);
		l.add(7);
		l.add(2,10);
		//l.add(5,15);
		l.add(1,1);
		//l.add(10,8);
		System.out.println(l);
	}

}
