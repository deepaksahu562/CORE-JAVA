package src.com.jlc.p2;

import com.jlc.p1.Hello877;

class Xyz877 extends Hello877{
	/*static{
		Xyz877 ref = new Xyz877();
		System.out.println("Xyz877---->"+ref.ab);
	}*/
}

public class Hai877 extends Hello877{

	void show(){
		System.out.println("Hai -> show()");
		Hello877 h = new Hello877();
		System.out.println(ab);
		//System.out.println(h.ab);
		
		Hai877 hai = new Hai877();
		System.out.println(hai.ab);
		
		Xyz877 ref = new Xyz877();
		//System.out.println(ref.ab);
	}
}


