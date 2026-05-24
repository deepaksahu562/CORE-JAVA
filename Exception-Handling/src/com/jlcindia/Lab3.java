package src.com.jlcindia;
public class Lab3 {

	public static void main(String[] args) {
		System.out.println("main begin");
		String s=null;
		try{
			s=args[0];
			System.out.println(s);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Plz provid the value");
			System.out.println(e);
		}
		
		int x=0;
		try{
			x=Integer.parseInt(s);
			System.out.println(x);
		}catch(NumberFormatException e){
			System.out.println("Plz provide integer number");
			System.out.println(e);
		}
		
		try{
		int y=10/x;
		System.out.println(y);
		}catch(ArithmeticException e){
			System.out.println("Please Dont Provide Zero");
			System.out.println(e);
		}
		System.out.println("main end");
	}

}
