package src.com.java15;

public class Lab818 {

	public static void main(String[] args) {
		new Hello818().show();
	}
}

class Hai818{
	
}

class Hello818 extends Hai818{
	void show(){
		
		System.out.println(this);
		System.out.println(this.toString());
		//System.out.println(super);
		
		Hello818 h = this;
		//Hai818 ha  = super;
		
		System.out.println(Hello818.this);
		//System.out.println(Hello818.super);
		
		//System.out.println(Hai818.this);
		//System.out.println(Hai818.super);
	}
	
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello Boss";
	}*/
}