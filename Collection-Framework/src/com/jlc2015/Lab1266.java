package com.jlc2015;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Lab1266 {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(new Student(99));
		set.add(new Student(91));
		set.add(new Student(99));
		set.add(new Student(92));
		set.add(new Student(99));
		set.add(new Student(92));
		System.out.println(set);
		//System.out.println((new Student(99)).hashCode()+" : "+(new Student(97)).hashCode());
	}

}
class Student{
	int sid;
	public Student(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return ""+sid;
	}
	
	@Override
	public int hashCode() {
		System.out.println("--- hashCode() -----");
		return sid;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(" ****** equals() *******");
		if (obj instanceof Student) {
			Student st = (Student)obj;
			return this.sid == st.sid;
		}
		return false;
	}
}
