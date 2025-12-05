package com.jspider.exception;

public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1884742076574684408L;
	
	
	public UserNotFoundException(){
		
	}
	public UserNotFoundException(String msg){
		super(msg);
	}
}
