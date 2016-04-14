package com.ecart.eshopping.exception;

public class ValidationException extends Exception {
	
	public ValidationException(){};
	
	public ValidationException(String message) {
		super(message);
	}
}
