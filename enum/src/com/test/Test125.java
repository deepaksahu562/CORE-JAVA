package src.com.test;


class Helloz{
	
	void m1(int a){
		switch(a){
		case 1:System.out.println("one");
			break;
		case 2:System.out.println("two");
			break;
		case 3:System.out.println("three");
			break;
		case 4:System.out.println("foure");
			break;
		default :System.out.println("default m1()");
		}
	}
	
	enum  MONTH{
		JAN,FEB,MARCH
	}
	
	void m2(){
		System.out.println("m2() in Hello");
		System.out.println("from jdk1.5");
		MONTH m=MONTH.JAN;
		
		switch (m) {
		case FEB:System.out.println("feb");
				break;
		case MARCH:System.out.println("march");
				break;
		/*case MAY:System.out.println("may");
				break;*/
		case JAN:System.out.println("jan");
				break;
		default:System.out.println("defult in m2()");
		}
	}
	
	void m3(String str){
		System.out.println("from jdk1.7 in m3()");
		switch (str) {
		case "ab":System.out.println("ab");
			break;
		case "AB":System.out.println("ab");
			break;
		case "bc":System.out.println("ab");
			break;
		default:System.out.println("default in m3"+str);
			break;
		}
	}
	
}

public class Test125 {

	public static void main(String[] args) {
		Helloz h1=new Helloz();
		h1.m1(Integer.parseInt(args[0]));
		h1.m2();
		h1.m3(args[1]);
	}

}
