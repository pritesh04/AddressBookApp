package com.AddressBookApp.dto;

public class ResponseDto {
	public String message;
	public Object object;

	public ResponseDto(String message, Object object) {
		super();
		this.message = message;
		this.object = object;
	}

}
