package com.example.shopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShopspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopspringApplication.class, args);
	}

}
