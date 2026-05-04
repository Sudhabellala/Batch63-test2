package com.collectionsframework2;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestDemoQueue3 {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		
		q.offer(5);
		q.offer(4);
		q.offer(3);
		q.offer(2);
		q.offer(1);
		
		System.out.println(q);
	}

}
