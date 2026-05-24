package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pro103 {

	public static void main(String[] args) throws IOException {
		
		
		/*File file = new File("sri\\jlc\\io");
		System.out.println(file.mkdirs());*/

		//new Indore().display();
		new Pune().show();
	}
}


class Pune{
	void show() {
		DataInputStream ds = new DataInputStream(System.in);
		BufferedInputStream bs = new BufferedInputStream(ds);

		try {
			while (true) {
				char ch = (char)bs.read();
				System.out.print(ch);
				if (ch == '*')break;
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}


class Indore{
	
	void display() throws IOException{
		
		try(
				FileReader fr = new FileReader("d:\\test.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("d:\\desk.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				/*InputStreamReader is = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(is);
				OutputStreamWriter os = new OutputStreamWriter(System.out);
				BufferedWriter bw = new BufferedWriter(os);*/
				
		) {
			while (true) {
				
				String line = br.readLine();
				if(line == null) break;
				//if(line.equals("XX")) break;
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}