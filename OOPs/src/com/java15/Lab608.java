package src.com.java15;

public class Lab608 {

	public static void main(String[] args) {

		Student605 stu1 = new Student605(88, "hareram");
		stu1.show();
	}
}


class Student608{
	int sid;
	String sname;
	
	Student608(){
		System.out.println("student- Default Cons");
	}
	
	Student608(int sid, String sname) {
		this();
		//Student608();
		System.out.println("student-2 arg Cons");
		
	}
	
	void show(){
		System.out.println(sid+"\t"+sname);
	}
}