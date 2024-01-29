package com.qa.interfaces;

public class ClassB implements ClassA {

	@Override
	public void m1() {
		System.out.println("m1");

	}

	@Override
	public void m2() {
		System.out.println("m2");

	}

	public void m3() {
		System.out.println("m3");
	}

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.m1();
		obj.m2();
		obj.m3();
	}

}
