package src.com.jlc2015;


public class Lab1002 {

	public static void main(String[] args) {

		Student1002 st1 = new Student1002(99, 23232333);
		Student1002 st2 = new Student1002(99, 23232333);
		Student1002 st3 = new Student1002(88, 55665533);
		Student1002 st4 = st1;
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		
		System.out.println(st1 == st2);
		System.out.println(st1 == st4);

		System.out.println("========");
		System.out.println(st2);
	}

}

class Student1002{
	int sid;
	long phone;

	public Student1002(int sid, long phone) {
		this.sid = sid;
		this.phone = phone;
	}
	
	@Override
	public int hashCode() {
		return (int)(phone | sid);
	}

	/*@Override
	public String toString() {
		return "Student1002{" +
				"sid=" + sid +
				", phone=" + phone +
				'}';
	}*/
}
