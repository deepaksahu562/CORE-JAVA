package src.com.balckbook;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {

	public static void main(String[] args) throws IOException{
		
		FileReader fr=new FileReader("text.txt");
		
		char ch;
		while((ch=(char)fr.read())!=-1){
			System.out.print(ch);
			if(ch=='@')
				break;
		}
		fr.close();
	}

}
