package com.jlc2015;

public class Lab418 {

	public static void main(String[] args) {
		sd:
		for (int i = 1; i <= 5; i++) {
			System.out.println("Outer Loop :"+i);
			//if(i == 2) break;
			for (int j = 0; j <= 5; j++) {
				System.out.println("Inner Loop :"+i+" : "+j);
				if(i == 2 && j == 2) break sd;
				System.out.println("check");
			}
			System.out.println("Outer end");
		}
	}

}
