package com.jlcindia;

public class Lab4 {

	public static void main(String[] args) {
	System.out.println("--- In Main ----");
	new Student(99);
	Student st=new Student(88);
	st.finalize();
	//System.gc();
	
	System.out.println("++++++++++++++++++++++");
	
	System.out.println("Value of sid\t:"+st.sid);
	st=null;
	Student st1=new Student(77);
	st1=new Student(66);
	System.out.println("==================");
	
	Student st2=new Student(55);
	Student st3=new Student(44);
	st2=st3;
	System.gc();
	
	System.out.println("####################");
	
	for(int i=0;i<5;i++){
		System.out.println("I value\t:"+i);
	}
	
	Student st99=new Student(33);
	System.gc();
	System.out.println("--- Main End ----");
	

	}
	static void show(){
		Student stud1=new Student(101);
		Student stud2=new Student(202);
	}

}
