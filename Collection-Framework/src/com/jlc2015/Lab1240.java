package com.jlc2015;

import java.util.Vector;

public class Lab1240 {

	public static void main(String[] args) {
		Vector v = new Vector();
		Student1240 stu = new Student1240(14);
		v.addElement(stu);
		System.out.println(v);
		System.out.println(v.contains(new Student1240(14)));
	}
}

class Student1240{
	int sid;
	Student1240(int sid) {
		this.sid = sid;
	}
	public String toString(){
		return ""+sid;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("**equals()***");
		return super.equals(obj);
	}
}