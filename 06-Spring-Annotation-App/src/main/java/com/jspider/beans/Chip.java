
package com.jspider.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	Chip(){
		System.out.println("Chip :: constructor");
	}
	
	public String chipType() {
		return "#32-Bit";
	}

}
