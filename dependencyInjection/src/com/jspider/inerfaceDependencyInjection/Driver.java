package com.jspider.inerfaceDependencyInjection;

public class Driver {

	public static void main(String[] args) {
		Car c1 = new Car(new ElectricEngine());  //Constuctor Injection
		c1.drive();
//		============================================
//		Car c1 = new Car();    //Setter Injection
//		c1.setEngine(new DieselEngine());
//		c1.drive();
//		============================================
//		Car c1 = new Car();   //Field Injection
//		c1.eng = new PetrolEngine();
//		c1.drive();
		
	}
}
