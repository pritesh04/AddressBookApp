package com.AddressBookApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AddressBookApp.dto.AddressBookDto;
import com.AddressBookApp.dto.ResponseDto;
import com.AddressBookApp.model.AddressBook;
import com.AddressBookApp.service.IAddressBookService;

@RestController
public class AddressBookController {
//
//	@GetMapping("/get")
//	public String getAdd() {
//		return "Getting contacts";
//	}
//	
//	@GetMapping("/getId")
//	public String getAddById(@RequestParam(value = "id")int id) {
//		return "displaying specific  id contact";
//	}
//	
//	@PutMapping("/put/{id}")
//	public String putAdd(@PathVariable int id) {
//		return "contact updated";
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public String deleteAdd(@PathVariable int id) {
//		return "Contact Deleted";
//	}
	@Autowired
	IAddressBookService service;

	@PostMapping("/adddata")
	public ResponseEntity<ResponseDto> add(@RequestBody AddressBookDto add) {
		AddressBook ad;
		ad = service.addData(add);
		ResponseDto res = new ResponseDto("Added", ad);
		return new ResponseEntity<ResponseDto>(res, HttpStatus.OK);
	}

	@GetMapping("/getid/{id}")
	public ResponseEntity<ResponseDto> getId(@RequestParam(value = "id") int id) {
		AddressBook ad;
		ad = service.getById(id);
		ResponseDto res = new ResponseDto("Added", ad);
		return new ResponseEntity<ResponseDto>(res, HttpStatus.OK);
	}

	@GetMapping("/getall")
	public ResponseEntity<ResponseDto> getId() {
		List<AddressBook> ad;
		ad = service.getData();
		ResponseDto res = new ResponseDto("Added", ad);
		return new ResponseEntity<ResponseDto>(res, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDto> update(@RequestParam(value = "id") int id, AddressBookDto aDto) {
		AddressBook ad;
		ad = service.updateData(id, aDto);
		ResponseDto res = new ResponseDto("Updated", ad);
		return new ResponseEntity<ResponseDto>(res, HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<ResponseDto> deleteId(@RequestParam(value = "id") int id) {
		AddressBook ad = null;
		service.deleteData(id);
		ResponseDto res = new ResponseDto("Deleted", ad);
		return new ResponseEntity<ResponseDto>(res, HttpStatus.OK);
	}

}
