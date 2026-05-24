package jlc.pro;

public class Test {

	public static void main(String[] args) {
		HelloTest h = new HiTest();
		System.out.println(h.x);
	}
}

class HelloTest{
	static int x = 10;
	public HelloTest() {
		System.out.println("DC HelloTest");
	}
}

class HiTest extends HelloTest{
	//int x = 20;
	public HiTest() {
		System.out.println("DC HiTest");
	}
}
