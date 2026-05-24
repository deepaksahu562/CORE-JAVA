package com.jlcindia;

public class Student extends User{

	int sid;
	transient long phone=999999;
	transient Address studAdd=new Address();
	BatchDetails batch=new BatchDetails();
	static BranchInfo branch;
	public Student(int age,String name,String uname,String pwd,int sid,long phone) {
		super(age,name,uname,pwd);
		this.sid=sid;
		this.phone=phone;
		System.out.println("*** Student(Param) *Cons **");
	}
	
	public String toString(){
		String str="Age\t:"+age+"\nName\t:"+name+"\nUname\t:"+uname+"\nPswrd\t:"+pwd+"\nSid\t:"+sid+"\nPhone\t:"+phone+"\nBranch\t:"+branch+"\nAddress\t:"+studAdd+"\nBatch\t:"+batch;
		return str;
	}
	
}
