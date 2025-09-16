package com.ashu.exception;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleCustomerNotFoundException(CustomerNotFoundException ex) {
		ExceptionInfo info = new ExceptionInfo();
		info.setExceptionCode("CUST-404");
		info.setExceptionMessage(ex.getMessage());
		info.setTimeStamp(LocalTime.now());
		
		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}
}
