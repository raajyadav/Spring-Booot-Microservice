package com.jspider.inerfaceDependencyInjection;

public class Car {

	private IEngine eng;
//	IEngine eng; // Field Injection 
	
	public Car(IEngine eng) { //Constructor Injection
		this.eng= eng;
	}
	
//	public void setEngine(IEngine eng) {   //Setter Injection
//		this.eng=eng;
//	}
	
	public void drive() {
		
		int status = eng.start();
		
		if(status >= 1) {
			System.out.println("Journey Started");
		}else {
			System.out.println("Engine Trouble");
		}
	}
}
