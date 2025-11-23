package com.jspider.inerfaceDependencyInjection;

public class ElectricEngine implements IEngine{

	@Override
	public int start() {
	
	 System.out.println("ElectricEngine Start");
	 
	 return 1;
	}

}
