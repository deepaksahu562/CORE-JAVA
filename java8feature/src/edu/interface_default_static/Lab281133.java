package src.edu.interface_default_static;

interface MyInterface {
	default void newMethod() {
		System.out.println("Newly added default method");
	}
	void existingMethod(String str);
	public boolean equals(Object obj); //Object class methods
}

interface MyInterface2 {
	default void newMethod() {
		System.out.println("Newly added default method");
	}
	void disp(String str);
}

public class Lab281133 implements MyInterface, MyInterface2 {
	// implementing abstract methods
	public void existingMethod(String str) {
		System.out.println("String is: " + str);
	}
	public void disp(String str) {
		System.out.println("String is: " + str);
	}
	// Implementation of duplicate default method
	public void newMethod() {
		System.out.println("Implementation of default method");
	}
	public static void main(String[] args) {
		Lab281133 obj = new Lab281133();
		// calling the default method of interface
		obj.newMethod();
	}
}