package com.jspider.beans;

import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	private Chip chip;
	
	Robot(){
		System.out.println("Robot :: constructor");
	}
	public void doWork() {
		String type = chip.chipType();
		if(type.equals("32-Bit")) {
		  System.out.println("Performance is slow....");	
		}
		
	}

}
