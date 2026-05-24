package src.com.test;

public class Test1107 {

	public static void main(String[] args) {
		System.out.println(display());
	}
	
	private static int display(){
		int i = 10;
		try {
			i = 10/0;
			return i;
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ex){
			i = 20;
			System.out.println("1");
			System.exit(1);
			System.out.println("2");
			return i;
		}finally{
		return 40;
		}
	}

}
