package src.com.balckbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = null;
	
			
			fis=new FileInputStream("myfile.txt");
			System.out.println("File contant :");
			char ch;
			while((ch=(char)fis.read())!= -1){
				System.out.print(ch);
				if(fis.read()==-1)
					break;
			}
			//fis.close();
	}

}
