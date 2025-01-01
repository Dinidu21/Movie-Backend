package dev.dinidu.movies.controller;

import dev.dinidu.movies.model.MovieModel;
import dev.dinidu.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;


    @GetMapping
    public ResponseEntity<List<MovieModel>> getMovies() {
        return new ResponseEntity<List<MovieModel>>(movieService.findAllMovies(), HttpStatus.OK);
    }
}
