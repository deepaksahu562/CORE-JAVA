package src.com.jlc2015;

public class Lab1178 {

	public static void main(String[] args) {

		//Immutable object
		Student1178  stu = new Student1178(101, "Ranvijay", 9876543210l);
		System.out.println(stu);
		
		//Mutable object
		Employee1178  emp = new Employee1178(101, "Ranvijay", 9876543210l);
		System.out.println(emp);
	}
}

final class Student1178{
	
	private final int sid;
	private final String name;
	private final long phone;
	
	public Student1178(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Student1178 [sid=" + sid + ", name=" + name + ", phone=" + phone + "]";
	}
	
}

class Employee1178{
	private int sid;
	private String name;
	private long phone;
	
	public Employee1178(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Employee1178 [sid=" + sid + ", name=" + name + ", phone=" + phone + "]";
	}
	
}
