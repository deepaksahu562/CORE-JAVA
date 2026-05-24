package src.com.jlc2015;

import java.util.Vector;

public class Lab1239 {

	public static void main(String[] args) {
		Vector v = new Vector();
		Student1239 stu = new Student1239(12);
		v.addElement(stu);
		System.out.println(v);
		stu.sid = 15;
		System.out.println(v);
	}
}

class Student1239{
	int sid;
	Student1239(int sid) {
		this.sid = sid;
	}
	public String toString(){
		return ""+sid;
	}
}
