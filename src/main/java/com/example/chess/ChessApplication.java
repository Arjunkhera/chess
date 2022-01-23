package com.example.chess;

import com.example.chess.service.impl.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessApplication {

	@Autowired
	Session session;

	public static void main(String[] args) {
		SpringApplication.run(ChessApplication.class, args);
	}

}
