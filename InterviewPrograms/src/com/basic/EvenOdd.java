package src.com.basic;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[] = {6,3,9,7,12,24,56,18,67,47};
		for (int i : arr) {
			if (i%2 == 0) {
				System.out.println("EVEN"+i);
			}else {
				System.out.println("ODD"+i);
			}
		}
	}

}
