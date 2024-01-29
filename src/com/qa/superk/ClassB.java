package com.qa.superk;

public class ClassB extends ClassA {
	
	public void m3()
	{
		System.out.println("m3");
		super.m1();
	}

	public static void main(String[] args) {
		
		ClassB obj=new ClassB();
		obj.m3();

	}

}
