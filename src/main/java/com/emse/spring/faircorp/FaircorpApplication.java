package com.emse.spring.faircorp;

import com.emse.spring.faircorp.hello.DummyUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class FaircorpApplication {

	public static void main(String[] args) {

		SpringApplication.run(FaircorpApplication.class, "Spring");
	}

}
