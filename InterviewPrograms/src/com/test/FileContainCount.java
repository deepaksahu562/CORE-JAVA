package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class FileContainCount {

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
		StringTokenizer st = new StringTokenizer(string," ");
		//StringBuilder sbr = new StringBuilder("");
		Map<String, String> map = new HashMap<String,String>();
		while (st.hasMoreElements()) {
			String strg = (String) st.nextElement();
			map.put(strg, strg);
			
			Set data =  map.entrySet();
			Iterator it = data.iterator();
			while (it.hasNext()) {
				Object obj = (Object) it.next();
				Map.Entry<String, String> entry = (Map.Entry<String, String>)obj;
				Object key = entry.getKey();
				Object value = entry.getValue();
				System.out.println(key+"\t:\t"+value);
			}
			
			//out.append(strg);
		}
		//System.out.println(sbr);
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