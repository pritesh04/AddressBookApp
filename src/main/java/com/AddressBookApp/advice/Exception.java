package com.AddressBookApp.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exception {

	
	@ExceptionHandler
	public ResponseEntity<String> notEmpty(HttpMessageNotReadableException exception)
	{
		return new ResponseEntity<String>("Message cant be Empty" , HttpStatus.NOT_FOUND);
		
	}
}
