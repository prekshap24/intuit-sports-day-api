package com.sportsDay.exceptionHandler;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sportsDay.dto.ApiError;
import com.sportsDay.exception.BadRequestException;
import com.sportsDay.exception.EmptyInputException;
import com.sportsDay.exception.NotFoundException;
import com.sportsDay.exception.ServiceRequestFailureException;

@ControllerAdvice
public class ApiExceptionHandler  extends ResponseEntityExceptionHandler  {
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<Object> handleEmptyInputException(EmptyInputException ex, WebRequest webReq) {
		return new ResponseEntity<Object>(new ApiError(ex.getMessage(), HttpStatus.BAD_REQUEST, LocalDate.now()),
				HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ServiceRequestFailureException.class)
	public ResponseEntity<Object> handleServiceRequestFailureException(ServiceRequestFailureException ex, WebRequest webReq) {
		return new ResponseEntity<Object>(new ApiError(ex.getMessage(), HttpStatus.BAD_REQUEST, LocalDate.now()),
				HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<Object> handleBadRequestException(BadRequestException ex, WebRequest webReq) {
		return new ResponseEntity<Object>(new ApiError(ex.getMessage(), HttpStatus.BAD_REQUEST, LocalDate.now()),
				HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Object> handleNotFoundException(NotFoundException ex, WebRequest webReq) {
		return new ResponseEntity<Object>(new ApiError(ex.getMessage(), HttpStatus.NOT_FOUND, LocalDate.now()),
				HttpStatus.NOT_FOUND);
	}

}