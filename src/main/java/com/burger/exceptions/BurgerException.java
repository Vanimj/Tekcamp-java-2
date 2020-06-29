package com.burger.exceptions;

public class BurgerException extends Exception {

	private String exception = null;

	public BurgerException(String exception) {
		this.exception = exception;
	}
	
	public BurgerException() {
		super();
	}
	
	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}
	
	public String toString () {
		return getException();
	}
}
