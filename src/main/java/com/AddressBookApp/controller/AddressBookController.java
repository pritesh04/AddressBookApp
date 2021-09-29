package com.AddressBookApp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AddressBookApp.dto.ResponseDto;
import com.AddressBookApp.model.AddressBook;
import com.AddressBookApp.service.AddressBookService;

@RestController
public class AddressBookController {

	@GetMapping("/get")
	public String getAdd() {
		return "Getting contacts";
	}
	
	@GetMapping("/getId")
	public String getAddById(@RequestParam(value = "id")int id) {
		return "displaying specific  id contact";
	}
	
	@PutMapping("/put/{id}")
	public String putAdd(@PathVariable int id) {
		return "contact updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAdd(@PathVariable int id) {
		return "Contact Deleted";
	}
	
	
	

}
