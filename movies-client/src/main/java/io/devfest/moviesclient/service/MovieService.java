package io.devfest.moviesclient.service;

import io.devfest.moviesclient.dto.MovieDto;

import java.util.List;

public interface MovieService {
    List<MovieDto> getMoviesByRating(String rating);
}
