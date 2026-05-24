package src.com.collection;

import java.util.*;

public class TestG {

	public static void main(String[] args) {

		TreeSet<String> ts=new TreeSet<String>();
		ts.add("bb");
		ts.add("aa");
		ts.add("cc");
		
		boolean b=ts.add("cc");
		System.out.println(b);
		//ts.add(null);
		System.out.println(ts);
		
		
		
	}

}
