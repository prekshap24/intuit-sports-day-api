package com.sportsDay.dto;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

public class ApiError {
	private String message;
	private HttpStatus status;
	private LocalDate localDate;
	// private String errorCode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return "ApiError [message=" + message + ", status=" + status + ", localDate=" + localDate + "]";
	}

	public ApiError(String message, HttpStatus status, LocalDate localDate) {
		super();
		this.message = message;
		this.status = status;
		this.localDate = localDate;
	}

	public ApiError() {
		super();
		// TODO Auto-generated constructor stub
	}
}
