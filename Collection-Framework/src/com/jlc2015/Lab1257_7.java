package com.jlc2015;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Lab1257_7 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		//Map<String, String> map = new LinkedHashMap<String, String>();
		//Map<String, String> map = new TreeMap<String, String>();
		map.put("nmae", "Deepak");
		map.put("eid", "101");
		map.put("city", "pune");
		map.put("phone", "7874834");

		Set<Map. Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			//System.out.println(it.next());
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
}
