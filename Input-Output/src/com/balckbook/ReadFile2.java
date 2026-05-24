package com.balckbook;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile2 {

	public static void main(String[] args) throws Exception{
		System.out.println("Enter the file Name :");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String file=br.readLine();
		FileInputStream fis=new FileInputStream(file);
		
		BufferedInputStream bis=new BufferedInputStream(fis,1024);
		int ch;
		while((ch=bis.read())!= -1){
			System.out.print((char)ch);
			//if(bis.read()==-1)
				//break;
		}

	}

}
