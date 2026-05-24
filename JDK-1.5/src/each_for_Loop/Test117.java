package each_for_Loop;

import java.util.Iterator;

class Hello{
	public String toString(){
		return "Hello";
	}
}

class Hai{
	public String toString(){
		return "Hai";
	}
}

public class Test117 {

	public static void main(String[] args) {
		System.out.println("In main Test117");
		
		int a1[]=new int[4];
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);			
		}
		
		a1[0]=101;
		a1[1]=202;
		a1[2]=303;
		a1[3]=404;
		
		System.out.println("each-for loop");
		for(int i:a1){
			System.out.println(i);
		}
		
		System.out.println("Double Array");
		double d1[]=new double[4];
		for(double d:d1){
			System.out.println(d);
		}
		
		d1[0]=111.11;
		d1[1]=222.22;
		d1[2]=333.33;
		d1[3]=444.44;
		
		System.out.println("Double Array with value");
		for(double d:d1){
			System.out.println(d);
		}
		
		System.out.println("String Array");
		String str[]=new String[3];
		System.out.println(str);
		str[0]="deepak";
		str[1]="kumar";
		str[2]="sahu";
		
		for(String str1:str){
			System.out.println(str1+"\t:"+str1.length());
		}
		
		System.out.println("2D-Array");
		
		int a2[][]=new int[3][3];
		
		a2[0][0]=101;
		a2[0][1]=202;
		a2[0][2]=303;
		a2[1][0]=404;
		a2[1][1]=505;
		a2[1][2]=606;
		a2[2][0]=707;
		a2[2][1]=808;
		a2[2][2]=909;
		
		System.out.println("simple for loop");
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				System.out.print(a2[i][j]);
				System.out.print("\t");
			}
			System.out.println("\t");
		}
		
		System.out.println("each-for loop");
		for(int i[]:a2){
			for(int j:i){
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("\t");
		}
		
		
		Object o[]=new Object[3];
		System.out.println("--------"+o);
		o[0]=new Hello();
		o[1]=new Hai();
		o[2]=new String("jlc");
		for (Object obj : o) {
			System.out.println(o);
		}		
	}

}
