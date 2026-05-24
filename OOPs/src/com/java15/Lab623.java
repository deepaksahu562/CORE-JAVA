package src.com.java15;

public class Lab623 {

	public static void main(String[] args) {
		Hello623 hello = new Hello623();
		hello.show();
	}

}

class Hello623{
	int a = 6;
	void show(){
		String a = "jlc";
		System.out.println(a);
		System.out.println(this.a);
		//System.out.println(Hello623.this.a);
		//Hello623.this.display();
		//System.out.println(Hai623.this.a);
	}
	
	void display(){
		System.out.println("display");
	}
}

class Hai623{
	int a = 5;
}
