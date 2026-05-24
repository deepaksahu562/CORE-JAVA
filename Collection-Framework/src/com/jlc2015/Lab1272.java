package com.jlc2015;

import java.util.TreeSet;

public class Lab1272 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Employee1272(121, "Deepak"));
		ts.add(new Employee1272(128, "Rahul"));
		ts.add(new Employee1272(124, "Ajay"));
		ts.add(new Employee1272(129, "Ajay"));
		ts.add(new Employee1272(123, "Ajay"));
		ts.add(new Employee1272(126, "Kunal"));
		
		System.out.println(ts);
		
	}
}

class Employee1272 implements Comparable{
	int sid;
	String name;
	
	public Employee1272(int sid, String name) {
		//System.out.println("Employee1272()");
		this.sid = sid;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		if (o instanceof Employee1272) {
			Employee1272 emp = (Employee1272)o;
			System.out.println("compareTo : "+emp.sid+" & "+this.sid+" & "+ (this.sid - emp.sid));
			//return this.sid - emp.sid;
			return emp.sid - this.sid;
			//return this.name.compareTo(emp.name);
			//return emp.name.compareTo(this.name);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Sid :"+this.sid+" - Name :"+this.name+"\n";
	}
}