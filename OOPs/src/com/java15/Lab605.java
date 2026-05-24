package src.com.java15;

public class Lab605 {

	public static void main(String[] args) {

		Student605 stu1 = new Student605(88, "hareram");
		stu1.show();
	}
}


class Student605{
	int sid;
	String sname;
	
	Student605(int sid, String sname) {
		System.out.println("student-2 arg Cons");
		sid = sid;
		sname = sname;
	}
	
	void show(){
		System.out.println(sid+"\t"+sname);
	}
}