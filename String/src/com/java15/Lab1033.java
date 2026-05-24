package src.com.java15;

public class Lab1033 {

	public static void main(String[] args) {
	Student stu = new Student();
	System.out.println(stu.toString());
	String str1 = String.valueOf(stu);
	System.out.println(str1);
	
	Employee emp = new Employee();
	String str2 = String.valueOf(emp);
	System.out.println(str2);
	}

}

class Student{}
class Employee{
	int eid = 101;
	public String toString(){
		return "Eid	:"+eid;
	}
}
