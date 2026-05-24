package src.edu.java.string;

import java.util.HashSet;
import java.util.Set;

public class StringCombination {

	public static void main(String[] args) {
		
		String[] argss = { "hello" };
		Set<String> set = new HashSet<>();
		
		for (String input : argss) {
			char[] charArray = input.toCharArray();
			
			for (int j = 0; j < charArray.length; j++) {
				String newStr = String.valueOf(charArray[j]);
				for (int i = 0; i < charArray.length; i++) {
					if (j == i) {
						// ignore
					} else {
						newStr = newStr.concat(String.valueOf(charArray[i]));
					}
				}
				set.add(newStr); 
				StringBuilder sb=new StringBuilder(newStr);  
			    set.add(sb.reverse().toString());
			}
			
			for (int j = charArray.length -1 ; j >= charArray.length; j--) {
				String newStr = String.valueOf(charArray[j]);
				for (int i = charArray.length -1; i >= charArray.length; i--) {
					if (j == i) {
						// ignore
					} else {
						newStr = newStr.concat(String.valueOf(charArray[i]));
					}
				}
				set.add(newStr); 
				StringBuilder sb=new StringBuilder(newStr);  
			    set.add(sb.reverse().toString());
			}
			
			
			System.out.println(set);
		}
		
		
		System.out.println("Hello world !!");
	}
}
