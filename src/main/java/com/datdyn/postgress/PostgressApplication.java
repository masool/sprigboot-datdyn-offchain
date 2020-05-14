package com.datdyn.postgress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.datdyn")
public class PostgressApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgressApplication.class, args);
	}

}

	