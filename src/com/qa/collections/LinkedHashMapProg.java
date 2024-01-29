package com.qa.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapProg {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "Raju");
		lhm.put(2, "Deva");
		for (Map.Entry m : lhm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
