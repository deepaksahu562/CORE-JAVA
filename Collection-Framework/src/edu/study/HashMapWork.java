package edu.study;

import java.util.HashMap;
import java.util.Map;

public class HashMapWork {

	public static void main(String[] args) {
		String str = "abc";
		int h;
		final int hash = (str == null)? 0:(h = str.hashCode()) ^ (h >>> 16);
		int index = hash & (16 -1);
		System.out.println(hash+" : "+index+" : "+str.hashCode());
		
		String str1 = "abc";
		int h1;
		final int hash1 = (str1 == null)? 0:(h1 = str1.hashCode()) ^ (h1 >>> 16);
		int index1 = hash1 & (16 -1);
		System.out.println(hash1+" : "+index1+" : "+str1.hashCode());
		
		
		Map<String, Integer> map = new HashMap<>();
		map.put("FB", 1);
		map.put("Ea", 2);
		map.put("Ea", 3);
		
		System.out.println(map);		
	}

}
