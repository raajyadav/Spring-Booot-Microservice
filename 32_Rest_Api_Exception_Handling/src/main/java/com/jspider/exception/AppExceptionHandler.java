package com.jspider.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {


	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleUserNFE(UserNotFoundException e){
		
		String exMsg = e.getMessage();
		
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setCode("SBIEX0005");
		errorInfo.setMsg(exMsg);
		errorInfo.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
		
		String exMsg = e.getMessage();
		
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setCode("SBIEX0001");
		errorInfo.setMsg(exMsg);
		errorInfo.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
