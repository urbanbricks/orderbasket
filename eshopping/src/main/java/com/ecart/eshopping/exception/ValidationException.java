package com.ecart.eshopping.exception;

@SuppressWarnings("serial")
public class ValidationException extends Exception {
	
	public ValidationException(){};
	
	public ValidationException(String message) {
		super(message);
	}
}
