package io.devfest.moviesapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieDto {
    private Integer id;
    private String title;
    private Integer year;
    private String rating;
}
