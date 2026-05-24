package src.com.jlcindia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab4 {

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the source file name :");
		String  sf=br.readLine();
		System.out.print("Enter the dest's file name :");
		String  df=br.readLine();
		
		FileReader fr=new FileReader(sf);
		BufferedReader br1=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter(df,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		char ch;
		
		while((ch=(char)br1.read())!=-1){
			bw.write(ch);
			
		}
		br.close();
		fr.close();
		fw.close();
		//bw.close();
		
		
		
	}

}
