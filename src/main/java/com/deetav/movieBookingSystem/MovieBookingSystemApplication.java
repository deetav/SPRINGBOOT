package com.deetav.movieBookingSystem;

import com.deetav.movieBookingSystem.dao.MovieDao;
import com.deetav.movieBookingSystem.entities.Movie;
import com.deetav.movieBookingSystem.services.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class MovieBookingSystemApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MovieBookingSystemApplication.class, args);
        MovieService movieService = ctx.getBean(MovieService.class);
        Movie movie = new Movie();
        movie.setMovieDescription("Good movie");
        movie.setMovieName("mary kom");
        movie.setDuration(120);
        movie.setReleaseDate(LocalDateTime.of(2022, 8, 7, 14, 22));
        movieService.acceptMovieDetails(movie);



        System.out.println("Hello Spring Boot !!!");
    }

}
