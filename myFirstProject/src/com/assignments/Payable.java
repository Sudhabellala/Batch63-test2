package com.assignments;

public interface Payable {
	public void makePayment(double amount);
	default void rewardPoints(double totalpoint) {
		if(totalpoint<5000) {
			System.out.println("your eligable for rewardPoints");
		}else {
			System.out.println("your not eligable");
		}
	}
}
