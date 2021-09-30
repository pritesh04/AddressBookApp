package com.AddressBookApp.service;

import java.util.List;

import org.apache.tomcat.jni.Address;

import com.AddressBookApp.dto.AddressBookDto;
import com.AddressBookApp.model.AddressBook;

public interface IAddressBookService {

	List<AddressBook> getData();
	AddressBook getById(int contactid);
	AddressBook addData(AddressBookDto addressBook);
	AddressBook updateData(int contactid, AddressBookDto addressBookDto);
	void deleteData(int id);
}
