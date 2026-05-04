package com.assignments;

class Thread1 extends Thread {

	Thread3 t3;

	Thread1(Thread3 t3) {
		this.t3 = t3;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 20; i++) {
			System.out.println("thread 1");
			if (i == 3) {
				try {
					System.out.println("joined with t3");
					t3.join();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println("thread2 ");
		}
	}

}

class Thread3 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 19; i++) {
			sum = sum + i;
			System.out.println("thread3");

		}
	}
}

public class ThreadJoin {

	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		Thread1 t1 = new Thread1(t3);
		Thread2 t2 = new Thread2();
		
		t1.start();
		t3.start();
	}
}
