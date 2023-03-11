package com.foosball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoosBallTournamentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoosBallTournamentApplication.class, args);
		System.out.println("Server is Running!!!");
	}

}
