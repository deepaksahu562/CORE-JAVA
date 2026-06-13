package src.edu.interface_default_static;

interface MyInterface1 {
	default void newMethod() {
		System.out.println("Newly added default method MyInterface1");
	}
	void existingMethod(String str);
	public boolean equals(Object obj); //Object class methods
}

interface MyInterface2 {
	default void newMethod() {
		System.out.println("Newly added default method MyInterface2");
	}
	void disp(String str);
}

public class Lab281133 implements MyInterface1, MyInterface2 {
	// implementing abstract methods
	public void existingMethod(String str) {
		System.out.println("String is: " + str);
	}
	public void disp(String str) {
		System.out.println("String is: " + str);
	}
	// Implementation of duplicate default method
	@Override
	public void newMethod() { // try with remove this method
		System.out.println("Implementation of default method");
	}
	public static void main(String[] args) {
		Lab281133 obj = new Lab281133();
		// calling the default method of interface
		obj.newMethod();
	}
}