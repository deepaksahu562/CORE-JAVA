package com.jlc2015;


public class Lab1007 {

	public static void main(String[] args) {

		Student1007 st1 = new Student1007(99, 23232333);
		Student1007 st2 = new Student1007(99, 23232333);
		Student1007 st3 = new Student1007(88, 55665533);
		Student1007 st4 = st1;
		
		System.out.println("------hashCode()------");
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		
		System.out.println("------using = oprt ----");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st2 == st3);
		
		System.out.println("------using equals()---");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));
	}

}

class Student1007{
	int sid;
	long phone;

	public Student1007(int sid, long phone) {
		super();
		this.sid = sid;
		this.phone = phone;
	}

	/*	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student1007) {
			Student1007 stu = (Student1007) obj;
			return stu.sid ==  this.sid && stu.phone ==  this.phone;
		}
		return false;
	}*/
}
