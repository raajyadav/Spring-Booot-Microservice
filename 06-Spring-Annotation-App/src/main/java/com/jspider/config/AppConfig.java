package com.jspider.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = { "com.jspider", "com.tcs" } )
public class AppConfig {

}
