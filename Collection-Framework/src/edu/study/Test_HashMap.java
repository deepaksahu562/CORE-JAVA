package src.edu.study;

import java.util.*;

public class Test_HashMap {
	public static void main(String[] args) {
		LinkedHashMap hm = new LinkedHashMap();
		hm.put("id", 101);
		hm.put("name", "Deepak");
		hm.put("phone", 9407064730L);
		hm.put("city", "pune");
		hm.put("state", "Maharashtra");
		System.out.println(hm);

		Set key = hm.keySet();
		Iterator it = key.iterator();
		
		System.out.println("------- Key --------");
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}

		System.out.println("------- Value --------");
		Collection col = hm.values();
		Iterator it1 = col.iterator();
		while (it1.hasNext()) {
			Object object = (Object) it1.next();
			System.out.println(object);
			
		}
		
		System.out.println("----- key Value -------");
		Set data = hm.entrySet();
		Iterator it2  = data.iterator();
		while (it2.hasNext()) {
			/*Object object = (Object) it2.next();
			Map.Entry entry = (Map.Entry)object;
			System.out.println(entry.getKey()+"\t"+entry.getValue());*/
			//System.out.println(it2.next());
		}

	}
}
