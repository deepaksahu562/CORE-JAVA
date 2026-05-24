package src.com.java15;

public class Lab654 {

	public static void main(String[] args) {
		new Hello654();
	}
}
 
class Hello654{
	
	public Hello654() {
		System.out.println("DC");
		Hello654 h = new Hello654();
	}
	
}