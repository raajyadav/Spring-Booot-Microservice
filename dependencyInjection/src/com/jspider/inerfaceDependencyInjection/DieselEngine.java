package com.jspider.inerfaceDependencyInjection;

public class DieselEngine implements IEngine{

	@Override
	public int start() {
		System.out.println("DieselEngine start");
		return 1;
	}

}
