package com.jlcindia;

public class Person {

	 int age;
	String name="XXXX";
	Person(){
		System.out.println("--- Person() Cons -----");
	}
	Person(int age,String name){
		this.age=age;
		this.name=name;
		System.out.println("----- Person(int,String) Cons ----");
	}
}

