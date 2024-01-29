package com.qa.inherit;

public class ClassB extends ClassA{
	
	public void method2()
	{
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		
		ClassB obj=new ClassB();
		obj.method1();
		obj.method2();
	}

}
