package src.com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class FileContainCount2 {

	public static void main(String[] args) {
		String str = "ashish jain is is good good boy";
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		while (st.hasMoreElements()) {
			String str1 = (String) st.nextElement();
			
			if( hm.containsKey(str1))
			{
				int mm = hm.get(str1);
				hm.put(str1, ++mm);
			}
			else
			{
				hm.put(str1, 1);
			}
		}
		
		Set ss = hm.keySet();
		Iterator<String> it = ss.iterator();
		
		while (it.hasNext()) {
			String type = (String) it.next();
			int mm = hm.get(type);
			System.out.println(type+"-"+mm);
			
		}

	}

}
