package src.com.java15;

public class Lab1066 {

	
	public static void main(String[] args) {
		//String str = "Hi, This is JLC.Java Learning Center. No 1 in Java Training and Placement.Java is a popular Language";
		String str = "D:\\B01\\abc\\java\\abc.txt";
		System.out.println(str);
		String res[] = str.split("\\\\");
		//String res[] = str.split("\\");
		System.out.println(res.length);
		for (int i = 0; i < res.length; i++) {
			String st = res[i]; 
			System.out.println(i+"\t"+st);
		}
		
	}

}
