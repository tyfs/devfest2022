package io.devfest.moviesclient.service.impl;

import io.devfest.moviesclient.client.MovieFeignClient;
import io.devfest.moviesclient.dto.MovieDto;
import io.devfest.moviesclient.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieFeignClient movieFeignClient;
    @Override
    public List<MovieDto> getMoviesByRating(String rating) {
        return movieFeignClient.getMoviesByRating(rating);
    }
}
