package com.java15;

public class Test2 {
	public static void main(String[] args) {
		String str1 = "india";
		System.out.println(str1.hashCode());
		str1 = str1+"delhi";
		System.out.println(str1.hashCode());
		
		StringBuffer sb = new StringBuffer("indore");
		System.out.println(sb+"\n Capacity:"+sb.capacity()+"\n Length:"+sb.length());
		
		sb.append("mp");
		System.out.println(sb+"\n Capacity:"+sb.capacity()+"\n Length:"+sb.length());
		
		sb.setLength(3);
		System.out.println(sb+"\n Capacity:"+sb.capacity()+"\n Length:"+sb.length());
		
		sb.trimToSize();
		System.out.println(sb+"\n Capacity:"+sb.capacity()+"\n Length:"+sb.length());
	}
}
