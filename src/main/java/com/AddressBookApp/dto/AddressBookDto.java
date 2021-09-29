package com.AddressBookApp.dto;

public class AddressBookDto {
	public String firstName;
	public	String address;
	public	String phoneNumber;
	public AddressBookDto(String firstName, String lastName, String address, String city, String state, String zipcode,
			String phoneNumber, String email, String type) {
		super();
		this.firstName = firstName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
