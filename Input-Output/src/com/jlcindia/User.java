package src.com.jlcindia;

import java.io.Serializable;

public class User extends Person implements Serializable{

	String uname;
	transient String pwd="XXXXXX";
	
	User(){
		System.out.println("------ User() Cons-*--");
	}
	
	User(int age,String name,String uname,String pwd){
		super(age,name);
		this.uname=uname;
		this.pwd=pwd;
		System.out.println("-----User(int,String,Stirng) Cons-*-----");
	}
}

