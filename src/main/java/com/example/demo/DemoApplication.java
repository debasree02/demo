package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@RestController
//@RequestMapping("/api")
public class DemoApplication {
//	@GetMapping("/show")
//	public String show() {
//		return "Hello";
//	}
	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
