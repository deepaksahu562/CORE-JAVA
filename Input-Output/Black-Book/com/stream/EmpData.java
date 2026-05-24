package com.stream;
import java.io.*;

class EmpData
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Emp id : ");
		int id=Integer.parseInt(br.readLine());

		System.out.print("Enter the Emp sex : ");
		//char sex=(char)br.read();
		char sex=br.readLine().charAt(0);

		System.out.print("Enter the Emp Name");
		String name=br.readLine();

		System.out.println("Empolee ID : "+id);
		System.out.println("       Sex : "+sex);
		System.out.println("      Name : "+name);
	}
}