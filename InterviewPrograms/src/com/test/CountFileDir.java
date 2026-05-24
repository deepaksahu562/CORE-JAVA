package src.com.test;

import java.io.File;

public class CountFileDir {

	public static void main(String[] args) {

		File file = new File("D:\\");
		File filelist[] = file.listFiles();
		for (File f : filelist) {
			System.out.println(f + " is File -"+ f.isFile()+"\t"+f.isDirectory());
		}
	}

}
