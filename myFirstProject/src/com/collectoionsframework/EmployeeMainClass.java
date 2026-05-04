package com.collectoionsframework;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;

public class EmployeeMainClass {

	public static void main(String[] args) {
		Employee2 emp1=new Employee2(1, "Sudha", 24, 40000.00);
		Employee2 emp2=new Employee2(2, "Kalyani", 22, 40000.00);
		Employee2 emp3=new Employee2(3, "Vedha", 20, 40000.00);
		Employee2 emp4=new Employee2(4, "Rupa", 22, 40000.00);
		Employee2 emp5=new Employee2(5, "Varshitha", 22, 40000.00);
		
		List<Employee2> empList=new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		Collections.sort(empList);
							
		System.out.println(empList);
		
//		for(Employee2 emp:empList) {
//			System.out.println(emp);
//		}
	}

}
