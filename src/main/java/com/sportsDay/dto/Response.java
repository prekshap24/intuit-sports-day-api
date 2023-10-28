package com.sportsDay.dto;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class Response {
	protected Object message;
	protected HttpStatus status;
	protected LocalDate localDate;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Response [message=" + message + ", status=" + status + ", localDate=" + localDate + "]";
	}
	public Response(Object message, HttpStatus status, LocalDate localDate) {
		super();
		this.message = message;
		this.status = status;
		this.localDate = localDate;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
