package src.com.balckbook;

import java.io.FileWriter;
import java.io.IOException;


public class CreateFile2 {

	public static void main(String[] args) throws IOException{
		
		String str="This is a book on java."+"\nI an a learner of java.";

		
		FileWriter fw=new FileWriter("text.txt",true);
		for (int i = 0; i < str.length(); i++) {
			fw.write(str.charAt(i));
		}
		fw.close();

	}

}
