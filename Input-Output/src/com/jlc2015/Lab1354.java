package com.jlc2015;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab1354 {

	public static void main(String[] args) {

		try(
			FileOutputStream fos = new FileOutputStream("D:\\info.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
			Address1354 add = new Address1354("21/55", "AajResidency");
			Student1354 stu = new Student1354(99, "sri", 445353453785L, add);
			System.out.println(stu);
			Student1354.count = 9;
			System.out.println(stu);
			oos.writeObject(stu);
			System.out.println("Object Serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class Student1354 implements Serializable{
	int sid;
	transient String name = "XXXXX0XXXX";
	long phone = 4444l;
	static int count = 3;
	Address1354 add;
	Student1354(int sid, String name, long phone, Address1354 add) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone + ", count="+count+", \nAddress"+add+"]";
	}
}

class Address1354  implements Serializable{
	String aid;
	String street;
	Address1354(String aid, String street) {
		this.aid = aid;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address1354 [aid=" + aid + ", street=" + street + "]";
	}
	
	
}

