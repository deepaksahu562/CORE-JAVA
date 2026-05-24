package com.balckbook;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class StoreObj {


	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fos=new FileOutputStream("objfile");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		System.out.println("How many objects ?");
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++){
			Employee e1=Employee.getData();
			oos.writeObject(e1);
		}
		oos.close();

	}

}
