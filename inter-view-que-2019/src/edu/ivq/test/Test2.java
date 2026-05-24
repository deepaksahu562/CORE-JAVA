package edu.ivq.test;

public class Test2 {

	public static void main(String[] args) {
		try{
			//int a = Integer.parseInt("four");
			//int a = 0/3;
			
			/*String arr[] = new String[10];
			arr = null;
			arr[0] = "one";
			System.out.println(arr[0]);*/
			
			Test_22 test22 = new Test_22();
			test22.print();
		}catch(Exception e){
			System.out.println("error :"+e);
		}

	}

}

class Test_22{
	void print(){
		try{
		if(true)
			throw new NullPointerException();
		//System.out.println("Hello");
		}catch (Exception e) {
			System.out.println("rrrr");
		}
	}
}