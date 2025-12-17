package com.jspider.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.jspider.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
	
	@Autowired
	private MyUserDetailsService userDtlsService;
	
	@Autowired
	public void configurerUsers(AuthenticationManagerBuilder auth) {
		auth.userDetailsService(userDtlsService)
		    .passwordEncoder(NoOpPasswordEncoder.getInstance());
	}

	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) {
		
		http.authorizeHttpRequests( (req) ->
		   req.requestMatchers("/contact").permitAll()
		       .anyRequest()
		       .authenticated()
		).formLogin(Customizer.withDefaults());
		
		return http.build();
	}
}
