package src.com.jlc2015;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab1352 {

	public static void main(String[] args)throws Exception {

		try(
			FileOutputStream fos = new FileOutputStream("D:\\info.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
			Student1352 stu = new Student1352(99, "sri", 445353453785L);
			System.out.println(stu);
			Student1352.count = 9;
			System.out.println(stu);
			oos.writeObject(stu);
			System.out.println("Object Serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

//class Person1352 implements Serializable{
class Person1352{
	String name = "XXXXX";
	long phone;
}


class Student1352 extends Person1352 implements Serializable{
	int sid;
	static int count = 3;
	
	Student1352(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone + ", count="+count+"]";
	}
	
}