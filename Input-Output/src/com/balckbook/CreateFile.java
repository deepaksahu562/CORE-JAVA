package src.com.balckbook;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException{
		
		DataInputStream dis=new DataInputStream(System.in);
		
		DataOutputStream dos=new DataOutputStream(System.out);
		FileOutputStream fout=new FileOutputStream("myfile.txt");
		
		System.out.println("Enter text (@ at the end) :");

		char ch;
		while((ch=(char)dis.read())!='@'){
			dos.write(ch);
		}
		
		while((ch=(char)dis.read())!='@'){
			fout.write(ch);
		}
		
		fout.close();
	}
}
