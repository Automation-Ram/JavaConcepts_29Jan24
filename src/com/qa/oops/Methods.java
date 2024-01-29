package com.qa.oops;

public class Methods {

	public void method1() {
		System.out.println("The method 1");
	}

	public static void method2() {
		System.out.println("The method 2");
	}

	public static void main(String[] args) {

		Methods obj = new Methods();
		obj.method1();
		Methods.method2();

	}

}
