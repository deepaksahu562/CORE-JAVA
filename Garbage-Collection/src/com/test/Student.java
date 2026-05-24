package com.test;

public class Student {

	int sid;
	String name;
	String city;
	int conct;
	public Student(){}
	public Student(int sid, String name, String city, int conct) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.conct = conct;
	}
	
	protected void finalize() throws Throwable {
		System.out.println("***** resource close ******");
	}
	
	public String toString() {
		String str="";
		str=""+sid+"\t"+name+"\t"+city+"\t"+conct;
		return str;
	}
	
}
