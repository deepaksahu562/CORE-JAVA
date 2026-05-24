package com.jlcindia;

import java.io.DataInputStream;
import java.io.IOException;

public class Lab1 {

	public static void main(String[] args) throws IOException{

		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter First Num :");
		int i=Integer.parseInt(dis.readLine());
		System.out.println("Enter Second Num :");
		int j=Integer.parseInt(dis.readLine());
		int sum=i+j;
		System.out.println("The Sum of these Nums :"+sum);
		
	}

}
