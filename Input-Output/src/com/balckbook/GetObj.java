package com.balckbook;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GetObj {

	public static void main(String[] args) throws IOException{

		FileInputStream fis=new FileInputStream("Employee.class");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		try{
		Employee e;
		while((e=(Employee)ois.readObject())!=null){
			e.display();
		}
		}catch (EOFException ee) {
			System.out.println("End of file reached");
		}
		catch(Exception e){
			System.out.println(e);
		}finally{
			ois.close();
		}
	}

}
