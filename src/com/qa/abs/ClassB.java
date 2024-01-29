package com.qa.abs;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.m1();
		obj.m2();

	}

	@Override
	void m1() {
		System.out.println("m1");

	}

}
