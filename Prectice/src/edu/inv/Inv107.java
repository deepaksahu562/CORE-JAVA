package edu.inv;

import java.util.*;
import java.util.stream.Collectors;

public class Inv107 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("Deepak");
		list.add("Pankaj");
		list.add("Damesh");
		list.add("Mohan");
		
		
		list.stream().filter(name -> name.startsWith("D")).forEach(System.out::println);
		
		
		
	}
	
}
