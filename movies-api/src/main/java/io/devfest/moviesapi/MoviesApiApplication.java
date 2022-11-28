package io.devfest.moviesapi;

import io.devfest.moviesapi.entity.Movie;
import io.devfest.moviesapi.repository.MovieRepository;
import io.devfest.moviesapi.service.MovieService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.Console;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
@Log4j2
public class MoviesApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}

	@Autowired
	MovieService movieService;

	@Override
	public void run(String... args) throws Exception {


	}
}
