package src.com.immutable;

public class Person {

	public static void main(String[] args) {
		Address address = new Address(121, "Indore");
		Contact con = new Contact(8431507, "Deepak",731, "Indore", address);
		System.out.println(con);
		
	}

}
