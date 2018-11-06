package com.dream;

import javax.xml.ws.RequestWrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DreamSpringBootApplication {
	
	@RequestMapping("/test")
	String home() {
		return "Hello Word";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DreamSpringBootApplication.class, args);
	}
}
