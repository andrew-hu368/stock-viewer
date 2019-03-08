package com.legend.stock.dbservice.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8462777094516281500L;

	public UserNotFoundException(String arg0) {
		super(arg0);
	}

	
}
