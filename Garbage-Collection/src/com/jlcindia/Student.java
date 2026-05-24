package com.jlcindia;

import java.sql.Connection;

final class Student {

	int sid;
	private Connection con=null;
	
	Student(int sid){
		this.sid=sid;
		System.out.println("----- Connection with Resource--\t:"+sid);
	}
	void addInfo(){
		
	}
	void deleteInfo(){
		
	}
	public void finalize(){
		System.out.println("**** Resource is RELEASED **\t:"+sid);
	}
}
