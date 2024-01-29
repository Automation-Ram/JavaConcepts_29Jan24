package com.qa.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLtProg {

	public static void main(String[] args) {

		Employee emp1 = new Employee(111, "Ram", "Thoughtswork");
		Employee emp2 = new Employee(112, "Rakesh", "PlantIT");

		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(emp1);
		ar.add(emp2);

		Iterator<Employee> it = ar.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.id + " " + e.name + " " + e.comName);
		}

	}

}
