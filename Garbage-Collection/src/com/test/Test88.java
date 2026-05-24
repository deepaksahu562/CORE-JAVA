package src.com.test;

public class Test88 {

	public static void main(String[] args)throws Exception {

		Student s1=new Student(101,"deep","blr",98989);
		Student s2=new Student(102,"rahul","hyd",98989);
		Student s3=new Student(103,"pankaj","ind",98989);
		Student s4=new Student(104,"ramesh","bhopal",98989);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("-------------- 1 -----------------");
		
		//System.runFinalization();
		System.gc();
		
		s1=s2;
		
		//System.runFinalization();
		System.gc();
		System.out.println("-------------- 2 -----------------");
				
		s3=null;
		System.out.println("-------------- 3 -----------------");
		s4=new Student();
		System.out.println("-------------- 4 -----------------");
		m1();
		System.out.println("-------------- 5 -----------------");
		
		System.out.println("++++++");
		System.runFinalization();
		System.out.println("++++++");
		
		System.gc();
		try {
			System.out.println("===");
			new Student().finalize();
			System.out.println("===");
		} catch (Throwable e) {
	
			e.printStackTrace();
		}
		System.out.println("-------------- 6 -----------------");
				
		
	}
	
	static void m1(){
		Student s1=new Student();
		Student s2=new Student();
	}

}
