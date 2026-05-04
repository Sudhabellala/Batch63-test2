package com.collectoionsframework;

//import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCollectionDemo16 {

	public static void main(String[] args) {
		
		List<Integer> l=new CopyOnWriteArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		for(Integer i:l) {
			System.out.println(i+" ");
			l.add(60);
		}
	}

}
