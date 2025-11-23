package com.jspider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
	
	AppConfig(){
		System.out.println("AppConfig :: constructor");
	}
	@Bean
	public Engine getEngine() {
		Engine eng = new Engine();
		return eng;
	}

}
