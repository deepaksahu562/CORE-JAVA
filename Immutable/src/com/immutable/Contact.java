package src.com.immutable;

public final class Contact {
	private final long phnNo;
	private final String name;
	private final int pinCode;
	private final String city;
	private final Address address;
	
	public Contact(long phnNo, String name, int pinCode, String city, Address address) {
		this.phnNo = phnNo;
		this.name = name;
		this.city = city;
		this.pinCode = pinCode;
		this.address = address;
	}

	public long getPhnNo() {
		return phnNo;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	
	public int getPinCode(){
		return pinCode;
	}
	
	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		String summry = "Name	:"+name+"\nPhoneNo	:"+phnNo+"\nPincode	:"+pinCode+"\nCity	:"+city+"\nAddress	:"+address;
		return summry;
	}
}
