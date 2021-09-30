package com.AddressBookApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AddressBookApp.dto.AddressBookDto;
import com.AddressBookApp.model.AddressBook;
import com.AddressBookApp.repo.AddressBookRepo;

@Service
public class AddressBookService implements IAddressBookService {

	public  List<AddressBook> list = new ArrayList<AddressBook>();
	
	@Autowired
	AddressBookRepo addressBookRepo;
	
	@Override
	public List<AddressBook> getData() {

		return list;
	}

	@Override
	public AddressBook getById(int id) {
		return list.get(id - 1);
	}

	@Override
	public AddressBook addData(AddressBookDto addressBookDto) {
		 
		
		AddressBook ad= new AddressBook(list.size()+1,addressBookDto);
		list.add(ad);
		return ad;
	}

	@Override
	public AddressBook updateData(int contactid, AddressBookDto addressBookDto) {
		AddressBook ad= list.get(contactid-1);
		ad.setAddress(addressBookDto.getAddress());
		ad.setFirstName(addressBookDto.getFirstName());
		ad.setPhoneNumber(addressBookDto.getPhoneNumber());
		list.set(contactid-1, ad);
		return ad;
	}

	@Override
	public void deleteData(int id) {

		list.remove(id-1);
	}

	
	public List<AddressBookRepo> getAll()
	{
		return addressBookRepo.findAll();
	}
}
