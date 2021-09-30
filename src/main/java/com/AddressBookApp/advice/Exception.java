package com.AddressBookApp.advice;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exception {

	@ExceptionHandler
	public ResponseEntity<String> notEmpty(HttpMessageNotReadableException exception) {
		return new ResponseEntity<String>("Message cant be Empty", HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> noIdPresent(NoSuchElementException exception) {
		return new ResponseEntity<String>("No id present", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> parentException(Exception e) {
		return new ResponseEntity<String>("Something went wrong ", HttpStatus.BAD_REQUEST);
	}

	
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<String> badReq(HttpRequestMethodNotSupportedException exception) {
		return new ResponseEntity<String>("Change HttpRequest", HttpStatus.BAD_REQUEST);
	}
}
