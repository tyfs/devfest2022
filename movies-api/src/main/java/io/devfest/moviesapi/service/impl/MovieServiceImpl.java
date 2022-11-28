package io.devfest.moviesapi.service.impl;

import io.devfest.moviesapi.entity.Movie;
import io.devfest.moviesapi.repository.MovieRepository;
import io.devfest.moviesapi.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Override
    public List<Movie> getMoviesByRating(String rating) {
        return movieRepository.findMoviesByRating(rating);
    }
}
