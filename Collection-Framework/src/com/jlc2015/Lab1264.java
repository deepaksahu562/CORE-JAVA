package com.jlc2015;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Lab1264 {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();

		set.add(new Integer(12));
		set.add(new Integer(12));
		set.add(new Long(12));
		set.add(new Byte((byte) 12));
		System.out.println(set);
		
	}
}