package com.basic;

public class PalandromNumber {

	public static void main(String[] args) {
		int s = 0,r,k = 0;
		int n = Integer.parseInt(args[0]);
		k = n;
		do{
			r = n % 10;
			s = 10 * s + r;
			n = n/10;
		}while(n>0);
		if (k == s) {
			System.out.println("Number is Palandrom");
		}else {
			System.out.println("Number is not Palandrom");
		}
	}

}
