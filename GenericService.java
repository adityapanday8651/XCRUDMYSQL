package com.test.ws;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public abstract class GenericService {
	
	protected ResponseEntity<Object> toSuccess(Object object) {
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(object);
	}
}
