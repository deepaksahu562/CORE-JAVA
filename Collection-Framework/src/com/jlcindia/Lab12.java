package com.jlcindia;

import java.util.StringTokenizer;

public class Lab12 {

	public static void main(String[] args) {
		
		String str="Welcome to java learning center to leanrn java and advance java";
		
		StringTokenizer token=new StringTokenizer(str);
		System.out.println(token.hasMoreTokens());
		System.out.println(token.countTokens());
		
		 while(token.hasMoreTokens()){
			 String str1=token.nextToken();
			 System.out.println(str1);
		 }
		 System.out.println("--------------");
		 System.out.println(token.hasMoreTokens());
		 System.out.println(token.countTokens());
		
		 System.out.println("++++++++++++++++");
		 StringTokenizer token1=new StringTokenizer(str,"ja");
		 System.out.println(token1.hasMoreTokens());
		 System.out.println(token1.countTokens());
		 System.out.println("___________---------_______-");
		 while(token1.hasMoreTokens()){
			 Object obj=token1.nextElement();
			 System.out.println(obj);
		 } 
		 System.out.println();
	}
}
