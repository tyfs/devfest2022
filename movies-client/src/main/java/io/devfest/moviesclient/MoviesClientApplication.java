package io.devfest.moviesclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MoviesClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesClientApplication.class, args);
	}

}
