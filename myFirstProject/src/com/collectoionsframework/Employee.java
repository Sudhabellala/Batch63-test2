package com.collectoionsframework;

public class Employee implements Comparable<Employee> {

	int empId;
	String empName;
	int empAge;
	double empSalary;

	public Employee(int empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
