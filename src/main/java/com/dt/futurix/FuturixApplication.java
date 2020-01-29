package com.dt.futurix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FuturixApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuturixApplication.class, args);
	}

}
