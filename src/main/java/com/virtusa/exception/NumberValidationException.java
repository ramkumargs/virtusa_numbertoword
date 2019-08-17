package com.virtusa.exception;

public class NumberValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public NumberValidationException() {
		super();
	}
	public NumberValidationException(String message) {
		super(message);
	}
}
