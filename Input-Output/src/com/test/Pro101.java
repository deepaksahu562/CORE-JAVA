package src.com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pro101 {
	public static void main(String[] args)throws Exception {
		InputStreamReader ps=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ps);
		
		System.out.println("Enter name sex phone");
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str, " ");
		String name=st.nextToken();
		String sex=st.nextToken();
		Long ph=Long.parseLong(st.nextToken());
		System.out.println("Name	:"+name+"\nGendre	:"+sex+"\nPhone	:"+ph);
		
		Scanner sc=new Scanner(System.in);
		String nm=sc.next();
		String sx=sc.next();
		Long phn=sc.nextLong();
		System.out.println("Name	:"+nm+"\nGendre	:"+sx+"\nPhone	:"+phn);
	}

}
