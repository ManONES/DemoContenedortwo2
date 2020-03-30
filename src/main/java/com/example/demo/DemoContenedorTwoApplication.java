package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoContenedorTwoApplication {

	@GetMapping("/")
	public String welcome() {
		return "Hola al mundo de Many";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hola " + input + ", este el mundo de Many";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoContenedorTwoApplication.class, args);
	}

}
