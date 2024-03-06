/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.movie;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.movie.MovieService;
import com.example.movie.Movie;

@RestController
public class MovieController {

    MovieService movieService = new MovieService();

    @GetMapping("/movies")
    public ArrayList<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovie(@PathVariable("movieId") int movieId) {
        return movieService.getMovie(movieId);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updateMovie(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        return movieService.updateMovie(movieId, movie);
    }

    @DeleteMapping("/movies/{movieId}")
    public void deleteMovie(@PathVariable("movieId") int movieId) {
        movieService.deleteMovie(movieId);
    }
}