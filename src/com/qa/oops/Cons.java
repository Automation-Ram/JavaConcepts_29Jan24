package com.qa.oops;

public class Cons {

	int id;
	String name;

	public Cons(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id + " " + name);

	}

	public static void main(String[] args) {
		Cons obj = new Cons(121, "Ram");
		obj.display();
	}

}
