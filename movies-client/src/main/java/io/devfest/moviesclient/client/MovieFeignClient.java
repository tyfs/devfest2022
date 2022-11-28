package io.devfest.moviesclient.client;

import io.devfest.moviesclient.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "movieFeignClient", url = "http://localhost:8080")
public interface MovieFeignClient {

    @GetMapping("/movies")
    List<MovieDto> getMoviesByRating(@RequestParam String rating);


}