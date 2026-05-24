package src.com.jlc2015;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab1350 {

	public static void main(String[] args)throws Exception {

		try(
			FileOutputStream fos = new FileOutputStream("D:\\info.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
			Student1350 stu = new Student1350(99, "sri", 445353453785L);
			System.out.println(stu);
			Student1350.count = 9;
			stu.zip = 88888;
			System.out.println(stu);
			oos.writeObject(stu);
			System.out.println("Object Serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Student1350 implements Serializable{
	int sid;
	String name;
	long phone;
	int zip = 4545;
	static int count = 3;
	
	Student1350(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", zip=" + zip +  ", phone=" + phone + ", count="+count+"]";
	}
	
}