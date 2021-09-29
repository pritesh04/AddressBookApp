package com.AddressBookApp.model;

import com.AddressBookApp.dto.AddressBookDto;

public class AddressBook {
	int id;
	String firstName;
	String address;
	String phoneNumber;
	public AddressBook(int id, AddressBookDto  address) {
		super();
		this.firstName =address.firstName;
		this.address =address.address;
		this.phoneNumber =address. phoneNumber;
	}
	
	
}
