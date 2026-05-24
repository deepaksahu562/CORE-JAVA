package src.com.basic;

public class FactorialRecursun {

	int fact = 1;
	
	public int factorial(int num){
		if (num<=1) {
			return 1;
		}
		return fact = factorial(num-1) * num;
	}
	
	public static void main(String[] args) {
		FactorialRecursun fr = new FactorialRecursun();
		System.out.println(fr.factorial(5));
	}
}

