package com.deetav.movieBookingSystem.services.impl;

import com.deetav.movieBookingSystem.dao.MovieDao;
import com.deetav.movieBookingSystem.entities.Movie;
import com.deetav.movieBookingSystem.exceptions.MovieDetailsNotFoundException;
import com.deetav.movieBookingSystem.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    // To talk with the database I need the help of movieDao
    @Autowired
    private MovieDao movieDao;

    @Override
    public Movie acceptMovieDetails(Movie movie) {
        // with the help of movieDao save it the movie received as an argument into the db
        return movieDao.save(movie);
    }

    @Override
    public Movie getMovieById(int id) throws MovieDetailsNotFoundException {
        // fetch the movie details based on the id
        return movieDao.findById(id).orElseThrow(() -> new MovieDetailsNotFoundException("Movie not found for the provided id" + id));
    }

    @Override
    public Movie updateMovieDetails(int id, Movie movie) throws MovieDetailsNotFoundException {
        return null;
    }

    @Override
    public boolean deleteMovie(int id) throws MovieDetailsNotFoundException {
        return false;
    }

    @Override
    public List<Movie> getAllMoviesDetails() {
        return null;
    }
}
