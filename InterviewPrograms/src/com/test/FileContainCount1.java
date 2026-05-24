package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class FileContainCount1 {

	public static void main(String[] args)throws Exception{
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter out = null;
		try{
		fr = new FileReader("D:/temp.txt");
		br = new BufferedReader(fr,1024);
		out = new FileWriter("D:/test.txt");
		StringBuilder sb = new StringBuilder("");
		int ch;
		char cha;
		String str = null;
		while((ch=br.read())!=-1){
			cha = ((char)ch);
			sb.append(cha);
			
		}
		String string = sb.toString();

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		StringTokenizer st = new StringTokenizer(string, " ");
		
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
			out.write(type+"\t\t"+mm);
			
		}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			br.close();
			fr.close();
			out.close();
		}
	}

}
/*
int ch;
char cha;
String str = null;
while((ch=br.read())!=-1){
	cha = ((char)ch);
	out.append(cha);
}
*/
