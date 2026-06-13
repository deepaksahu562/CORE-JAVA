package src.com.jlc2015;


import java.util.Arrays;

public class Lab1001 {

	public static void main(String[] args) {

		Student1001 st1 = new Student1001(99, 23232333);
		Student1001 st2 = new Student1001(99, 23232333);
		Student1001 st3 = new Student1001(88, 55665533);
		Student1001 st4 = st1;
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(st4.toString());
		
		System.out.println(st1 == st2);
		System.out.println(st1 == st4);

		System.out.println("===================");

		Class<? extends Student1001> aClass = st1.getClass();
		System.out.println(aClass);
		System.out.println(aClass.getName());
		System.out.println(Arrays.toString(aClass.getDeclaredMethods()));
		System.out.println(aClass.getCanonicalName());
		System.out.println(Arrays.toString(aClass.getConstructors()));
	}

}

class Student1001{
	int sid;
	long phone;

	public Student1001(int sid, long phone) {
		super();
		this.sid = sid;
		this.phone = phone;
	}

}
