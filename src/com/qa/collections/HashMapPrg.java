package com.qa.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrg {

	public static void main(String[] args) {

		Employee emp1 = new Employee(111, "Ram", "Thoughtswork");
		Employee emp2 = new Employee(112, "Rakesh", "PlantIT");

		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		hm.put(1, emp2);
		hm.put(2, emp2);

		for (Map.Entry<Integer, Employee> entry : hm.entrySet()) {
			int key = entry.getKey();
			Employee e = entry.getValue();
			System.out.println(key + "Num:");
			System.out.println(e.id + " " + e.name + " " + e.comName);
		}
	}

}
