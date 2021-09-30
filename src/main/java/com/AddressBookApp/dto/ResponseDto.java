package com.AddressBookApp.dto;

import lombok.Data;

@Data
public class ResponseDto {
	public String message;
	public Object object;

	public ResponseDto(String message, Object object) {
		super();
		this.message = message;
		this.object = object;
	}

}
