package com.basic;

public class Employee {
	String Ename;
	int sal;
	int bonus;//10% of 5000
	int annual_bonus;
	int annual_salary;
	int total;
	
	{
		
		Ename="King";
		sal=5000;
		bonus=(10*sal)/100;//10% of 5000
		annual_bonus=12*bonus;
		annual_salary=sal*12;
		total=annual_bonus+ annual_salary;
		
		System.out.println("Employee Name: "+Ename);
		System.out.println("Salary: "+sal);
		System.out.println("Bonus: "+bonus);
		System.out.println("Annual Bonus: "+annual_bonus);
		System.out.println("Annual Salary: "+annual_salary);
		System.out.println("Total: "+total);
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		
		
	}
	

}
