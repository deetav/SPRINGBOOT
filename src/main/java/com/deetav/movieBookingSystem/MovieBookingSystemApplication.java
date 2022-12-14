package com.deetav.movieBookingSystem;

import com.deetav.movieBookingSystem.dao.MovieDao;
import com.deetav.movieBookingSystem.entities.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class MovieBookingSystemApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MovieBookingSystemApplication.class, args);
        MovieDao movieDao = ctx.getBean(MovieDao.class);
        System.out.println(movieDao);
        // i should be able to save the entity

        System.out.println("_______Creating Movie object____");
        Movie movie = new Movie();
        movie.setMovieName("Keshari");
        movie.setMovieDescription("very nice movie");
        movie.setReleaseDate(LocalDateTime.of(2019, 11, 27, 16, 55));
        movie.setCoverPhotoUrl("cover-photo-url");
        movie.setTrailerUrl("trailer-url");
        System.out.println("Movie object before storage : " + movie);

        System.out.println("___creating movie1 object___");
        Movie movie1 = new Movie();
        movie1.setMovieName("hostel");
        movie1.setMovieDescription("too much filler");
        movie1.setReleaseDate(LocalDateTime.of(2022,11,15,12,1));
        movie1.setCoverPhotoUrl("cover-photo-url");
        movie1.setTrailerUrl("trailer-url");
        System.out.println("movie1 object before storage : " + movie1);

        System.out.println("___creating movie2 object___");
        Movie movie2 = new Movie();
        movie2.setMovieName("fantastic");
        movie2.setMovieDescription("too much filler also");
        movie2.setReleaseDate(LocalDateTime.of(2021,11,14,12,1));
        movie2.setCoverPhotoUrl("cover-photo-url");
        movie2.setTrailerUrl("trailer-url");
        System.out.println("movie2 object before storage : " + movie2);


        System.out.println("___going to save movie object in the database___");
        System.out.println("___going to save movie1 object in the database___");
        System.out.println("___going to save movie2 object in the database___");
        Movie savedObject = movieDao.save(movie);
        Movie savedObject1 = movieDao.save(movie1);
        Movie savedObject2 = movieDao.save(movie2);
        System.out.println("Saved object : " + savedObject);
        System.out.println("Saved object1 : " + savedObject1);

        // I should be able to search for my favourite movie

        Movie searchedMovie = movieDao.findById(2).get();

        System.out.println("searched movie : " + searchedMovie);
        movie.setMovieDescription("updated description");
        movieDao.save(movie);
        System.out.println("Saved object : " + savedObject);
        movieDao.delete(searchedMovie);
        Movie result = movieDao.findByMovieName("fantastic");
        System.out.println("found movie by name is :"+result);
        System.out.println("Hello Spring Boot !!!");
    }

}
