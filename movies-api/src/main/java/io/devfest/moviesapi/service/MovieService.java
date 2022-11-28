package io.devfest.moviesapi.service;

import io.devfest.moviesapi.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieService {
    List<Movie> getMoviesByRating(String rating);
}
