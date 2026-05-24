package src.com.java15;

public class Lab744 {

	public static void main(String[] args) {
		Hello744 h = new Hello744();
		h.show(new int[]{4,6});
		//h.show(10,4);
		//h.show();
	}
}

class Hello744{
	/*void show(int[] arr1){
		System.out.println("#######");
	}*/
	
	/*void show(int ...arr){
		System.out.println("@@@@@@@@");
	}*/
	
	void show(int[] ... arr1){
		System.out.println("$$$$$$$$$");
	}
}



