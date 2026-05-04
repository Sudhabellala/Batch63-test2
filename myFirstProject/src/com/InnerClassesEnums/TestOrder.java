package com.InnerClassesEnums;

enum OrderStatus {
	PLACED, SHIPPED, DELIVERED, CANCELLED
}

public class TestOrder {

//	Cannot instantiate the type OrderStatus
	OrderStatus status;

	public TestOrder(OrderStatus status) {
		this.status = status;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");

		TestOrder t1 = new TestOrder(OrderStatus.PLACED);
	}

	void show() {
		System.out.println("Order Current Status: " + status);
	}

}
