package src.com.java15;

public class Lab645 {

	public static void main(String[] args) {
		Hello645 h = new Hello645();
		System.out.println("Main :"+h.a);
	}
}

class Hello645{
	int a =10;
	static{
		String a = "JLC";
		Hello645 h = new Hello645();
		System.out.println("SB :"+a+"\t"+h.a);
	}
	
	/*public Hello645() {
		System.out.println("Hello645()");
	}
	
	static{
		System.out.println("2nd SB");
	}*/
}
