package com.example.demo;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration(exclude={org.activiti.spring.boot.SecurityAutoConfiguration.class})
public class DemoApplication {
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
