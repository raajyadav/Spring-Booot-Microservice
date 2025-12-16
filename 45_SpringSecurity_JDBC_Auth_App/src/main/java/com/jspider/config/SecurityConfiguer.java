package com.jspider.config;

import javax.sql.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguer {
	

	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(
	        HttpSecurity http,
	        DataSource dataSource) throws Exception {

	    AuthenticationManagerBuilder builder =
	            http.getSharedObject(AuthenticationManagerBuilder.class);

	    builder
	        .jdbcAuthentication()
	        .dataSource(dataSource)
	        .passwordEncoder(passwordEncoder());

	    return builder.build();
	}


	@Bean
	public SecurityFilterChain security(HttpSecurity http) {
		
		http.authorizeHttpRequests( (req) ->
		    req.requestMatchers("/welcome").permitAll()
		       .requestMatchers("/user").hasAnyRole("ADMIN","USER")
		       .requestMatchers("/admin").hasRole("ADMIN")
		       .anyRequest().authenticated()
		   	).formLogin(Customizer.withDefaults());
		
		return http.build();
	}
}
