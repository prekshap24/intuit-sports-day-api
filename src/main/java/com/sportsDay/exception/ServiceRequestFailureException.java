package com.sportsDay.exception;

@SuppressWarnings("serial")
public class ServiceRequestFailureException extends RuntimeException {
	public ServiceRequestFailureException(String message) {
		super(message);
	}

}
