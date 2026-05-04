package com.collectionsframework2;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Queue<Integer> q=new LinkedList<>();
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(10);
		q.add(20);
		
		
		System.out.println(q.remove());
		System.out.println(q.element());
		System.out.println(q);
		
	}

}
