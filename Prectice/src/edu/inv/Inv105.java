package src.edu.inv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

public class Inv105 {

	public static void main(String[] args) {
		
		
		
		String [] str1 = {"abc", "xxy", "ikj"};
		String [] str2 = {"jbc", "exy", "akj"};

			
		List list1 = Arrays.asList(str1);
		List list2 = Arrays.asList(str2);
		
		List newList = new ArrayList<>();
		
		Iterator it1 = list1.iterator();
		while(it1.hasNext()){
			newList.add(it1.next());
		}
		
		Iterator it2 = list2.iterator();
		while(it2.hasNext()){
			newList.add(it2.next());
		}
		
		

		TreeSet set = new TreeSet();
		set.iterator();
		
		
		
		
		/*
		
		List list = new ArrayList();
		Function f = (j)-> {
							int prVl = 1;
							for(int i = 0; i<=j; i++){
								prVl = prVl + i;
								list.add(prVl);
							}
							return list;
							};
							
		List newList = f.applay(10);

		newList.stream().forEach(System.out::println);
	*/}
}
