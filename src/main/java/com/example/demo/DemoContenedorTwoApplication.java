package com.example.demo;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoContenedorTwoApplication {

	private static Logger LOG = LoggerFactory.getLogger(DemoContenedorTwoApplication.class);
	
	@GetMapping("/")
	public String welcome() {
		return "Hola al mundo de Many con autoescalado";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		
		
		
        int i = Integer.valueOf(input);
        int iii = 0;        
        while (true) {         
            i++;
    		
    		for (int ii = 0; ii < 10; ii++) {
    	        while (true) {
    			    iii =getRandomNumberInRange(1, 20000);
    				LOG.info("Hola Mundo " + Integer.valueOf(iii));
    	            if (iii==1974) { break;}
    	        }
    		}    		
            if (i==Integer.valueOf(input) + 20) { break;}
        }		
		
			
		
		return "Hola " + input + ", este el mundo de Many";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoContenedorTwoApplication.class, args);
	}

	private static int getRandomNumberInRange(int min, int max) {
		
		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
		
	}
	
}
