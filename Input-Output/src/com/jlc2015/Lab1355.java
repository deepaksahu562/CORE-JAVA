package com.jlc2015;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab1355 {

	public static void main(String[] args) {

		try(
			FileOutputStream fos = new FileOutputStream("D:\\info.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
			Address1355 add = new Address1355("21/55", "AajResidency");
			Student1355 stu = new Student1355(99, "sri", 445353453785L, add);
			System.out.println(stu);
			Student1355.count = 9;
			System.out.println(stu);
			oos.writeObject(stu);
			System.out.println("Object Serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class Student1355 implements Externalizable{
	int sid;
	transient String name = "XXXXX0XXXX";
	long phone = 4444l;
	static int count = 3;
	Address1355 add;
	
	public Student1355() {
		// TODO Auto-generated constructor stub
	}
	
	Student1355(int sid, String name, long phone, Address1355 add) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone + ", count="+count+", \nAddress"+add+"]";
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(count);
		out.writeObject(name);
		out.writeObject(add.aid);
		out.writeObject(add.street);
		
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		count = in.readInt();
		name = in.readObject().toString();
		add = new Address1355();
		add.aid = in.readObject().toString();
		add.street = in.readObject().toString();
	}
}

class Address1355{
	String aid;
	String street;
	
	public Address1355() {
		// TODO Auto-generated constructor stub
	}
	
	Address1355(String aid, String street) {
		this.aid = aid;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address1354 [aid=" + aid + ", street=" + street + "]";
	}
	
	
}

