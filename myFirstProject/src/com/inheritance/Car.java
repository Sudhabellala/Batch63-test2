package com.inheritance;

class Vehicle {
	String brand;
	int speed;
}
public class Car extends Vehicle {
	String fuelType;
	
	public Car(String brand,int speed,String fuelType) {
		super();
		this.fuelType = fuelType;
		this.brand=brand;
		this.speed=speed;
	}

	public static void main(String[] args) {
		Car c=new Car("Kia",120,"petrol");
		System.out.println(c.brand);
		System.out.println(c.speed);
		System.out.println(c.fuelType);
	}
}
