package src.com.balckbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Zip {

	public static void main(String[] args) throws IOException{

		FileInputStream fis=new FileInputStream("info3.txt");
		FileOutputStream fos=new FileOutputStream("file2.zip");
		
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		int data;
		while((data=fis.read())!=-1){
			dos.write(data);
		}
		fis.close();
		dos.close();
	}

}
