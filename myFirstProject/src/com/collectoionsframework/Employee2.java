package com.collectoionsframework;

public class Employee2 implements Comparable<Employee2> {

	int empId;
	String empName;
	int empAge;
	double empSalary;

	public Employee2(int empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
	
	public String toString() {
		return empId+"-"+empName+"-"+empAge+"-"+empSalary;
	}
	@Override
	public int compareTo(Employee2 o) {

//		if(this.empId<o.empId) {
//			return -1;
//		}
//		if(this.empId>o.empId) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
		
		return -(o.empName.compareTo(this.empName));	
		
	}
}
