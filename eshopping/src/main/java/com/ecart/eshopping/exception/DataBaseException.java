package com.ecart.eshopping.exception;

@SuppressWarnings("serial")
public class DataBaseException extends Exception {
	
	public DataBaseException(){};
	
	public DataBaseException(String message) {
		super(message);
	}
}
