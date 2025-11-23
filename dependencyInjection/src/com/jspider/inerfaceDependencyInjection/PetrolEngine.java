package com.jspider.inerfaceDependencyInjection;

public class PetrolEngine implements IEngine{

	@Override
	public int  start() {
		
		System.out.println("PetrolEngine Start");
		
		return 1;
	}

}
