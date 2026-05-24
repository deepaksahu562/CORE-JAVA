package com.java15;

abstract interface Ramram{
	
	int A = 20;
	void show();
}

public class Lab911 {

	public static void main(String[] args) {
		
		Person pob = null;
		pob = new Student();
		pob.eating();
		pob.walking();
		pob.sleeping();
		//pob.reading();
		
		Student stu = (Student)pob;
		stu.reading();
		
		//Employee emp = (Employee)pob; //class cast exception

		pob = new Employee();
		pob.eating();
		pob.walking();
		pob.sleeping();
		//pob.working();
		
		Employee emp = (Employee)pob;
		emp.working();
	}

}

class Person {

	void eating(){
		System.out.println("Person - eating");
	}
	
	void walking(){
		System.out.println("Person - walking");
	}
	
	static void sleeping(){
		System.out.println("Person - sleeping");
	}
}

class Employee extends Person{

	void working(){
		System.out.println("Employee - working");
	}
	
	void walking(){
		System.out.println("Employee - walking");
	}
	
	static void sleeping(){
		System.out.println("Employee - sleeping");
	}
}

class Student extends Person{

	void reading(){
		System.out.println("Student - reading");
	}
	
	void walking(){
		System.out.println("Student - walking");
	}
	
	static void sleeping(){
		System.out.println("Student - sleeping");
	}
}

