package com.AddressBookApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.AddressBookApp.dto.AddressBookDto;
@Entity
@Table(name="Addressbook")
public class AddressBook {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String firstName;
	String address;
	String phoneNumber;

	public AddressBook(int id, AddressBookDto address) {
		super();
		this.id=id;
		this.firstName = address.firstName;
		this.address = address.address;
		this.phoneNumber = address.phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
