package com.prolim.phase3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomEventDesignApplication {
	@Autowired
	MyEventPublisher MEP;
	public static void main(String[] args) {
		SpringApplication.run(CustomEventDesignApplication.class, args);
	}

}
