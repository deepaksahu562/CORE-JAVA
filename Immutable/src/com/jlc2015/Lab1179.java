package com.jlc2015;

public class Lab1179 {

	public static void main(String[] args) {
		
		Address add = new Address("12/88", 411036, "Keshv Nagar");
		User user = new User(101, "Varun", 9876543210L, add);
		
		System.out.println(add);
		System.out.println(user);
		
		System.out.println("Modifying Address ref");
		add.aid = "88/45";
		add.pin = 411025;
		add.street = "Jagtap Dairy";
		
		System.out.println(add);
		System.out.println(user);
		
		System.out.println("Accessing User's add ref andModifying");
		
		Address ref = user.getAdd();
		ref.aid = "44/21";
		ref.pin = 411018;
		ref.street = "Wakad Bridge";
		
		System.out.println(add);
		System.out.println(user);
		
	}
}

class Address{
	String aid;
	int pin;
	String street;
	public Address(String aid, int pin, String street) {
		super();
		this.aid = aid;
		this.pin = pin;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", pin=" + pin + ", street=" + street + "]";
	}
}

final class User{
	private final int uid;
	private final String name;
	private final long phone;
	private final Address add;
	
	public User(int uid, String name, long phone, Address add) {
		super();
		this.uid = uid;
		this.name = name;
		this.phone = phone;
		this.add = add;
	}

	public int getUid() {
		return uid;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	public Address getAdd() {
		return add;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", phone=" + phone + ", add=" + add + "]";
	}
}