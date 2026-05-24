package src.com.jlc2015;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Lab1351 {

	public static void main(String[] args) {
		try(
				FileInputStream fis = new FileInputStream("D:\\info.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
			) {
			Object obj = ois.readObject();
			System.out.println(obj);
			System.out.println("Object Deserialized");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
