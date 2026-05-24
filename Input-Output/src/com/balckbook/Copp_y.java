package src.com.balckbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Copp_y {

	public static void main(String[] args) throws IOException{

			/*FileInputStream fis=new FileInputStream("myfile.txt");
			FileOutputStream fos=new FileOutputStream("desk.txt");
			
			char ch;
			while((ch=(char)fis.read())!='^'){
				fos.write(ch);
				System.out.print(ch);
			}
			fis.close();
			fos.close();
			fis.close();*/
		
		FileReader fr=new FileReader("myfile.txt");
		FileWriter fw=new FileWriter("deep.txt");
		char ch;
		while((ch=(char)fr.read())!='^'){
			fw.write(ch);
			System.out.print(ch);
		}
		
		

	}

}
