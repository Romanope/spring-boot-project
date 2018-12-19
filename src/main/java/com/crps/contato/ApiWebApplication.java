package com.crps.contato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiWebApplication.class, args);
	}
}
