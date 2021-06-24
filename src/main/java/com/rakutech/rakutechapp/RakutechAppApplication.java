package com.rakutech.rakutechapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutechAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutechAppApplication.class, args);
	}

	@GetMapping("/hello")
	public String register(@RequestParam(value = "myName", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}

}
