package com.Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int eid;
	String ename;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
}

public class TestJ8Demo7 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Srikanth");
		Employee e2 = new Employee(70, "Abhishek");
		Employee e3 = new Employee(45, "Rohit");
		Employee e4 = new Employee(18, "Virat");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

//		Comparator<Employee> c = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				if (o1.eid < o2.eid) {
//					return -1;
//				} else if (o1.eid > o2.eid) {
//					return 1;
//				} else {
//					return 0;
//				}
//			}
//
//		};

		Comparator<Employee> c = (o1, o2) -> (o1.eid < o2.eid) ? 1 : (o1.eid > o2.eid) ? -1 : 0;

		Collections.sort(empList, c);
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}

}
