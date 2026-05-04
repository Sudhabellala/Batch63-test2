package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpMain {

	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Sudha", 25000);
		Emp e2 = new Emp(1, "Vedha", 25000);
		Emp e3 = new Emp(1, "Radha", 25000);
		Emp e4 = new Emp(1, "Vasudha", 25000);

		List<Emp> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		Map<Integer, Emp> m = new HashMap<>();
		for (Emp x : empList) {
			m.put(x.empId, x);
		}

		for (Map.Entry<Integer, Emp> entry : m.entrySet()) {
			Emp r = entry.getValue();

			System.out.println(entry.getKey() + " " + r.eName + " " + r.empSal);
		}

	}
}
