package io.devfest.moviesapi.controller;


import io.devfest.moviesapi.dto.MovieDto;
import io.devfest.moviesapi.service.MovieService;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Timed
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/movies")
    public List<MovieDto> movies(@RequestParam(value = "rating", defaultValue = "PG") String rating) {
        return movieService.getMoviesByRating(rating)
                .stream().map(movie -> MovieDto.builder()
                        .id(movie.getFilm_id())
                        .title(movie.getTitle())
                        .rating(movie.getRating())
                        .year(movie.getYear())
                        .build()).collect(Collectors.toList());
    }
}
