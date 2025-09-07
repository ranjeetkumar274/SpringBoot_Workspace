package com.ashu.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalHandling extends ResponseEntityExceptionHandler {
	
	 @ExceptionHandler(RuntimeException.class)
	    public ResponseEntity<Map<String, String>> handleRuntime(RuntimeException ex) {
	        Map<String, String> body = new HashMap<>();
	        body.put("error", ex.getMessage());
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
	    }
}
