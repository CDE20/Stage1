package com.spring.app;

public class AddressBook {
	private String phoneNumber;
	private Address tempAddress;

	public AddressBook(Address address) {
		this.tempAddress = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getTempAddress() {
		return tempAddress;
	}

	public void setTempAddress(Address tempAddress) {
		this.tempAddress = tempAddress;
	}
}
