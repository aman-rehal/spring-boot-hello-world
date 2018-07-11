package com.my.project.sprint.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldExample {

	public static final String HELLO_WORLD = "Hello World!";

	@RequestMapping("/")
	String sayHello() {
		return HELLO_WORLD;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorldExample.class, args);
	}

}