package com.encapsulation;

public class Employee {
	private int eid;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private int age;
	private double salary;
	
	void setEid(int eid) {
		this.eid=eid;
	}
	int getEid() {
		return eid;
	}
	
	void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	String getFirstName() {
		return firstName;
	}

}
