package src.com.java15;

public class Lab740 {

	public static void main(String[] args) {
		int arr [] = new int[2];
		Hello740 h = new Hello740();
		//h.show();//INVAILID
		h.show(5);
		h.show(5, arr);
		h.show(5, 10);
		h.show(5, 10, 20);
		
		h.dis();
		h.dis(5);
		h.dis(5,10,20);
	}
}

class Hello740{
	void show(int a, int...arr){
		System.out.println("int-arr");
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	void dis(int ...arr){
		System.out.println("arr");
	}
}



