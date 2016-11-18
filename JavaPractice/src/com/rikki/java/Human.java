package com.rikki.java;

public class Human {	//extends Object (implicitly)

	int age;
	String name;
	String birthDate;
	
	public Human() {
		super();
		System.out.println("Making a human");
	}

	public Human(int age, String name) {
		this();	//constructor chaining
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Human h= new Human(10, "Dan");
		System.out.println(h);
	}
}