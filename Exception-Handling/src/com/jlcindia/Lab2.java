package src.com.jlcindia;
public class Lab2 {
	
	public static void main(String[] args) {
		System.out.println("main begin");
		try{
			int x=Integer.parseInt(args[0]);
			System.out.println(x);
			int y=10/x;
			System.out.println(y);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Plz provid the value");
			System.out.println(e);
			//e.printStackTrace();
		}
		catch(NumberFormatException e){
			System.out.println("plz provid inteter number");
			System.out.println(e);
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			System.out.println("plz donnt provid zero");
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("plz donn't do this");
			System.out.println(e);
		}
		System.out.println("main end");
	}
}
