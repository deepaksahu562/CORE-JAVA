package src.edu.functional_interface;

@FunctionalInterface
interface Sayable281101 {
	void say(String msg); // abstract method

}

public class Lab281101 implements Sayable281101 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Lab281101 fie = new Lab281101();
		fie.say("Hello there");
	}

}