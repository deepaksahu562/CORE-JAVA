package src.edu.method_references;

interface Sayable201121 {
	void say();
}

public class Lab201121 {

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Anonymous implementation 
		Sayable201121 sayable1 = new Sayable201121() {
			@Override
			public void say() {
				System.out.println("Hello, this is anonymous class.");
			}
		};
		sayable1.say();
		
		// Lambda implementation
		Sayable201121 sayable2 = () -> System.out.println("Hello, this is Lambda expression.");
		sayable2.say();
		
		// Method references implementation
		Sayable201121 sayable3 = Lab201121::saySomething;
		sayable3.say();
	}
}
