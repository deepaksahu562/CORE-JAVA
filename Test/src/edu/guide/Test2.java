package src.edu.guide;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		
		/*String str = "This is java example. This example count the number of words in string";
		
		String [] strArr = str.split(" ");
		
		List list = Arrays.asList(strArr);
		
		//HashSet<String> set = new HashSet<>();
		
		//list.stream().collect(Collectors.toMap(Function, valueMapper, mergeFunction)
		
		Iterator<String> it = list.iterator();*/
		show();
		
			
	}
	
	static void show(){
		
		Integer [] intArray =  {445, 655, 878, 534, 745, 563};
		
		for (Integer integer : intArray) {
			
			String value = String.valueOf(integer);
			
			if(value.startsWith("5")){
				System.out.println(value);
			}
			
		}
		
	}
	
	
	
}
