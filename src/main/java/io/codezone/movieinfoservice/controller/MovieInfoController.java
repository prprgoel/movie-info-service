package io.codezone.movieinfoservice.controller;

import io.codezone.movieinfoservice.models.Movie;
import io.codezone.movieinfoservice.models.MovieList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    static Map<String, Movie> movieMap = new HashMap<>();

//    static {
//        movieMap.put("Transformers", createMovie("123", "Transformers"));
//        movieMap.put("DarkKnight", createMovie("111", "Dark Knight"));
//        movieMap.put("Interstellar", createMovie("234", "Interstellar"));
//    }

    @GetMapping("/getMovies")
    public MovieList getMoviesList() {
        MovieList movieList = new MovieList();
        List<Movie> movies = new ArrayList<>();
        movies.add(createMovie("One","Transformers"));
        movies.add(createMovie("Two","Dark Knight"));
        movieList.setMovies(movies);
        return movieList;
    }

    @GetMapping("/getMoviesAsList")
    public List<Movie> getMoviesListAsList() {
        List<Movie> movies = new ArrayList<>();
        movies.add(createMovie("One","Transformers"));
        movies.add(createMovie("Two","Dark Knight"));
        return movies;
    }


    @GetMapping("/testMovie")
    public Movie getMovie() {
        return createMovie("1234","Transformers");
    }

    @GetMapping("/{movieId}")
    public Movie getMoviesList(@PathVariable("movieId") String id) {

        Map<String, Movie> movieMap = new HashMap<>();
        movieMap.put("123", createMovie("123", "Transformers"));
        movieMap.put("111", createMovie("111", "Dark Knight"));
        movieMap.put("678", createMovie("234", "Interstellar"));

        if(movieMap.containsKey(id)) {
            return movieMap.get(id);
        }

        return null;
    }

    public Movie createMovie(String movieId,String name) {
        return new Movie(movieId, name);
    }

//    @GetMapping("{movieName}")
//    public Movie getMovie(@PathVariable("movieName") String movieName) {
//
//        if()
//        movieMap.get()
//    }

}
