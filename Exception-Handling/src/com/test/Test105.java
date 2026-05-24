package com.test;
import java.io.*;

public class Test105
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		DataOutputStream dos=null;

		try{
			System.out.println("Before jdk-1.7");
			fos=new FileOutputStream("abc.txt");
			bos=new BufferedOutputStream(fos);
			dos=new DataOutputStream(bos);
			dos.writeUTF("Hi");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			//try{
			fos.close();
			bos.close();
			dos.close();
			//}catch(IOException e){
			//	System.out.println(e);
			//}
		}	
	}
}