package com.collectoionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo17 {

	public static void main(String[] args) {
		Employee emp1=new Employee(1, "Sudha", 24, 40000.00);
		Employee emp2=new Employee(2, "Kalyani", 22, 40000.00);
		Employee emp3=new Employee(3, "Vedha", 20, 40000.00);
		Employee emp4=new Employee(4, "Rupa", 22, 40000.00);
		Employee emp5=new Employee(5, "Varshitha", 22, 40000.00);
		
		List<Employee> empList=new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		for(Employee emp:empList) {
			System.out.println(emp);
		}
	}

}
