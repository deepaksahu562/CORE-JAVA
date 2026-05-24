package com.test;

public class StrRev_Char {
	 public static void main(String arg[]) {
	  String s = "ABCDE";
	  StringBuilder sb = new StringBuilder();
	  for (int index = s.length()-1; index >= 0; index--) {
	   sb.append(s.charAt(index));
	  }
	  System.out.println(s);
	  System.out.println(sb);
	  
	  // with method
	  StringBuffer sb1=new StringBuffer("ABC");
	  System.out.println(sb1);
	  StringBuffer sb2=sb1.reverse();
	  System.out.println(sb2);
	 }
}