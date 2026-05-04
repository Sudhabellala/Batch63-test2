package com.multithreading;

class JThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("JThread1 started ");
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			System.out.println("j1 : " + i);
			sum = sum + i;
		}
		System.out.println("JThread1 ended: " + sum);
	}
}

class JThread2 extends Thread {

	JThread3 j3;

	JThread2(JThread3 j3) {
		this.j3 = j3;
	}

	@Override
	public void run() {
		System.out.println("JThread2 started ");
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			if (i == 75) {
				try {
					j3.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("j2 : " + i);
			sum = sum + i;
		}
		System.out.println("JThread2 ended: " + sum);
	}
}

class JThread3 extends Thread {
	@Override
	public void run() {
		System.out.println("JThread3 started ");
		int sum = 0;
		for (int i = 100; i <= 150; i++) {
			System.out.println("j3 : " + i);
			sum = sum + i;
		}
		System.out.println("JThread3 ended: " + sum);
	}
}

public class ThreadJoinDemo {

	public static void main(String[] args) {
		System.out.println("main method started ");

		JThread1 j1 = new JThread1();
		JThread3 j3 = new JThread3();
		JThread2 j2 = new JThread2(j3);

		j1.start();
		j2.start();
		j3.start();
		
	}

}
