package com.jspider.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
	
	@Bean
	public InMemoryUserDetailsManager configureUsers() {
		
		UserDetails adminUser = User.withDefaultPasswordEncoder()
				                    .username("raj")
				                    .password("raj@123")
				                    .authorities("ADMIN")
				                    .build();
		
		UserDetails normalUser = User.withDefaultPasswordEncoder()
				                     .username("nitesh")
				                     .password("nitesh@123")
				                     .authorities("USER")
				                     .build();
		
		return new InMemoryUserDetailsManager(adminUser, normalUser);
	}

	@Bean
	public SecurityFilterChain securiyConfig(HttpSecurity http) {
		
		http.authorizeHttpRequests( (req) ->
		       req.requestMatchers("/contact").permitAll()
		           .anyRequest()
		           .authenticated()
				).formLogin(Customizer.withDefaults());
		
	  return	http.build();
	}
}
