package com.immutable;

public final class Address {

	private final int houseNo;
	private final String city;
	
	
	
	public Address(int houseNo, String city) {
		super();
		this.houseNo = houseNo;
		this.city = city;
	}


	public int getHouseNo() {
		return houseNo;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + "]";
	}
	
	
}
