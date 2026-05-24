package com.jlcindia;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserTest {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis=new FileInputStream("c:\\stDetails.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		System.out.println(obj);
		System.out.println("Object DeSerialized");
	}

}
