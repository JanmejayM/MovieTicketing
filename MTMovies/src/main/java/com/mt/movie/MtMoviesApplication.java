package com.mt.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MtMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtMoviesApplication.class, args);
	}
	
	

}
