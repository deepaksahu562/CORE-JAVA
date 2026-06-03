package src.edu.functional_interface;

@FunctionalInterface
interface Sayable281102 {
	void say(String msg); // only one abstract method

	// It can contain any number of Object class methods as abstract (non-concurrent).
    String toString();  
    boolean equals(Object obj);  
    
    //It can contain any number of default methods.
    default void doIt(){  
        System.out.println("Do it now");  
    }

	// It can contain any number of static method
	static void sayLouder(String msg) {
		System.out.println(msg);
		//say();
	}
}

public class Lab281102 implements Sayable281102 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Lab281102 fie = new Lab281102();
		fie.say("Hello there");
		fie.doIt();
		//fie.sayLouder("Hi........");
		Sayable281102.sayLouder("Hello...........");
		System.out.println(fie.toString());
		System.out.println(fie.hashCode());
	}
	
	@Override // Overriden from Sayable281102 Interface
	public String toString() {
		return "Hello I'm toString method";
	}

	@Override // Overriden from Object class.
	public int hashCode() {
		return new Object().hashCode();
	}
}