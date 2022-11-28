package io.devfest.moviesapi.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Film")
@Data
public class Movie {

    @Id
    private Integer film_id;

    private String title;

    @Column(name="release_year")
    private Integer year;

    private String rating;
}
