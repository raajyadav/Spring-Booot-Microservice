package com.jspider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {

	static String url = "https://uncarried-hans-ungroupable.ngrok-free.dev/ticket/{ticketNum}";
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	 WebClient webClient = WebClient.create();
	 
	 System.out.println("request sending start...");
	 
   	 webClient.get()
	          .uri(url,1)
	          .retrieve()
	          .bodyToMono(String.class)
//	          .block();
	          .subscribe(Application::handleResponse);
	
	 System.out.println("request sending end...");
	 
	 
	}
	public static void handleResponse(String response) {
		System.out.println(response);
	}

}
