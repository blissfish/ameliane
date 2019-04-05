package com.example.ameliane;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmelianeApplication {


	private static final Logger logger = LoggerFactory
			.getLogger(AmelianeApplication.class);
	
	@PostConstruct
	public void logSomething() {
		logger.info("Amelia being constructed...");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AmelianeApplication.class, args);
	}
	
	@RequestMapping("/")
	public String echo(@RequestParam Map<String,String> allParams) {
		return "I'm Ameliane. How can I help you: " + allParams.entrySet();
	}

}
