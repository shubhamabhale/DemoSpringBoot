package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Controller.DemoController;

@SpringBootApplication(scanBasePackages = {"Controller","service"})

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		new DemoController();
	}

}
