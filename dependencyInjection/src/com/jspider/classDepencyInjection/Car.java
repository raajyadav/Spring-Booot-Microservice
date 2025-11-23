package com.jspider.classDepencyInjection;

public class Car extends Engine{

	public void drive() {
//		int status = super.start(); //tightly couple with Is -A - RelationShip
		
		Engine engine = new Engine(); //tightly couple with Has -A - RelationShip
		
		int status = engine.start();
		
		if(status >= 1) {
			System.out.println("Journey Started");
		}else {
			System.out.println("Engine Trouble");
		}
	}
}
