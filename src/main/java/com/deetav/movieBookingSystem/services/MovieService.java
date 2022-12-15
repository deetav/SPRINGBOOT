package com.deetav.movieBookingSystem.services;

import com.deetav.movieBookingSystem.entities.Movie;
import com.deetav.movieBookingSystem.exceptions.MovieDetailsNotFoundException;

import java.util.List;

// This interface will methods supported by MovieService
public interface MovieService {

    // It should be able to take movie request and save it to database
    public Movie acceptMovieDetails(Movie movie);

    // Get movie details by movie id
    public Movie getMovieById(int id) throws MovieDetailsNotFoundException;

    //update the details of existing movie
    public Movie updateMovieDetails(int id, Movie movie) throws MovieDetailsNotFoundException;

    // Delete a movie
    public boolean deleteMovie(int id) throws MovieDetailsNotFoundException;

    //get the list of all the movies present
    public List<Movie> getAllMoviesDetails();
}
