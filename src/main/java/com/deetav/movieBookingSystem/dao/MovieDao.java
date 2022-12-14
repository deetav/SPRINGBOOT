package com.deetav.movieBookingSystem.dao;

import com.deetav.movieBookingSystem.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie, Integer> {

    // I want the support for search based on the movie name

    public Movie findByMovieName(String movieName);

}
