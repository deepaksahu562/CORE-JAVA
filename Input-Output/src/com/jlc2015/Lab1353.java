package com.jlc2015;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab1353 {

	public static void main(String[] args) {

		try(
			FileOutputStream fos = new FileOutputStream("D:\\info.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
			Student1353 stu = new Student1353(99, "sri", 445353453785L);
			System.out.println(stu);
			Student1353.count = 9;
			System.out.println(stu);
			oos.writeObject(stu);
			System.out.println("Object Serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class Student1353 implements Serializable{
	int sid;
	transient String name = "XXXXX0XXXX";
	long phone = 4444l;
	static int count = 3;
	
	Student1353(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone + ", count="+count+"]";
	}
	
}