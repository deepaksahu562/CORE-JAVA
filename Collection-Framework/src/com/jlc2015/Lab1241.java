package com.jlc2015;

import java.util.Vector;

public class Lab1241 {

	public static void main(String[] args) {
		Vector v = new Vector();
		Student1241 stu = new Student1241(11);
		Student1241 stu1 = new Student1241(12);
		Student1241 stu2 = new Student1241(15);
		Student1241 stu3 = new Student1241(14);
		Student1241 stu4 = new Student1241(14);
		v.addElement(stu);
		v.addElement(stu1);
		v.addElement(stu2);
		v.addElement(stu3);
		System.out.println(v.contains(stu4));
	}
}

class Student1241{
	int sid;
	Student1241(int sid) {
		this.sid = sid;
	}
	public String toString(){
		return ""+sid;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("**equals()***");
		if (obj instanceof Student1241) {
			Student1241 st = (Student1241) obj;
			return st.sid == this.sid;
		}
		return false;
	}
}