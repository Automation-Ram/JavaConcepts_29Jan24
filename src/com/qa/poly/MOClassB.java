package com.qa.poly;

public class MOClassB extends MOClassA{
	
	public void m3()
	{
		System.out.println("m3");
	}

	public static void main(String[] args) {
		
		MOClassB obj=new MOClassB();
		obj.m1();
		obj.m1(12, 12);
		obj.m3();

	}

}
