package com.chidhvilas.Capstone.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import com.chidhvilas.Capstone.DTO.ErrorDTO;

@RestControllerAdvice
public class GlobalExceptionHandleing {
	
	
	@ExceptionHandler(NullPointerException.class)
	public ErrorDTO nullpointerException() {
		ErrorDTO errorDTO=new ErrorDTO();
		errorDTO.setMessage("Product Not Found");
		errorDTO.setStatusCode(404);
		return errorDTO;		
	}
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorDTO> productNotFoundException(ProductNotFoundException e) {
		ErrorDTO errorDTO=new ErrorDTO();
		errorDTO.setMessage(e.getMessage());
		errorDTO.setStatusCode(404);
		return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
	}
	 @ExceptionHandler(NoResourceFoundException.class)
	    public ResponseEntity<Map<String, Object>> handleNotFound(NoResourceFoundException e) {
	        Map<String, Object> body = new HashMap<>();
	        body.put("timestamp", System.currentTimeMillis());
	        body.put("status", HttpStatus.NOT_FOUND.value());
	        body.put("error", "Resource Not Found");
	        body.put("message", "The requested API endpoint does not exist: " + e.getResourcePath());
	        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	    }
	 @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	 public ResponseEntity<Map<String, Object>> handleMethodNotSupported(HttpRequestMethodNotSupportedException e) {
	     Map<String, Object> body = new HashMap<>();
	     body.put("timestamp", System.currentTimeMillis());
	     body.put("status", HttpStatus.METHOD_NOT_ALLOWED.value());
	     body.put("error", "Method Not Allowed");
	     body.put("message", "HTTP method " + e.getMethod() + " is not supported for this endpoint.");
	     return new ResponseEntity<>(body, HttpStatus.METHOD_NOT_ALLOWED);
	 }

}
