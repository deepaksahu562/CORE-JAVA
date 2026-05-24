package com.test;

/*For example

Input : 1[b]
Output : b

Input : 2[ab]
Output : abab

Input : 2[a2[b]]
Output : abbabb

Input : 3[b2[ca]]
Output : bcacabcacabcaca*/



public class Test {
	
	public static void main(String[] args) {
		
		boolean flag = false;
		boolean flagNewFlag = false;
		char ch = 0;
		
		String input = args[0];
		int beginIndex = input.lastIndexOf('[');
		int endIndex = input.indexOf(']');
		String centerSter1 = input.substring(beginIndex+1, endIndex);
		//System.out.println(centerSter1);
		
		int num = Integer.parseInt(String.valueOf(input.charAt(beginIndex-1)));
		
		for (int i = 1; i < num; i++) {
			centerSter1 = centerSter1 + centerSter1;
		}
		
		
		try {
			 ch = input.charAt(beginIndex-2);
			 flag = true;
			
		} catch (Exception e) {
			
		}
		
		String part1 = centerSter1;
		
		if(flag){
			part1 = ch + centerSter1;
			
		}
		
		int num2 = 0;
		
		
		try {
			num2 = Integer.parseInt(String.valueOf(input.charAt(beginIndex-4)));
			System.out.println(num2);
			 flagNewFlag = true;
			
		} catch (Exception e) {
			
		}
		
		if(flagNewFlag){
			for (int i = 1; i < num2; i++) {
				part1 = part1 + part1;
			}
			
		}
		
		
		
		
		System.out.println(part1);
		
		
		
	}
	
}
