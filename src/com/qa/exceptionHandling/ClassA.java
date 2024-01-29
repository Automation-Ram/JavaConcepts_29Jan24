package com.qa.exceptionHandling;

public class ClassA {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Excp has been handled");
		} finally {
			System.out.println("Block executed");
		}

	}

}
