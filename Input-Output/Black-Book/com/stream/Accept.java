package com.stream;
import java.io.*;

class Accept
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);

		BufferedReader br=new BufferedReader(obj);

		System.out.print("Enter the character :");
		char ch=(char)br.read();
		System.out.println("Character Entered :"+ch);
	}
}