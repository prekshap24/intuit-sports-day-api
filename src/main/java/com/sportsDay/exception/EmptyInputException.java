package com.sportsDay.exception;

@SuppressWarnings("serial")
public class EmptyInputException extends RuntimeException {
	public EmptyInputException(String message) {
		super(message);
	}

}
