package src.com.jlc2015;

import java.io.File;

public class Lab1341 {

	public static void main(String[] args) {

		File file = new File("D:\\");
		File filelist[] = file.listFiles();
		for (File f : filelist) {
			System.out.println(f + " is File -"+ f.isFile()+"\t"+f.isDirectory());
		}
	}

}
