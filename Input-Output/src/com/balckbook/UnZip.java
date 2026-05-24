package src.com.balckbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class UnZip {

	
	public static void main(String[] args) throws IOException{

		FileInputStream fis=new FileInputStream("info3.rar");
		FileOutputStream fos=new FileOutputStream("file3");
		
		InflaterInputStream iis=new InflaterInputStream(fis);
		int data;
		while((data=iis.read())!=-1){
			fos.write(data);
		}
		fos.close();
		iis.close();
	}

}
