package com.SpringBootNivell2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Nivel2Application {

	public static void main(String[] args) {
		SpringApplication.run(Nivel2Application.class, args);
	}
}
