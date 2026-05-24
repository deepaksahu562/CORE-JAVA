package src.com.java15;

public class Lab771 {

	static int count = 0;
	public static void main(String[] args) {
		count++;
		System.out.println("start :"+count);
		if (count <5) {
			main(null);
		}
		System.out.println("end:"+count);
	}

}
