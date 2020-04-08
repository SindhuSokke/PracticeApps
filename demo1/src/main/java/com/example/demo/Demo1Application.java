package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@ComponentScan({"com.service"})
public class Demo1Application {
	
	@Scheduled(fixedRate=600000)
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
