package io.devfest.moviesclient.controller;


import io.devfest.moviesclient.dto.MovieDto;
import io.devfest.moviesclient.service.MovieService;
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
        return movieService.getMoviesByRating(rating);
    }
}
